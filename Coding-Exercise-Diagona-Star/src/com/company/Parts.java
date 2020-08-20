package com.company;

public class Parts
{
    public static void modulePieceMain(int number)
    {
        int lineCounter = 0;

        while(lineCounter < number) // line counting
        {
            if(lineCounter == 0 || lineCounter == number - 1) // roof and bottom
            {
                int counter = 1;

                while(counter <= number)
                {
                    System.out.print("*");
                    counter++;
                }
            }
            else
            {
                Parts.modulePieceOne(number, lineCounter);
            }
            System.out.print("\n");
            lineCounter++;
        }
    }


    public static void modulePieceOne(int number, int lineCounter)
    {
        int crossWallCounter = 0;

        while(crossWallCounter < number)
        {
            if(crossWallCounter == 0 || crossWallCounter == number - 1) // wall
            {
                System.out.print("*");
            }
            else
            {
                if(crossWallCounter == lineCounter || crossWallCounter == number - (lineCounter + 1))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            crossWallCounter++;
        }
    }
}
