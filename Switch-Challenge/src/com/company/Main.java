package com.company;

public class Main {

    public static void main(String[] args)
    {
/*        char switchVariable = '8';

        switch (switchVariable)
        {
            case 'A':
                System.out.println("CharVariable was A.");
                break;

            case 'B':
                System.out.println("CharVariable was B.");
                break;

            case 'C':
                System.out.println("CharVariable was C.");
                break;

            case 'D': case 'F':
                System.out.println("CharVariable was D or F.");
                System.out.println("It was " + switchVariable);
                break;

            default:
                System.out.println("A, B, C, D or E was not typed.");
        }*/

        String StringVariable = "June";

        switch (StringVariable)
        {
            case "January":
                System.out.println("It's January");
                break;

            case "February":
                System.out.println("It's February");
                break;

            case "March":
                System.out.println("It's March");
                break;

            case "April":
                System.out.println("It's April");
                break;

            case "May":
                System.out.println("It's May");
                break;

            case "June":
                System.out.println("It's June");
                break;

            default:
                System.out.printf("The input was not one of the first 6 months of the year.");
                break;
        }
    }
}
