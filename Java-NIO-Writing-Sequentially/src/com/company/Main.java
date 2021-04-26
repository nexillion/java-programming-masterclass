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
        try (FileOutputStream binFile = new FileOutputStream("data.dat");
             FileChannel binChannel = binFile.getChannel())
        {
            ByteBuffer buffer = ByteBuffer.allocate(100); // allocating bytes to use manually (100 is an overkill in this case)

//            read(ByteBuffer) - reads bytes beginning at the channel's current position, and after the read,
//                               updates the position accordingly.
//                               Note that now we're talking about the channel's position, not the byte buffer's position.
//                               Of course, the bytes will be placed into the buffer starting at its current position.
//
//            write(ByteBuffer) - the same as read, except it writes. There's one exception.
//                              If a datasource is opened in APPEND mode, then the first write will take place starting
//                              at the end of the datasource, rather than at position 0. After the write, the position
//                              will be updated accordingly.
//
//            position() - returns the channel's position.
//            position(long) - sets the channel's position to the passed value.
//            truncate(long) - truncates the size of the attached datasource to the passed value.
//            size() - returns the size of the attached datasource

            byte[] outputBytes = "Hello World!".getBytes();
            buffer.put(outputBytes);

            long int1Pos = outputBytes.length; // we won't be writing the strings in reverse but they still have a place in the buffer
            buffer.putInt(245);

            long int2Pos = int1Pos + Integer.BYTES;
            buffer.putInt(-98765);

            byte[] outputBytes2 = "Nice to meet you".getBytes();
            buffer.put(outputBytes2);

            long int3Pos = int2Pos + Integer.BYTES + outputBytes2.length; // same as previous comment
            buffer.putInt(1000);

            buffer.flip();
            binChannel.write(buffer);

            RandomAccessFile ra = new RandomAccessFile("data.dat", "rwd");
            FileChannel channel = ra.getChannel();

            ByteBuffer readBuffer = ByteBuffer.allocate(Integer.BYTES);

            channel.position(int3Pos);
            channel.read(readBuffer);
            readBuffer.flip();
            System.out.println("int3 = " + readBuffer.getInt());
            readBuffer.flip();

            channel.position(int2Pos);
            channel.read(readBuffer);
            readBuffer.flip();
            System.out.println("int2 = " + readBuffer.getInt());
            readBuffer.flip();

            channel.position(int1Pos);
            channel.read(readBuffer);
            readBuffer.flip();
            System.out.println("int1 = " + readBuffer.getInt());
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
