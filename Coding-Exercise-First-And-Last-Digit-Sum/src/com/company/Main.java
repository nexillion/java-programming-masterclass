package com.company;

public class Main {

    public static void main(String[] args)
    {
        int outputInt = Methods.sumFirstAndLastDigit(252);
        System.out.println("Returned Int Value = " + outputInt);

        outputInt = Methods.sumFirstAndLastDigit(257);
        System.out.println("Returned Int Value = " + outputInt);

        outputInt = Methods.sumFirstAndLastDigit(0);
        System.out.println("Returned Int Value = " + outputInt);

        outputInt = Methods.sumFirstAndLastDigit(5);
        System.out.println("Returned Int Value = " + outputInt);

        outputInt = Methods.sumFirstAndLastDigit(-10);
        System.out.println("Returned Int Value = " + outputInt);
    }
}
