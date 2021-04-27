package com.company;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DataSource
{
    public final static String DB_NAME = FileSystems.getDefault().getSeparator() + "music.db";
    public static final String CONNECTION_PATH = "jdbc:sqlite:" + getPath();

    public static final String TABLE_ALBUMS = "albums";
    public static final String COLUMN_ALBUM_ID = "_id";
    public static final String COLUMN_ALBUM_NAME = "name";
    public static final String COLUMN_ALBUM_ARTIST = "artist";
    // when working with larger DataBases it's easier on the processor to just check index than to check every string
    // in every column for a match
    public static final int INDEX_ALBUM_ID = 1;
    public static final int INDEX_ALBUM_NAME = 2;
    public static final int INDEX_ALBUM_ARTIST = 3;

    public static final String TABLE_ARTISTS = "artists";
    public static final String COLUMN_ARTIST_ID = "_id";
    public static final String COLUMN_ARTIST_NAME = "name";
    public static final int INDEX_ARTIST_ID = 1;
    public static final int INDEX_ARTIST_NAME = 2;

    public static final String TABLE_SONGS = "songs";
    public static final String COLUMN_SONG_ID = "_id";
    public static final String COLUMN_SONG_TRACK = "track";
    public static final String COLUMN_SONG_TITLE = "title";
    public static final String COLUMN_SONG_ALBUM = "album";
    public static final int INDEX_SONG_ID = 1;
    public static final int INDEX_SONG_TRACK = 2;
    public static final int INDEX_SONG_TITLE = 3;
    public static final int INDEX_SONG_ALBUM = 4;

    public static final int ORDER_BY_NONE = 1;
    public static final int ORDER_BY_ASC = 2;
    public static final int ORDER_BY_DESC = 3;

    private Connection connection;

    public static String getPath()
    {
        Path path = FileSystems.getDefault().getPath("").toAbsolutePath();
        return path.toString();
    }

    public boolean open()
    {
        try
        {
            connection = DriverManager.getConnection(CONNECTION_PATH + DB_NAME);
            return true;
        }
        catch(SQLException e)
        {
            System.out.println("Error opening DataBase:\n" + e.getMessage());
            return false;
        }
    }

    public void close()
    {
        try
        {
            if(connection != null)
            {
                connection.close();
            }
        }
        catch(SQLException e)
        {
            System.out.println("Error closing DataBase:\n" + e.getMessage());
        }
    }

    public List<Artists> queryArtists(int sortOrder)
    {
        StringBuilder stringBuilder = new StringBuilder("SELECT * FROM ");
        stringBuilder.append(TABLE_ARTISTS);

        if(sortOrder != ORDER_BY_NONE)
        {
            stringBuilder.append(" ORDER BY " + COLUMN_ARTIST_NAME + " COLLATE NOCASE ");

            if(sortOrder == ORDER_BY_ASC)
            {
                stringBuilder.append("ASC");
            }
            else
            {
                stringBuilder.append("DESC");
            }
        }

        try(Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(stringBuilder.toString()))
        {
            List<Artists> listOfArtists = new ArrayList<Artists>();

            while(resultSet.next())
            {
                Artists artists = new Artists();
                artists.setId(resultSet.getInt(INDEX_ARTIST_ID));
                artists.setName(resultSet.getString(INDEX_ARTIST_NAME));

                listOfArtists.add(artists);
            }
            return listOfArtists;
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
            return null;
        }
    }
}