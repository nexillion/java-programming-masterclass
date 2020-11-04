package com.company;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main
{
    private static LinkedList<String> getName = new LinkedList<>();

    public static void main(String[] args)
    {
        LinkedList<String> linkedListNames = new LinkedList<>();
        setNames();

        boolean continueLoop = true;
        String newName = null;

        int counter = 0;
        while(continueLoop)
        {
            if (counter < getName.size()) // when last available index is reached the last name stays the same, which in turn breaks the loop later
            {
                newName = getName.get(counter);
            }

            continueLoop = addInOrder(linkedListNames, newName);

            counter++;
        }

        for(int i = 0; i < linkedListNames.size(); i++)
        {
            System.out.println(linkedListNames.get(i));
        }
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newName)
    {
        ListIterator<String> listIterator = linkedList.listIterator();

        while(listIterator.hasNext())
        {
            int compare = listIterator.next().compareTo(newName);
            // listIterator.next() is used to actually start the linked list, as before that the list is not pointing to the first link
            // is 0 if equal | is 1 if newName is alphabetically before current listLink
            // | -1 if newName is after current listLink

            if(compare == 0)
            {
                // name already exists in linkedList, meaning the last index of getNames is reached
                return false;
            }
            else if(compare > 0)
            {
                listIterator.previous();
                listIterator.add(newName);
               return true;
            }
            else if(compare < 0)
            {
                // do nothing
            }
        }
        // if name is the last - add it here
        listIterator.add(newName);
        return true;
    }

    private static void setNames()
    {
        getName.add("AMIE");
        getName.add("CHRISTIN");
        getName.add("ALENE");
        getName.add("ZOE");
        getName.add("ISABELL");
        getName.add("CARMAN");
        getName.add("IVORY");
        getName.add("THEDA");
        getName.add("JOELLEN");
        getName.add("EULALIA");
        getName.add("LORRI");
        getName.add("JOVITA");
        getName.add("ELENORA");
        getName.add("SERINA");
        getName.add("MARKITA");
        getName.add("SAVANNA");
        getName.add("SHAVONNE");
        getName.add("LAVONIA");
        getName.add("SILVANA");
        getName.add("JOLYN");
        getName.add("CONCEPTION");
        getName.add("CLELIA");
        getName.add("LYNNA");
        getName.add("PHILIP");
    }
}
