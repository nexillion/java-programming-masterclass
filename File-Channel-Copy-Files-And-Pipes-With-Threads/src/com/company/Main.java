package com.company;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Pipe;

public class Main
{
    public static void main(String[] args)
    {
            try
            {
                Pipe pipe = Pipe.open(); // make pipe
                Runnable writer = new Runnable()
                {
                    @Override
                    public void run()
                    {
                        try
                        {
                            Pipe.SinkChannel sinkChannel = pipe.sink();
                            // setup sink channel that will pass the information to other end of pipe
                            // pipes are unidirectional
                            ByteBuffer buffer = ByteBuffer.allocate(56);

                            for(int i=0; i<10; i++)
                            {
                                String currentTime = "The time is: " + System.currentTimeMillis();
                                // get string with current time

                                buffer.put(currentTime.getBytes());
                                // string is written to the buffer
                                buffer.flip();

                                while(buffer.hasRemaining())
                                {
                                    sinkChannel.write(buffer);
                                    // buffer is sent down the pipe
                                }

                                buffer.flip();
                                Thread.sleep(1000);
                                // waits a second between strings sent down the pipe
                            }

                        }
                        catch(Exception e)
                        {
                            e.printStackTrace();
                        }
                    }
                };

                Runnable reader = new Runnable()
                {
                    @Override
                    public void run()
                    {
                        try
                        {
                            Pipe.SourceChannel sourceChannel = pipe.source();
                            // setup source channel to receive information from first end of pipe
                            ByteBuffer buffer = ByteBuffer.allocate(56);

                            for(int i=0; i<10; i++)
                            {
                                int bytesRead = sourceChannel.read(buffer);

                                byte[] timeString = new byte[bytesRead];
                                buffer.flip();

                                buffer.get(timeString);
                                System.out.println("Reader Thread: " + new String(timeString));

                                buffer.flip();
                                Thread.sleep(1000);
                            }
                        }
                        catch(Exception e)
                        {
                            e.printStackTrace();
                        }
                    }
                };
                // make new threads for read/write so that they can work independently from main and one another
                new Thread(writer).start();
                new Thread(reader).start();
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
        }
    }