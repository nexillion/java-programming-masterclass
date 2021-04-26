package com.company;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataSource
{

    public final static String DB_NAME = FileSystems.getDefault().getSeparator() + "music.db";
    public static final String CONNECTION_PATH = "jdbc:sqlite:" + getPath();

    public static final String TABLE_ALBUMS = "albums";
    public static final String COLUMN_ALBUM_ID = "_id";
    public static final String COLUMN_ALBUM_NAME = "name";
    public static final String COLUMN_ALBUM_ARTIST = "artist";

    public static final String TABLE_ARTISTS = "artists";
    public static final String COLUMN_ARTIST_ID = "_id";
    public static final String COLUMN_ARTIST_NAME = "name";

    public static final String TABLE_SONGS = "songs";
    public static final String COLUMN_SONG_TRACK = "track";
    public static final String COLUMN_SONG_TITLE = "title";
    public static final String COLUMN_SONG_ALBUM = "album";

    private Connection connection;

    public boolean open()
    {
        try
        {
            System.out.println(getPath());
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

    public static String getPath()
    {
        Path path = FileSystems.getDefault().getPath("").toAbsolutePath();
        return path.toString();
    }
}