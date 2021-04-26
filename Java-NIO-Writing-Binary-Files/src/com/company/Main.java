package com.company;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Main
{
    public static void main(String[] args)
    {
        try(FileOutputStream binFile = new FileOutputStream("data.dat");
            FileChannel binChannel = binFile.getChannel())
        {
            byte[] outputBytes = "Hello World!".getBytes();
            ByteBuffer buffer = ByteBuffer.wrap(outputBytes);
            int numBytes = binChannel.write(buffer);
            System.out.println("numBytes written was: " + numBytes);

            ByteBuffer intBuffer = ByteBuffer.allocate(Integer.BYTES);
            intBuffer.putInt(245);
            intBuffer.flip();
            // reset buffer position - w/o this the next line will start reading after what is saved in the buffer - effectively reading null
            numBytes = binChannel.write(intBuffer);
            System.out.println("numBytes written was: " + numBytes);

            intBuffer.flip();
            // numBytes = binChannel.write(intBuffer); goes through the whole buffer - meaning if buffer isn't flipped, it overflows
            intBuffer.putInt(-98765);
            intBuffer.flip();
            // same as first comment
            numBytes = binChannel.write(intBuffer);
            System.out.println("numBytes written was: " + numBytes);

        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}