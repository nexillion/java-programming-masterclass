package com.company;

import java.util.List;

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

        List<Artists> artists = datasource.queryArtists();
            if(artists == null)
            {
                System.out.println("No artists queried.");
            }

            for(Artists artist : artists)
            {
                System.out.println("_ID = " + artist.getId() + ", Artist Name = " + artist.getName());
            }
            datasource.close();
    }
}