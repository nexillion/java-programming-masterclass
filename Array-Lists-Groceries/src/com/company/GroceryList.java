package com.company;

import java.util.ArrayList;

public class GroceryList
{
    private ArrayList<String> myArrayList = new ArrayList<String>();

    public void addItem(String itemToAdd)
    {
        myArrayList.add(itemToAdd);
    }

    public void removeItem(int positionOfItemToRemove)
    {
        myArrayList.remove(positionOfItemToRemove);
    }

    public void replaceItem(int positionOfItemToReplace, String replacementItem)
    {
        myArrayList.set(positionOfItemToReplace, replacementItem);
    }

    public void printList()
    {
        for(int i = 0; i < myArrayList.size(); i++)
        {
            System.out.println((i + 1) + ". " + myArrayList.get(i));
        }
    }

    public String getItem(int itemToGet)
    {
        return myArrayList.get(itemToGet);
    }

    public int findItem(String itemToFind)
    {
        //boolean itemFound = myArrayList.contains(itemToFind);
        return myArrayList.indexOf(itemToFind);
    }
}
