package ComputerNetworks.multithread;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class MTServer {
    private static final int PORT = 34522;

    public static void main(String[] args) {
        try (ServerSocket server = new ServerSocket(PORT)) {
            while (true) {
                Session session = new Session(server.accept());
                session.start(); // it does not block this thread
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Session extends Thread {
    private final Socket socket;

    public Session(Socket socketForClient) {
        this.socket = socketForClient;
    }

    public void run() {
        try (
            DataInputStream input = new DataInputStream(socket.getInputStream());
            DataOutputStream output = new DataOutputStream(socket.getOutputStream())
        ) {
            for (int i = 0; i < 5; i++) {
                String msg = input.readUTF();
                output.writeUTF(msg);
                System.out.println("Message echo" + ++i);
            }
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}