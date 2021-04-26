package com.company;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
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
            binChannel.write(buffer);

            ByteBuffer intBuffer = ByteBuffer.allocate(Integer.BYTES);
            intBuffer.putInt(245);
            intBuffer.flip();
            binChannel.write(intBuffer);

            intBuffer.flip();
            intBuffer.putInt(-98765);
            intBuffer.flip();
            binChannel.write(intBuffer);

            //                  The "put" method can also be used like this:
            // byte[] outputBytes = "Hello World!".getBytes();
            // buffer.put(outputBytes).putInt(245).putInt(-98765);

            RandomAccessFile ra = new RandomAccessFile("data.dat", "rwd");
            FileChannel channel = ra.getChannel();

            buffer.flip();
            channel.read(buffer);

            if(buffer.hasArray())
            {
                System.out.println(new String(buffer.array()));
            }

            //                      Absolute read - does the same as Relative read
            intBuffer.flip();
            channel.read(intBuffer);
            System.out.println(intBuffer.getInt(0));
            intBuffer.flip();
            channel.read(intBuffer);
            System.out.println(intBuffer.getInt(0));

            //                      Relative read - does the same as Absolute read
            // intBuffer.flip();
            // channel.read(intBuffer);
            // intBuffer.flip();
            // System.out.println(intBuffer.getInt());
            // intBuffer.flip();
            // channel.read(intBuffer);
            // intBuffer.flip();
            // System.out.println(intBuffer.getInt());

            channel.close();
            ra.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
