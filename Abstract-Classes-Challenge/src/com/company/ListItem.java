package com.company;

public abstract class ListItem
{
    protected ListItem nextLink;
    protected ListItem previousLink;
    protected Object value;

    public ListItem(Object value)
    {
        this.value = value;
    }

    abstract ListItem next();
    abstract ListItem setNext(ListItem item);
    abstract ListItem previous();
    abstract ListItem setPrevious(ListItem item);
    abstract int compareTo(ListItem item);

    public Object getValue()
    {
        return value;
    }
}
