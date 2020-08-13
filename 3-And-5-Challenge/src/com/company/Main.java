package com.company;

public class Main {

    public static void main(String[] args)
    {
        int sumOfNumbers = 0;
        int i = 0;

        for(int counter = 1; counter <= 1000; counter++)
        {
            if(counter % 3 == 0 && counter % 5 == 0)
            {
                System.out.println("This number can be divided by 3 and 5: " + counter);
                sumOfNumbers = sumOfNumbers + counter;
                i++;

                if(i == 5)
                {
                    break;
                }
            }
        }

        System.out.println("The sum of these numbers is = " + sumOfNumbers);
    }
}
