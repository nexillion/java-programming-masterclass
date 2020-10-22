package com.company;

import java.util.Scanner;

public class PremiumBurger extends Burger
{
    private String meat1;
    private String meat2;

    public PremiumBurger()
    {
        super("Premium Burger", "null", "White Bread", 4.40);
        meatSelect();

        System.out.println("Your Premium Burger is made with " + this.meat1 + " and " + this.meat2 + ".");
    }

    private void meatSelect()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select what meat you want on your Premium Burger.\n 1. Pork\n 2. Beef\n 3. Chicken\n 4. Fish Fillet");

        int counter = 0;
        while(counter != 2)
        {
            boolean validInput = scanner.hasNextInt();
            if(validInput)
            {
                int meatChoice = scanner.nextInt();
                counter = meatChoiceSwitch(meatChoice, counter);
            }
            else
            {
                System.out.println("Valid input is 1-4.");
                break;
            }
        }
    }

    private int meatChoiceSwitch(int meatChoice, int counter)
    {
        if(meatChoice > 0 && meatChoice < 5)
        {
            switch (meatChoice)
            {
                case 1:
                    if(counter > 0)
                    {
                        this.meat2 = "Pork";
                        break;
                    }
                    this.meat1 = "Pork";
                    break;

                case 2:
                    if(counter > 0)
                    {
                        this.meat2 = "Beef";
                        break;
                    }
                    this.meat1 = "Beef";
                    break;

                case 3:
                    if(counter > 0)
                    {
                        this.meat2 = "Chicken";
                        break;
                    }
                    this.meat1 = "Chicken";
                    break;

                case 4:
                    if(counter > 0)
                    {
                        this.meat2 = "Fish Fillet";
                        break;
                    }
                    this.meat1 = "Fish Fillet";
                    break;

                default:
                    break;
            }
            counter++;
            return counter;
        }
        else
        {
            System.out.println("Valid input is 1-4.");
            return counter;
        }
    }

    @Override
    public void additionScreen()
    {
        System.out.println("Select additions for " + this.getName() + ".");
        super.additionScreen();
    }
}
