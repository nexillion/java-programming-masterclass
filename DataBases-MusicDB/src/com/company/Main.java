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

        List<Artists> artists = datasource.queryArtists(DataSource.ORDER_BY_ASC);
            if(artists == null)
            {
                System.out.println("No artists queried.");
            }

            try
            {
                for(Artists artist : artists)
                {
                    System.out.println("_ID = " + artist.getId() + ", Artist Name = " + artist.getName());
                }
            } catch (NullPointerException ignored) {}

            System.out.println();

            List<String> albumsFromArtist = datasource.queryAlbumsFromArtist("'Iron Maiden'", DataSource.ORDER_BY_ASC);

            try
            {
                for(String album : albumsFromArtist)
                {
                    System.out.println(album);
                }
            } catch (NullPointerException ignored) {}

            datasource.close();
    }
}