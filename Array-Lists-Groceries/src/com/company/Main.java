package com.company;

import java.util.Scanner;

public class Main
{
    private static GroceryList groceryList = new GroceryList();
    private static Scanner scanner1 = new Scanner(System.in);
    private static Scanner scanner2 = new Scanner(System.in);

    public static void main(String[] args)
    {
        boolean exitMenu = false;
        int choice = 0;

        printInstructions();

        while(!exitMenu)
        {
            System.out.println("Enter your choice. ");
            choice = scanner1.nextInt();

            switch (choice)
            {
                case 0:
                    printInstructions();
                    break;

                case 1:
                    groceryList.printList();
                    break;

                case 2:
                    addItem();
                    break;

                case 3:
                    changeItem();
                    break;

                case 4:
                    System.out.println("Type the position of the item that you want to remove.");

                    int itemIndex = scanner1.nextInt();
                    itemIndex--;

                    groceryList.removeItem(itemIndex);
                    break;

                case 5:
                    System.out.println("Type what you are looking for.");
                    int indexItem = groceryList.findItem(scanner2.nextLine());

                    if(indexItem >= 0)
                    {
                        System.out.println("The item you are looking for is on the list on line " + (indexItem + 1));
                    }
                    else
                    {
                        System.out.println("Item is not on the list.");
                    }
                    break;

                case 6:
                    exitMenu = true;
                    System.out.println("Go away now!");
                    break;
            }
        }
    }

    public static void printInstructions()
    {
        System.out.println("\nPress");
        System.out.println("\t 0 - To print choice instructions.");
        System.out.println("\t 1 - To print the list of groceries.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To change an item on the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item on the list.");
        System.out.println("\t 6 - Quit.");
    }

    public static void addItem()
    {
        System.out.println("Type what you want to add to the list.");
        groceryList.addItem(scanner2.nextLine());
    }

    public static void changeItem()
    {
        System.out.println("Type the position of the item that you want to replace.");

        int itemPosition = scanner1.nextInt();
        itemPosition--;

        System.out.println("Type what you want to change " + groceryList.getItem(itemPosition) + " to.");
        groceryList.replaceItem(itemPosition, scanner2.nextLine());
    }
}
