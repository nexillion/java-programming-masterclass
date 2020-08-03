//If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9
// The sum of these multiples is 23.
//Find the sum of all the multiples of 3 or 5 below 1000.

package com.company;
public class Main
{
    public static void main(String[] args)
    {
        int counter = 1;
        long sumOfMultiples=0;
        while(counter<1000)
        {
            if(counter%3==0)
            {
                sumOfMultiples=sumOfMultiples+counter;
//                System.out.println(counter);
            }else if (counter%5==0)
            {
                sumOfMultiples=sumOfMultiples+counter;
//                System.out.println(counter);
            }
            counter++;
        }
        System.out.println("sumOfMultiples = "+sumOfMultiples);
    }
}
