package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class InterfaceBank
{
    private String branchName;

    private ArrayList<String> arrayListNames;
    private ArrayList<Double> arrayListCurrency;

    private Scanner scanner = new Scanner(System.in);

    public InterfaceBank(String branchName)
    {
        this.branchName = branchName;
        this.arrayListNames = new ArrayList<>();
        this.arrayListCurrency =  new ArrayList<>();
    }

    public void branchIntro()
    {
        System.out.println("Welcome to TheBigBank branch " + this.branchName + "!" +
                "\n\n\t1. List existing accounts." +
                "\n\t2. Add new account." +
                "\n\t3. Remove existing account.");

        branchSwitch();
    }

    private void branchSwitch()
    {
        boolean exitMenu = false;

        while(!exitMenu)
        {
            System.out.println("\nMake your choice.");
            if(scanner.hasNextInt())
            {
                switch(scanner.nextInt())
                {
                    case 1:
                        listAccounts();
                        break;

                    case 2:
                        addAccount();
                        break;

                    case 3:
                        deleteAccount();
                        break;

                    default:
                        exitMenu = true;
                        break;
                }
            }
        }
    }

    private void addAccount()
    {
        System.out.println("Enter customer name.");

        scanner.nextLine();
        String name = scanner.nextLine();

        arrayListNames.add(name);
        System.out.println("Enter starting capital for customer " + name + ".");

        arrayListCurrency.add(scanner.nextDouble());
    }

    private void listAccounts()
    {
        System.out.println("Listing accounts for branch " + this.branchName + ".");

        if(arrayListNames == null)
        {
            System.out.println("No accounts found.");
        }
        else
        {
            for(int i = 0; i < arrayListNames.size(); i++)
            {
                System.out.println((i + 1) + ". " + arrayListNames.get(i) + " - " + arrayListCurrency.get(i));
            }
        }
    }

    private void deleteAccount()
    {
        System.out.println("Choose what you want to delete from:");
        listAccounts();

        if(scanner.hasNextInt())
        {
            int temp = scanner.nextInt() - 1;

            if(temp < arrayListNames.size())
            {
                arrayListCurrency.remove(temp);
                arrayListNames.remove(temp);
            }
        }
    }
}
