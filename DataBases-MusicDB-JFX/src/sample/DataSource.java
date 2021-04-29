package sample;

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
    public static final String COLUMN_ALBUM_NAME = "name";
    public static final String COLUMN_ALBUM_ARTIST = "artist";

    public static final String TABLE_ARTISTS = "artists";
    public static final String COLUMN_ARTIST_ID = "_id";
    public static final String COLUMN_ARTIST_NAME = "name";
    // when working with larger DataBases it's easier on the machine to just check column index than to check
    // every string in every column for a match
    public static final int INDEX_ARTIST_ID = 1;
    public static final int INDEX_ARTIST_NAME = 2;

    public static final int ORDER_BY_NONE = 1;
    public static final int ORDER_BY_ASC = 2;

    // SELECT * FROM albums WHERE artist = ? ORDER BY name COLLATE NOCASE
    public static final String PREPARED_QUERY_ALBUMS_BY_ARTIST_ID = "SELECT * FROM " + TABLE_ALBUMS +
            " WHERE " + COLUMN_ALBUM_ARTIST + " = ? ORDER BY " + COLUMN_ALBUM_NAME + " COLLATE NOCASE";

    // UPDATE artists SET name = ? WHERE _id = ?
    public static final String PREPARED_UPDATE_ARTIST_NAME = "UPDATE " + TABLE_ARTISTS + " SET " +
            COLUMN_ARTIST_NAME + " = ? WHERE " + COLUMN_ARTIST_ID + " = ?";

    private Connection connection;

    private PreparedStatement preparedQueryAlbumsByArtistId;
    private PreparedStatement preparedUpdateArtistName;

    private static DataSource instance = new DataSource();
    // constructor
    private DataSource() {}

    public static DataSource getInstance()
    {
        return instance;
    }

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

            preparedQueryAlbumsByArtistId = connection.prepareStatement(PREPARED_QUERY_ALBUMS_BY_ARTIST_ID);
            preparedUpdateArtistName = connection.prepareStatement(PREPARED_UPDATE_ARTIST_NAME);

            return true;
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public void close()
    {
        try
        {
            if(preparedQueryAlbumsByArtistId != null
                    || preparedUpdateArtistName != null)
            {
                try
                {
                    preparedQueryAlbumsByArtistId.close();
                    preparedUpdateArtistName.close();
                } catch (NullPointerException ignored) {}
            }

            if(connection != null)
            {
                connection.close();
            }
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
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
                try
                {
                    Thread.sleep(10);
                }
                catch (InterruptedException ignored) {}

                Artists artists = new Artists();

                artists.setId((resultSet.getInt(INDEX_ARTIST_ID)));
                artists.setName((resultSet.getString(INDEX_ARTIST_NAME)));

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

    public List<Albums> queryAlbumsForArtistId(int id)
    {
        try
        {
            preparedQueryAlbumsByArtistId.setInt(1, id);
            ResultSet resultSet = preparedQueryAlbumsByArtistId.executeQuery();

            List<Albums> albums = new ArrayList<Albums>();
            while(resultSet.next())
            {
                Albums album = new Albums();
                album.setId(resultSet.getInt(1));
                album.setName(resultSet.getString(2));
                album.setArtistId(resultSet.getInt(3));

                albums.add(album);
            }
            return albums;
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public boolean updateArtistName(int id, String newName)
    {
        try
        {
            preparedUpdateArtistName.setString(1, newName);
            preparedUpdateArtistName.setInt(2, id);

            int affectedRecords = preparedUpdateArtistName.executeUpdate();
            return affectedRecords == 1;

        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
            return false;
        }
    }
}