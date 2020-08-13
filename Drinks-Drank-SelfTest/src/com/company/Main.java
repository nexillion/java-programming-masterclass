package com.company;

import java.util.Scanner;


//-------------------------------------------------------------------------
public class Main
{
    public static void main(String[] args)
    {
        Scanner userChoiceBoolean = new Scanner(System.in);
        System.out.println("What is your age?");
        int userAge = userChoiceBoolean.nextInt();
        boolean userAge18Plus = false;
        // boolean userAge18Plus = (userAge >= 18) ? true : false;
        // String userAge18PlusString = userAge >= 18 ? "Yes" : "No";

        if(userAge >= 18)
        {
            userAge18Plus = true;
        }
        else
        {
            userAge18Plus = false;
        }

        if (userAge>90)
        {
            System.out.println("So you are born in "+(2020-userAge)+"? ... Okay.");
        }
        if (userAge18Plus)
        {
            myClassOne.myMethodClassOne();
        }else
        {
            myClassTwo.myMethodClassTwo();
        }
        System.out.printf("\n\n >>The End<<");
    }
}
//-------------------------------------------------------------------------
class myClassOne
{
    static void myMethodClassOne()
    {
        int drinksDrank = 0;
        while(drinksDrank<=6)
        {
            Scanner drinks = new Scanner(System.in);
            System.out.println("Do you want a drink? (true/false)");
            boolean userInput = drinks.nextBoolean();
            if (userInput)
            {
                System.out.println("You consumed some alcohol.");
                drinksDrank++;
                System.out.println("You have drank "+drinksDrank+" drinks by now.");
            }else
            {
                System.out.println("You leave.");
                break;
            }
            if(drinksDrank==7)
            {
                System.out.println("You blacked out from too much drink.");
            }

        }
    }
}
//-------------------------------------------------------------------------
class myClassTwo
{
    static void myMethodClassTwo()
    {
        System.out.printf("You are too young to consume alcohol! \nGo home!");
    }
}