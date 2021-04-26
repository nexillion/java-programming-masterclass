package com.company;

import java.nio.file.FileSystems;
import java.nio.file.Path;


public class Main
{
    public static void main(String[] args)
    {
            DataSource datasource = new DataSource();
            if (!datasource.open())
            {
                System.out.println("Can't open datasource");
                return;
            }
            datasource.close();
    }


}