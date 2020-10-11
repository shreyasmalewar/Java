package ComputerNetworks.UDP;


import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPServer {
  public final static int SERVICE_PORT=1024;
 
  public static void main(String[] args) throws IOException{
    try{

      DatagramSocket serverSocket = new DatagramSocket(SERVICE_PORT);

      byte[] receivingDataBuffer = new byte[1024];
      byte[] sendingDataBuffer = new byte[1024];
      
      DatagramPacket inputPacket = new DatagramPacket(receivingDataBuffer, receivingDataBuffer.length);
      System.out.println("Waiting for a client to connect...");
      
      serverSocket.receive(inputPacket);
      
      String receivedData = new String(inputPacket.getData());
      System.out.println("Sent from the client: "+receivedData);
      
    
      sendingDataBuffer = receivedData.toUpperCase().getBytes();
      
    
      InetAddress senderAddress = inputPacket.getAddress();
      int senderPort = inputPacket.getPort();
      

      DatagramPacket outputPacket = new DatagramPacket(
        sendingDataBuffer, sendingDataBuffer.length,
        senderAddress,senderPort
      );
      
      serverSocket.send(outputPacket);

      serverSocket.close();
    }
    catch (SocketException e){
      e.printStackTrace();
    }
  }
}
