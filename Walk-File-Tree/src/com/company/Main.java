package com.company;

import java.io.IOException;
import java.nio.file.*;

public class Main
{
    public static void main(String[] args)
    {
        Path pathFileTree = FileSystems.getDefault().getPath("FileTree");
        try
        {
            Files.walkFileTree(pathFileTree, new PrintNames());
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
