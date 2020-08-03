package com.company;
import java.util.Scanner;
public class Main
{

    public static void main(String[] args)
    {
        Scanner firstVar = new Scanner(System.in);
        System.out.println("Enter your first number");
        int firstVariable = firstVar.nextInt();

        Scanner secondVar = new Scanner(System.in);
        System.out.println("Enter your second number");
        int secondVariable = secondVar.nextInt();

        int outputMethod = calcMethod(firstVariable,secondVariable); // primer za izprashtane na stoinost na promenlivi
        System.out.println("(" + firstVariable + "*" + secondVariable + ")" + "-" + secondVariable + "=" + outputMethod);
       outputMethod = calcMethod(4,6); // primer za izprashtane na statichni stoinosti
        System.out.println("(4 * 6) - 6 = " + outputMethod);
    }

    public static int calcMethod(int firstVariable, int secondVariable)
    {
        firstVariable = (secondVariable * firstVariable) - secondVariable;
        return firstVariable;
    }
}
