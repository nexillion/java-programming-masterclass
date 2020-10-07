package com.company;

public class Methods
{
        public static long primeFound()
        {
            int counter = 2;
            long primeNumbersSum = 0;

            while (counter < 2000000)
            {
                int numberCheck = isPrime(counter);
                if(numberCheck != 0)
                {
                    // System.out.println("prime: " + numberCheck);
                    primeNumbersSum = primeNumbersSum + numberCheck;
                }
                counter++;
            }
            return primeNumbersSum;
        }

        public static int isPrime(int numberCheck)
        {
            int counter = 3;
            if(numberCheck % 2 == 0 && numberCheck != 2)
            {
                return 0;
            }

            long roundSquare = Math.round(Math.sqrt(numberCheck));
            while(roundSquare >= counter)
            {
                if(numberCheck % counter == 0)
                {
                    return 0;
                }
                counter = counter + 2;
            }
            return numberCheck;
        }
}
