package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        MobilePhone mobilePhone = new MobilePhone();

        boolean exit = false;

        mobilePhone.menu();

        while(!exit)
        {
            System.out.println("Enter Number:");

            boolean hasNextInt = scanner.hasNextInt();
            int input = -1;

            if(hasNextInt)
            {
                input = scanner.nextInt();
            }
            else
            {
                exit = true;
            }

            switch (input)
            {
                case 0:
                    mobilePhone.menu();
                    break;

                case 1:
                    mobilePhone.listArray();
                    break;

                case 2:
                    scanner.nextLine(); // java interaction scanner int -> scanner String

                    System.out.println("Type contact number.");
                    String contactNumber = scanner.nextLine();

                    System.out.println("Type contact name.");
                    String contactName = scanner.nextLine();

                    mobilePhone.addContact(contactNumber, contactName);
                    break;

                case 3:
                    System.out.println("Enter the index of what you want to edit.");
                    boolean hasInt = scanner.hasNextInt();

                    if(hasInt)
                    {
                        int temp = scanner.nextInt();

                        temp--; // visually the indexes start form 1, list counts from 0

                        if(temp > -1 && temp < mobilePhone.getArrayListSize())
                        {
                            System.out.println("Change name " + mobilePhone.getArrayName(temp) + " to:");

                            scanner.nextLine(); // java interaction scanner int -> scanner String
                            mobilePhone.changeName(temp, scanner.nextLine());
                        }
                        else
                        {
                            System.out.println("Invalid index number.");
                        }
                    }
                    else
                    {
                        System.out.println("Returning to menu.");
                    }
                    break;

                case 4:
                    System.out.println("Enter contact to be removed.");

                    boolean isInt = scanner.hasNextInt();

                    if(isInt)
                    {
                        int temp = scanner.nextInt();
                        mobilePhone.intOrString(temp);
                    }
                    else
                    {
                        scanner.nextLine(); // java interaction scanner int -> scanner String
                        String nameToDelete = scanner.nextLine();

                        mobilePhone.nameExists(nameToDelete);
                    }
                    break;

                default:
                    exit = true;
                    break;
            }
        }
    }
}
