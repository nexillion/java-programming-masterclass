package com.company;

public class Methods
{
    public static void printMegaBytesAndKiloBytes(int kiloBytes)
    {
        if(kiloBytes>=0)
        {
            int megaBytes = kiloBytes / 1024;
            int kiloBytesLeft = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + kiloBytesLeft + " KB");
        }
        else
        {
            System.out.println("Invalid Value.");
        }
    }
}
