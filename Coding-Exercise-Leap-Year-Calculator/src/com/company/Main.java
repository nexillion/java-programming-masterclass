package com.company;

public class Main
{

    public static void main(String[] args)
    {
        boolean isItLeapYear = Methods.isLeapYear(1600);
        System.out.println("1600 is a leap year = " + isItLeapYear);

        isItLeapYear = Methods.isLeapYear(-1600);
        System.out.println("-1600 is a leap year = " + isItLeapYear);

        isItLeapYear = Methods.isLeapYear(2000);
        System.out.println("2000 is a leap year = " + isItLeapYear);

        isItLeapYear = Methods.isLeapYear(2017);
        System.out.println("2017 is a leap year = " + isItLeapYear);
    }
}
