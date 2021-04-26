package com.company;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.sql.*;

public class Main {

    public static void main(String[] args)
    {
        try
        {
            Path path = FileSystems.getDefault().getPath(".").toAbsolutePath();
            Connection connection = DriverManager.getConnection("jdbc:sqlite:" + path + "\\testDB.db");

            Statement statement = connection.createStatement();
            statement.execute("CREATE TABLE IF NOT EXISTS contacts " +
                    "(name TEXT, phone INTEGER, email TEXT)");

//            statement.execute("INSERT INTO contacts (name, phone, email)" +
//                    "VALUES ('Nikolay', 79846513, email@email.org)");
//            statement.execute("INSERT INTO contacts (name, phone, email)" +
//                    "VALUES ('Joe', 11111, 'joe@email.org')");
//            statement.execute("INSERT INTO contacts (name, phone, email)" +
//                    "VALUES ('Frederico', 12345678, 'fred@email.org')");
//            statement.execute("INSERT INTO contacts (name, phone, email)" +
//                    "VALUES ('CarrotMan', 852, 'carrot@email.org')");

//            statement.execute("UPDATE contacts SET phone = 22222 WHERE name = 'Joe'");

//            statement.execute("DELETE FROM contacts WHERE name = 'Frederico'");

            statement.execute("SELECT * FROM contacts");
            ResultSet result = statement.getResultSet();
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
}
