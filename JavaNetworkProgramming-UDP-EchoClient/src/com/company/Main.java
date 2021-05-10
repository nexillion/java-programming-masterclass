package com.company;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketTimeoutException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        try
        {
            InetAddress address = InetAddress.getLocalHost();  // getByName()
            DatagramSocket datagramSocket = new DatagramSocket();

            Scanner scanner = new Scanner(System.in);
            String echoString;

            do {
                System.out.println("Enter string to be echoed: " );
                echoString = scanner.nextLine();

                byte[] buffer = echoString.getBytes();

                DatagramPacket packet = new DatagramPacket(buffer, buffer.length, address, 5000);
                datagramSocket.send(packet);

                buffer = new byte[50];
                packet = new DatagramPacket(buffer, buffer.length);

                datagramSocket.receive(packet);
                System.out.println("Text received is: " + new String(buffer, 0, packet.getLength()));

            }
            while(!echoString.equals("exit"));
        }
        catch(SocketTimeoutException e)
        {
            System.out.println("The socket timed out");
        }
        catch(IOException e)
        {
            System.out.println("Client error: " + e.getMessage());
        }
    }
}