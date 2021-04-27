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

    public static final String TABLE_ARTISTS = "artists";
    public static final String COLUMN_ARTIST_ID = "_id";
    public static final String COLUMN_ARTIST_NAME = "name";
    // when working with larger DataBases it's easier on the machine to just check column index than to check
    // every string in every column for a match
    public static final int INDEX_ARTIST_ID = 1;
    public static final int INDEX_ARTIST_NAME = 2;

    public static final String TABLE_SONGS = "songs";
    public static final String COLUMN_SONG_TRACK = "track";
    public static final String COLUMN_SONG_TITLE = "title";
    public static final String COLUMN_SONG_ALBUM = "album";

    public static final int ORDER_BY_NONE = 1;
    public static final int ORDER_BY_ASC = 2;

    // SELECT albums.name FROM albums INNER JOIN artists ON albums.artists = artists._id WHERE artists.name = <...>
    public static final String QUERY_ALBUMS_BY_ARTIST_TEMPLATE = "SELECT " + TABLE_ALBUMS + "." + COLUMN_ALBUM_NAME +
            " FROM " + TABLE_ALBUMS + " INNER JOIN " + TABLE_ARTISTS + " ON " + TABLE_ALBUMS + "."
            + COLUMN_ALBUM_ARTIST + " = " + TABLE_ARTISTS + "." + COLUMN_ARTIST_ID + " WHERE " + TABLE_ARTISTS + "."
            + COLUMN_ARTIST_NAME + " = ";

    // <...> ORDER BY albums.name COLLATE NOCASE <ASC/DESC/...>
    public static final String QUERY_ALBUMS_BY_ARTIST_SORT = " ORDER BY " + TABLE_ALBUMS + "." + COLUMN_ALBUM_NAME
            + " COLLATE NOCASE ";

    // SELECT artists.name, albums.name, songs.track FROM songs INNER JOIN albums ON songs.album = albums._id
    // INNER JOIN artists ON albums.artist = artists._id WHERE songs.title = <...>
    public static final String QUERY_ARTIST_FOR_SONG_TEMPLATE = "SELECT " + TABLE_ARTISTS + "." + COLUMN_ARTIST_NAME
            + ", " + TABLE_ALBUMS + "." + COLUMN_ALBUM_NAME + ", " + TABLE_SONGS + "." + COLUMN_SONG_TRACK + " FROM "
            + TABLE_SONGS + " INNER JOIN " + TABLE_ALBUMS + " ON " + TABLE_SONGS + "." + COLUMN_SONG_ALBUM + " = "
            + TABLE_ALBUMS + "." + COLUMN_ALBUM_ID + " INNER JOIN " + TABLE_ARTISTS + " ON " + TABLE_ALBUMS + "."
            + COLUMN_ALBUM_ARTIST + " = " + TABLE_ARTISTS + "." + COLUMN_ARTIST_ID + " WHERE " + TABLE_SONGS + "."
            + COLUMN_SONG_TITLE + " = ";

    // <...> ORDER BY artists.name, albums.name COLLATE NOCASE <ASC/DESC/...>
    public static final String QUERY_ARTIST_FOR_SONG_SORT = " ORDER BY " + TABLE_ARTISTS + "." + COLUMN_ARTIST_NAME
            + ", " + TABLE_ALBUMS + "." + COLUMN_ALBUM_NAME + " COLLATE NOCASE ";

    public static final String TABLE_ARTIST_SONG_VIEW = "artistView";

    // CREATE VIEW IF NOT EXISTS artistView AS SELECT artists.name, albums.name AS album, songs.track, songs.title
    // FROM songs INNER JOIN albums ON songs.album = albums._id INNER JOIN artists ON albums.artist = artists._id

    public static final String CREATE_ARTIST_FOR_SONG_VIEW = "CREATE VIEW IF NOT EXISTS " + TABLE_ARTIST_SONG_VIEW
            + " AS SELECT " + TABLE_ARTISTS + "." + COLUMN_ARTIST_NAME + ", " + TABLE_ALBUMS + "." + COLUMN_ALBUM_NAME
            + " AS " + COLUMN_SONG_ALBUM + ", " + TABLE_SONGS + "." + COLUMN_SONG_TRACK + ", " + TABLE_SONGS + "."
            + COLUMN_SONG_TITLE + " FROM " + TABLE_SONGS + " INNER JOIN " + TABLE_ALBUMS + " ON " + TABLE_SONGS + "."
            + COLUMN_SONG_ALBUM + " = " + TABLE_ALBUMS + "." + COLUMN_ALBUM_ID + " INNER JOIN " + TABLE_ARTISTS
            + " ON " + TABLE_ALBUMS + "." + COLUMN_ALBUM_ARTIST + " = " + TABLE_ARTISTS + "." + COLUMN_ARTIST_ID
            + " ORDER BY " + TABLE_ARTISTS + "." + COLUMN_ARTIST_NAME + ", " + TABLE_ALBUMS + "." + COLUMN_ALBUM_NAME
            + ", " + TABLE_SONGS + "." + COLUMN_SONG_TRACK;

    // SELECT name, album, track FROM artistView WHERE title =
    public static final String QUERY_SONG_FROM_VIEW_TEMPLATE =  "SELECT " + COLUMN_ARTIST_NAME + ", " + COLUMN_SONG_ALBUM
            + ", " + COLUMN_SONG_TRACK + " FROM " + TABLE_ARTIST_SONG_VIEW + " WHERE " + COLUMN_SONG_TITLE + " = ";

    private Connection connection;

    public static String getPath()
    {
        Path path = FileSystems.getDefault().getPath("").toAbsolutePath();
        return path.toString();
    }

    public static String appendAscOrDesc(int sortOrder)
    {
        if(sortOrder == ORDER_BY_ASC)
        {
            return "ASC";
        }
        return "DESC";
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
            stringBuilder.append(" ORDER BY " + COLUMN_ARTIST_NAME + " COLLATE NOCASE " + appendAscOrDesc(sortOrder));
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

    public List<String> queryAlbumsFromArtist(String artistName, int sortOrder)
    {
        StringBuilder stringBuilder = new StringBuilder(QUERY_ALBUMS_BY_ARTIST_TEMPLATE + artistName);

        if(sortOrder != ORDER_BY_NONE)
        {
            stringBuilder.append(QUERY_ALBUMS_BY_ARTIST_SORT + appendAscOrDesc(sortOrder));
        }
        // System.out.println(stringBuilder.toString() + "\n");

        try(Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(stringBuilder.toString()))
        {
            List<String> albums = new ArrayList<String>();
            while(resultSet.next())
            {
                // add first column of the returned information
                // there is only 1 column in this case so it's safe to hard code
                albums.add(resultSet.getString(1));
            }
            return albums;
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public List<SongArtist> queryArtistForSong(String songName, int sortOrder)
    {
        StringBuilder stringBuilder = new StringBuilder(QUERY_ARTIST_FOR_SONG_TEMPLATE + songName
                + QUERY_ALBUMS_BY_ARTIST_SORT + appendAscOrDesc(sortOrder));

        // System.out.println(stringBuilder.toString() + "\n");

        try(Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(stringBuilder.toString()))
        {
            List<SongArtist> songArtists = new ArrayList<SongArtist>();

            while(resultSet.next())
            {
                // columns are as mentioned: artists.name | albums.name | songs.track
                SongArtist songArtist = new SongArtist
                        (resultSet.getString(1),
                        resultSet.getString(2),
                        resultSet.getInt(3));

                songArtists.add(songArtist);
            }
            return songArtists;
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public void extractMETADataSongs()
    {
        System.out.println();
        String string = "SELECT * FROM " + TABLE_SONGS;

        try(Statement statement = connection.createStatement(); ResultSet resultSet = statement.executeQuery(string))
        {
            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();

            for(int i = 1; i<= columnCount; i++)
            {
                System.out.println("Column " + i + " in the songs table is named " + metaData.getColumnName(i));
            }
            System.out.println();
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }

    public int getCount(String table)
    {
        String string = "SELECT COUNT(*) AS count FROM " + table;

        try(Statement statement = connection.createStatement(); ResultSet resultSet = statement.executeQuery(string))
        {
            int count = resultSet.getInt("count");
            return count;
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
            return -1;
        }
    }

    public boolean createViewForSongArtists()
    {
        try(Statement statement = connection.createStatement())
        {
            statement.execute(CREATE_ARTIST_FOR_SONG_VIEW);
            return true;
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public List<SongArtist> querySongFromView(String title)
    {
        StringBuilder stringBuilder = new StringBuilder(QUERY_SONG_FROM_VIEW_TEMPLATE + title);

        // System.out.println(stringBuilder.toString() + "\n");
        System.out.println();

        try(Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(stringBuilder.toString()))
        {
            List<SongArtist> songArtists = new ArrayList<>();

            while(resultSet.next())
            {
                SongArtist songArtist = new SongArtist
                        (resultSet.getString(1),
                        resultSet.getString(2),
                        resultSet.getInt(3));

                songArtists.add(songArtist);
            }
            return songArtists;
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
            return null;
        }
    }
}