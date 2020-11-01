package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class TheBigBank
{
    Sredec sredec = new Sredec();
    Botonec botonec = new Botonec();
    Lulin lulin = new Lulin();
    OvcheKupel ovcheKupel = new OvcheKupel();
    SeloYana seloYana = new SeloYana();

    private ArrayList<String> arrayListBranches = new ArrayList<>();

    private void addDefaultBranches()
    {
        arrayListBranches.add("Sredec");
        arrayListBranches.add("Botonec");
        arrayListBranches.add("Lulin");
        arrayListBranches.add("OvcheKupel");
        arrayListBranches.add("Selo Yana");
    }

    public void bankIntro()
    {
        addDefaultBranches();

        System.out.println("\nBank control interface:\n");
        listBranches();
        System.out.println("\nEnter the index of the branch you want to access.");

        Scanner scanner = new Scanner(System.in);

        boolean exitMenu = false;

        while(!exitMenu)
        {
            System.out.println("Choose bank branch: ");

            if(scanner.hasNextInt())
            {
                switch(scanner.nextInt())
                {
                    case 0:
                        sredec.branchIntro();
                        break;

                    case 1:
                        botonec.branchIntro();
                        break;

                    case 2:
                        lulin.branchIntro();
                        break;

                    case 3:
                        ovcheKupel.branchIntro();
                        break;

                    case 4:
                        seloYana.branchIntro();
                        break;

                    default:
                        exitMenu = true;
                        break;
                }
            }
            else
            {
                exitMenu = true;
            }
        }
    }

    private void listBranches()
    {
        for(int i = 0; i < arrayListBranches.size(); i++)
        {
            System.out.println((i + 1) + ". " + arrayListBranches.get(i));
        }
    }
}
