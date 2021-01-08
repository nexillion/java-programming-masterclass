package toDoList;

import javafx.collections.FXCollections;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.List;

public class ToDoData
{
    private static ToDoData instance = new ToDoData();
    private static String filename = "ToDoListNames.txt";

    private List<ToDoItem> toDoItemsList;
    private DateTimeFormatter formatter;

    private ToDoData() // makes it so that you cannot call a new instance of this class
    {
        formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    }

    public void loadToDoItems() throws IOException
    {
        toDoItemsList = FXCollections.observableArrayList();
        Path path = Paths.get(filename);
        BufferedReader bufferedReader = Files.newBufferedReader(path);

        String input = null;

        try
        {
            while((input = bufferedReader.readLine()) != null)
            {
                String[] itemPieces = input.split("\t");

                String shortDescription = itemPieces[0];
                String details = itemPieces[1];

                String dateString = itemPieces[2]; // gets date
                LocalDate date = LocalDate.parse(dateString, formatter); // formats date

                ToDoItem toDoItem = new ToDoItem(shortDescription, details, date); // make instance
                toDoItemsList.add(toDoItem); // pass to List
            }
        }
        finally
        {
            if(bufferedReader != null) // avoids exception if nothing is in saved file
            {
                bufferedReader.close();
            }
        }
    }

    public void storeToDoItems() throws IOException
    {
        Path path = Paths.get(filename);
        BufferedWriter bufferedWriter = Files.newBufferedWriter(path);

        try
        {
            Iterator<ToDoItem> iterator = toDoItemsList.iterator();

            while (iterator.hasNext())
            {
                ToDoItem item = iterator.next();
                bufferedWriter.write(String.format("%s\t%s\t%s", // the line does not end here!
                        // this sets the format of the string saved by .write()
                        // %s is the actual string \t is used by the bufferedReader to distinguish where a string ends
                        item.getShortDescription(), // saves string to first %s
                        item.getDetails(), // saves string to second %s
                        item.getDeadline().format(formatter))); // saves the formatted string to third %s

                bufferedWriter.newLine();
            }
        }
        finally
        {
            if(bufferedWriter != null) // avoids exception if nothing is saved
            {
                bufferedWriter.close();
            }
        }
    }

    public static ToDoData getInstance()
    {
        return instance;
    }

    public List<ToDoItem> getToDoItemsList()
    {
        return toDoItemsList;
    }

    public void addToDoItemsList(ToDoItem item)
    {
        toDoItemsList.add(item);
    }

    public void setToDoItemsList(List<ToDoItem> toDoItemsList)
    {
        this.toDoItemsList = toDoItemsList;
    }
}
