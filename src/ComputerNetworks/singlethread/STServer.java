package ComputerNetworks.singlethread;

import java.io.*;
import java.net.*;

public class STServer {
    private static final int PORT = 34522;

    public static void main(String[] args) {
        try (ServerSocket server = new ServerSocket(PORT)) {
            while (true) {
                try (
                    Socket socket = server.accept(); // accepting a new client
                    DataInputStream input = new DataInputStream(socket.getInputStream());
                    DataOutputStream output = new DataOutputStream(socket.getOutputStream())
                ) {

                        for (int i = 0; i < 5; i++) {

                        String msg = input.readUTF(); // reading the next client message
                        output.writeUTF(msg); // resend it to the client
                        System.out.println("message echoed");
                        
                        }
                    
                    
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}