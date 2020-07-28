package com.company;
import java.util.Scanner;
//tova e import komanda za scanner, koito pozvolqva da se chete user input
public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number (integer).");
        int usernumber = input.nextInt();
        System.out.println("You entered the following number: "+usernumber);
    }
}
