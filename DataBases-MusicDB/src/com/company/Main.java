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

            List<String> albumsFromArtist = datasource.queryAlbumsFromArtist("'Iron Maiden'",
                    DataSource.ORDER_BY_ASC);

            try
            {
                for(String album : albumsFromArtist)
                {
                    System.out.println(album);
                }
            } catch (NullPointerException ignored) {}

            System.out.println();

            List<SongArtist> songArtists = datasource.queryArtistForSong("'Rat Salad'",
                    DataSource.ORDER_BY_ASC);

            try
            {
                for(SongArtist artist : songArtists)
                {
                    System.out.println("Artist = " + artist.getArtistName()
                            + " | Album = " + artist.getAlbumName() + " | Track = " + artist.getTrack());
                }
            } catch (NullPointerException ignored) {}

            datasource.extractMETADataSongs();

            int count = datasource.getCount(DataSource.TABLE_SONGS);
            System.out.println("Number of songs in DataBase: " + count);

            datasource.createViewForSongArtists();

            datasource.close();
    }
}