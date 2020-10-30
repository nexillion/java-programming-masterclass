package com.company;

import java.util.ArrayList;

public class MobilePhone
{
    private ArrayList<String> arrayListNumbers = new ArrayList<String>();
    private ArrayList<String> arrayListFrontEnd = new ArrayList<String>();
    private ArrayList<String> arrayListNames = new ArrayList<String>();

    private int indexCounter;

    public MobilePhone()
    {
        this.indexCounter = -1;
    }

    public void menu()
    {
        System.out.println("\t 0. Print menu options.");
        System.out.println("\t 1. Show existing contacts.");
        System.out.println("\t 2. Add a new contact.");
        System.out.println("\t 3. Change contact name.");
        System.out.println("\t 4. Remove an existing contact.");
        System.out.println("\t <Any Other> Quit");
    }

    public void listArray()
    {
        for(int i = 0; i < arrayListFrontEnd.size(); i++)
        {
            System.out.println((i + 1) + ". " + arrayListFrontEnd.get(i));
        }
    }

    public void addContact(String contactNumber, String contactName)
    {
        this.indexCounter++;

        this.arrayListNumbers.add(contactNumber);
        this.arrayListNames.add(contactName);

        String temp = arrayListNumbers.get(this.indexCounter);

        this.arrayListFrontEnd.add(contactName + " - " + temp);
    }

    public void changeName(int index, String name)
    {
        arrayListNames.set(index, name);

        String temp1 = arrayListNames.get(index); // takes name from arraysListNames
        String temp2 = arrayListNumbers.get(index); // takes number from arraysListBackEnd

        arrayListFrontEnd.set(index, temp1 + " - " + temp2); // combines them so they are ready to be listed
    }

    public void intOrString(int contactIndex)
    {
        boolean flag = isString(contactIndex);

        if(flag)
        {
            String contactInformation = String.valueOf(contactIndex);

            if(arrayListNumbers.indexOf(contactInformation) != -1)
            {
                removeContact(contactInformation);
            }
            else
            {
                System.out.println("Entered number does not exist.\nNothing has been changed.");
            }
        }
        else
        {
            removeContact(contactIndex);
        }
    }

    private void removeContact(String contactInformation)
    {
        int index = arrayListNumbers.indexOf(contactInformation);

        arrayListNumbers.remove(contactInformation);
        arrayListNames.remove(index);
        arrayListFrontEnd.remove(index);

        this.indexCounter--;
    }

    private void removeContact(int contactIndex)
    {
        if(contactIndex > 0)
        {
            contactIndex--;

            arrayListNumbers.remove(contactIndex);
            arrayListNames.remove(contactIndex);
            arrayListFrontEnd.remove(contactIndex);

            this.indexCounter--;
        }
        else
        {
            System.out.println("Enter a valid index.\nReturned to menu.");
        }
    }

    public void nameExists(String name)
    {
        if(arrayListNames.contains(name))
        {
            removeContactByName(name);
        }
        else
        {
            System.out.println("Name does not exist in the phonebook.\nNothing has been changed.");
        }
    }

    private void removeContactByName(String name)
    {
        int index = arrayListNames.indexOf(name);

        arrayListNumbers.remove(index);
        arrayListNames.remove(index);
        arrayListFrontEnd.remove(index);

        this.indexCounter--;
    }



    //-----------------------------------------------------------------------------------------------------------------

    private boolean isString(int inputNumber)
    {
        if(inputNumber > 999)
        {
            return true;
        }
        return false;
    }

    public int getArrayListSize()
    {
        return arrayListFrontEnd.size();
    }

    public String getArrayName(int index)
    {
        return arrayListNames.get(index);
    }

    public int getIndexCounter()
    {
        return indexCounter;
    }
}