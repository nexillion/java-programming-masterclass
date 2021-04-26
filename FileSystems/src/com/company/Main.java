package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class Main
{
    public static void main(String[] args)
    {
        // prints working directory location
        Path path = FileSystems.getDefault().getPath("");
        System.out.println(path.toAbsolutePath());

        System.out.print("\n");

        // prints file contents
        path = FileSystems.getDefault().getPath("destinyCopyPasta.txt");
        System.out.println(path.toAbsolutePath());
        printFile(path);

        path = FileSystems.getDefault().getPath("Dir1" + File.separator + "Dir2" + File.separator + "text.txt");
        // this line can also be written as:
        // path = FileSystems.getDefault().getPath("Dir1/Dir2/text.txt"); for Unix based machines and
        // path = FileSystems.getDefault().getPath("Dir1\\Dir2\\text.txt"); for Windows
        // however using File.separator will ensure the code works on every computer

        System.out.print("\n");

        System.out.println(path.toAbsolutePath());
        printFile(path);

        // copy file
        try
        {
            Path sourceFile = FileSystems.getDefault().getPath("Dir1" + File.separator + "Dir2", "text.txt");
            Path copyFile = FileSystems.getDefault().getPath("Dir1", "copyOfText.txt");
            // java won't object even if you create a variable with a location of an unexisting file
            Files.copy(sourceFile, copyFile);
            // creates the new file called "copyOfText.txt" (in this case) and copies the content of "text.txt"
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

        // move file
        try
        {
            Path fileToMove = FileSystems.getDefault().getPath("Dir1", "copyOfText.txt");
            Path destination = FileSystems.getDefault().getPath("", "movedCopyOfText.txt");
            Files.move(fileToMove, destination);
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

        // delete file
        try
        {
            Path fileToDelete = FileSystems.getDefault().getPath("", "movedCopyOfText.txt");
            Files.deleteIfExists(fileToDelete);
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

        // get basic attributes
        try
        {
            // set path to existing file
            path = FileSystems.getDefault().getPath("Dir1" + File.separator + "Dir2" + File.separator + "text.txt");

            BasicFileAttributes attributes = Files.readAttributes(path, BasicFileAttributes.class);
            System.out.println("Size =  " + attributes.size());
            System.out.println("Last modified =  " + attributes.lastModifiedTime());
            System.out.println("Created = " + attributes.creationTime());
            System.out.println("Is directory = " + attributes.isDirectory());
            System.out.println("Is regular file = " + attributes.isRegularFile());
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        System.out.print("\n");

        // create filter instance
        DirectoryStream.Filter<Path> filter = new DirectoryStream.Filter<Path>()
        {
            // set filter accept settings
            public boolean accept(Path path)
            {
                // return true; // - this will list everything in the directory
                // return (Files.isDirectory(path)); // - this will only list directory files
                return (Files.isRegularFile(path)); // - this will only list non-directory files
            }
        };

        path = FileSystems.getDefault().getPath("Dir1" + File.separator + "Dir2");
        try (DirectoryStream<Path> contents = Files.newDirectoryStream(path, filter))
        {
            for (Path file : contents)
            {
                System.out.println(file.getFileName());
            }
        }
        catch (IOException | DirectoryIteratorException e)
        {
            System.out.println(e.getMessage());
        }

        System.out.print("\n");
        int i = 0;

        // lists all drives operating on the PC
        Iterable<FileStore> stores = FileSystems.getDefault().getFileStores();
        for(FileStore store : stores)
        {
            System.out.println("Drive " + i + " = " + store);
            i++;
        }

        System.out.print("\n");

        // the following lists all available drives
        // that includes non-storage (empty DVD drives etc.)
        Iterable<Path> rootPaths = FileSystems.getDefault().getRootDirectories();
        for(Path counter : rootPaths)
        {
            System.out.println(counter);
        }
    }

    private static void printFile(Path path)
    {
        try(BufferedReader fileReader = Files.newBufferedReader(path))
        {
            String line;
            while((line = fileReader.readLine()) != null)
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
