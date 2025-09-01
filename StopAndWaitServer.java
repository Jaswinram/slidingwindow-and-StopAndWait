import java.net.*;
import java.util.*; 

public class StopAndWaitServer {
    public static void main(String[] args) throws Exception {
        DatagramSocket serverSocket = new DatagramSocket(9876);
        byte[] receiveData = new byte[1024];
        byte[] sendData;

        Scanner sc = new Scanner(System.in);  
        System.out.println("Server is running...");

        while (true) {
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            serverSocket.receive(receivePacket);
            String sentence = new String(receivePacket.getData(), 0, receivePacket.getLength());
            InetAddress clientIP = receivePacket.getAddress();
            int clientPort = receivePacket.getPort();

            System.out.println("\nReceived Frame: " + sentence);
            System.out.print("Approve NAK for this frame? (yes/no): ");
            String choice = sc.nextLine().trim().toLowerCase();

            if (choice.equals("yes")) {
                sendData = "NAK".getBytes();
                System.out.println("Sending NAK for: " + sentence);
            } else {
                sendData = "ACK".getBytes();
                System.out.println("Sending ACK for: " + sentence);
            }

            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, clientIP, clientPort);
            serverSocket.send(sendPacket);
        }
    }
}
