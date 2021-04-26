package com.company;

import java.io.IOException;
import java.nio.file.*;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        try
        {
            Path dataPath = FileSystems.getDefault().getPath("data.txt");

            Files.write(dataPath, "\nLine 4".getBytes("UTF-8"), StandardOpenOption.APPEND); // writes bytes in file

            List<String> lines = Files.readAllLines(dataPath); // reads all lines from file
            for(String line : lines)
            {
                System.out.println(line);
            }

        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
