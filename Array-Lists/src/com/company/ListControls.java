package com.company;

import java.util.ArrayList;

public class ListControls
{
    private ArrayList<String> myArrayList = new ArrayList<String>(); // Create new Array List

    public void addItem(String itemToAdd)
    {
        myArrayList.add(itemToAdd);
    }

    public void removeItem(int positionInList)
    {
        myArrayList.remove(positionInList);
    }

    public void modifyItem(int positionInList, String modifiedValue)
    {
        myArrayList.set(positionInList, modifiedValue);
    }

    public void getItem(int positionInList)
    {
        myArrayList.get(positionInList);
    }

    public void getAllItems()
    {
        for(int i = 0; i < myArrayList.size(); i++)
        {
            System.out.println((i + 1) + ". " + myArrayList.get(i));
        }
    }

    public void findItem(String itemToFind)
    {
        boolean itemExists = myArrayList.contains(itemToFind); // boolean will be true if itemToFind exists in the list
        int indexNumberOfItem = myArrayList.indexOf(itemToFind); // int will turn into the index number of the searched item - if it does not exist it will be set to -1
    }
}
