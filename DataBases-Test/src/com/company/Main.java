package com.company;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.sql.*;

public class Main
{
    final static String DB_NAME = FileSystems.getDefault().getSeparator() + "testDB.db";
    final static String CONNECTION_PATH = "jdbc:sqlite:" + getPath();
    final static String TABLE_CONTACTS = "contacts";
    final static String COLUMN_NAME = "name";
    final static String COLUMN_PHONE = "phone";
    final static String COLUMN_EMAIL = "email";

    public static void main(String[] args)
    {
        try
        {
            Connection connection = DriverManager.getConnection(CONNECTION_PATH + DB_NAME);

            Statement statement = connection.createStatement();
            statement.execute("CREATE TABLE IF NOT EXISTS " + TABLE_CONTACTS +
                    "(" + COLUMN_NAME + " TEXT, " + COLUMN_PHONE + " INTEGER, " + COLUMN_EMAIL + " TEXT)");

//            addToTable(statement, "'PotatoFarmer'", 122112, "'potatoes@mail.com'");

            ResultSet result = statement.executeQuery("SELECT * FROM contacts");
            while(result.next())
            {
                System.out.println(result.getString("name") + " || " +
                        result.getInt("phone") + " || " +
                        result.getString("email"));
            }

            result.close();
            statement.close();
            connection.close();
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }

    public static void addToTable(Statement statement, String nameToAdd, int numberToAdd, String mailToAdd) throws SQLException
    {
        statement.execute("INSERT INTO " + TABLE_CONTACTS + " (" + COLUMN_NAME + ", " + COLUMN_PHONE + ", "
                + COLUMN_EMAIL + ")" + "VALUES (" + nameToAdd + ", " + numberToAdd + ", " + mailToAdd + ")");
    }

    public static String getPath()
    {
        Path path = FileSystems.getDefault().getPath("").toAbsolutePath();
        return path.toString();
    }
}
