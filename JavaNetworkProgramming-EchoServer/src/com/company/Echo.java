package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Echo extends Thread
{
    private Socket socket;

    public Echo(Socket socket)
    {
        this.socket = socket;
    }

    @Override
    public void run()
    {
        try
        {
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            System.out.println("Client Connected.");

            while(true)
            {
                String echoString = input.readLine();
                if(echoString.equals("exit"))
                {
                    break;
                }
                output.println("Server Reply: " + echoString);
            }
        }
        catch(IOException e)
        {
            System.out.println("Server.Echo Exception: " + e.getMessage());
        }
        finally
        {
            try
            {
                socket.close();
            } catch(IOException ignored) { }
        }
    }
}