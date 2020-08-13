package com.company;

public class Main {

    public static void main(String[] args)
    {
        double amount = 10000;
        Methods.calculateInterest(amount);

        int breakCounter = 0;
        for(int counter = 100; counter <= 1000; counter ++)
        {
            boolean isPrime = Methods.isPrime(counter);
            if(isPrime)
            {
                breakCounter++;

                if(breakCounter<=3)
                {
                    System.out.println(counter + " is a prime number.");
                }
                else
                {
                    break;
                }
            }
        }
    }
}
