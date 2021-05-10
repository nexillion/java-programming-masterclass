package com.company;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Main
{
    public static void main(String[] args)
    {
        try
        {
            DatagramSocket socket = new DatagramSocket(5000);

            while(true)
            {
                byte[] buffer = new byte[50];
                DatagramPacket datagramPacket = new DatagramPacket(buffer, buffer.length);
                socket.receive(datagramPacket);

                System.out.println("Text received is: " + new String(buffer, 0, datagramPacket.getLength()));

                String returnString = "echo: " + new String(buffer, 0, datagramPacket.getLength());
                buffer = returnString.getBytes();
                InetAddress address = datagramPacket.getAddress();
                int port = datagramPacket.getPort();

                datagramPacket = new DatagramPacket(buffer, buffer.length, address, port);
                socket.send(datagramPacket);
            }
        }
        catch(SocketException e)
        {
            System.out.println("SocketException: " + e.getMessage());
        }
        catch(IOException e)
        {
            System.out.println("IOException: " + e.getMessage());
        }
    }
}