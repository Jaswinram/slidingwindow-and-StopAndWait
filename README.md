# Network Protocols Simulation

This project implements simulations of two fundamental network protocols: **Stop-and-Wait** and **Sliding Window**. These protocols are used for reliable data transmission over unreliable networks. The implementations include both client and server components for each protocol.

## Files

- `StopAndWaitServer.java`: UDP server for the Stop-and-Wait protocol. Receives frames from the client, allows manual approval of ACK/NAK responses, and sends acknowledgments back.
- `stopandwaitclient.java`: UDP client for the Stop-and-Wait protocol. Sends frames to the server, waits for ACK/NAK, and resends frames if necessary.
- `slidingwindowserver.java`: TCP server for the Sliding Window protocol. Receives frames in windows, processes them, and sends cumulative acknowledgments.
- `slidingwindowclient.java`: TCP client for the Sliding Window protocol. Sends frames in sliding windows, waits for acknowledgments, and advances the window accordingly.

## Requirements

- Java Development Kit (JDK) installed on your system.
- Basic understanding of network protocols (optional, but helpful).

## How to Run

### Stop-and-Wait Protocol

1. Compile the server:
   ```
   javac StopAndWaitServer.java
   ```

2. Compile the client:
   ```
   javac stopandwaitclient.java
   ```

3. Run the server in one terminal:
   ```
   java StopAndWaitServer
   ```

4. Run the client in another terminal:
   ```
   java stopandwaitclient
   ```

5. Follow the prompts in the client to send messages. The server will ask for approval of ACK/NAK for each frame.

### Sliding Window Protocol

1. Compile the server:
   ```
   javac slidingwindowserver.java
   ```

2. Compile the client:
   ```
   javac slidingwindowclient.java
   ```

3. Run the server in one terminal:
   ```
   java slidingwindowserver
   ```

4. Run the client in another terminal:
   ```
   java slidingwindowclient
   ```

5. Enter the window size and number of frames when prompted by the client.

## Usage

- **Stop-and-Wait**: Simulates a simple reliable transmission where each frame is acknowledged before sending the next. The server allows manual intervention for ACK/NAK decisions.
- **Sliding Window**: Demonstrates pipelined transmission where multiple frames can be sent before receiving acknowledgments, improving efficiency.

## Notes

- The Stop-and-Wait implementation uses UDP for simplicity and to simulate potential packet loss.
- The Sliding Window implementation uses TCP for reliable transmission.
- Ensure both server and client are running on the same machine or adjust IP addresses accordingly.
- This is a simulation for educational purposes and may not handle all real-world network scenarios.

## Contributing

Feel free to improve the implementations or add more protocols!

## License

This project is for educational purposes. Use at your own discretion.
