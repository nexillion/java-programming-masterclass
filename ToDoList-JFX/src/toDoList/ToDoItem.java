package toDoList;

import java.time.LocalDate;

public class ToDoItem
{
    private String shortDescription;
    private String details;
    private LocalDate deadline;

    public ToDoItem(String shortDescription, String details, LocalDate deadline)
    {
        this.shortDescription = shortDescription;
        this.details = details;
        this.deadline = deadline;
    }

    @Override
    public String toString()
    {
        return shortDescription;
    }

    public String getShortDescription()
    {
        return shortDescription;
    }

    public String getDetails()
    {
        return details;
    }

    public LocalDate getDeadline()
    {
        return deadline;
    }
}
