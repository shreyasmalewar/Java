package ComputerNetworks.UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPClient{

  public final static int SERVICE_PORT = 1024;
  
  public static void main(String[] args) throws IOException{
    try{

      DatagramSocket clientSocket = new DatagramSocket();
      

      InetAddress IPAddress = InetAddress.getByName("localhost");

      byte[] sendingDataBuffer = new byte[1024];
      byte[] receivingDataBuffer = new byte[1024];
      
 
      String sentence = "Hello from UDP client";
      sendingDataBuffer = sentence.getBytes();
      
      DatagramPacket sendingPacket = new DatagramPacket(sendingDataBuffer,sendingDataBuffer.length,IPAddress, SERVICE_PORT);
 
      clientSocket.send(sendingPacket);
 
      DatagramPacket receivingPacket = new DatagramPacket(receivingDataBuffer,receivingDataBuffer.length);
      clientSocket.receive(receivingPacket);
 
      String receivedData = new String(receivingPacket.getData());
      System.out.println("Sent from the server: "+receivedData);
      
       clientSocket.close();
    }
    catch(SocketException e) {
      e.printStackTrace();
    }
  }
}