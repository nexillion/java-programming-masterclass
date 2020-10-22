package com.company;

import java.util.Scanner;

public class Burger
{
    private String name;
    private String meatType;
    private String breadType;
    private double priceBase;

    private double priceLettuce;
    private double priceEgg;
    private double priceTomato;
    private double priceSauce;


    public Burger(String name, String meatType, String breadType, double priceBase)
    {
        this.name = name;
        this.meatType = meatType;
        this.breadType = breadType;
        this.priceBase = priceBase;

        this.priceLettuce = 0.25;
        this.priceEgg = 1.00;
        this.priceTomato = 0.33;
        this.priceSauce = 0.50;
    }

    public void additionScreen()
    {
        int additionsOrdered = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println(" 1. Lettuce\n 2. Egg\n 3. Tomato\n 4. Sauce \n <Any Other> Exit");

        do
        {
            boolean validInput = scanner.hasNextInt();

            if(validInput)
            {
                additionsOrdered = scanner.nextInt();

                switch (additionsOrdered)
                {
                    case 1:
                        addLettuce();
                        break;

                    case 2:
                        addEgg();
                        break;

                    case 3:
                        addTomato();
                        break;

                    case 4:
                        addSauce();
                        break;

                    default:
                        break;
                }
            }
            else
            {
                break;
            }
        }
        while((additionsOrdered >= 1 && additionsOrdered <= 4));

        scanner.close();
    }

    private void addLettuce()
    {
        this.priceBase += this.priceLettuce;
        System.out.println("Additional lettuce. Overall cost: " + this.priceBase);
    }

    private void addEgg()
    {
        this.priceBase += this.priceEgg;
        System.out.println("Additional egg. Overall cost: " + this.priceBase);
    }

    private void addTomato()
    {
        this.priceBase += this.priceTomato;
        System.out.println("Additional tomato. Overall cost: " + this.priceBase);
    }

    private void addSauce()
    {
        this.priceBase += this.priceSauce;
        System.out.println("Additional sauce. Overall cost: " + this.priceBase);
    }

    public String getName()
    {
        return name;
    }

    public String getMeatType()
    {
        return meatType;
    }

    public String getBreadType()
    {
        return breadType;
    }

    public double getPriceBase()
    {
        return priceBase;
    }

    public double getPriceLettuce()
    {
        return priceLettuce;
    }

    public double getPriceEgg()
    {
        return priceEgg;
    }

    public double getPriceTomato()
    {
        return priceTomato;
    }

    public double getPriceSauce()
    {
        return priceSauce;
    }

    private void setName(String name)
    {
        this.name = name;
    }

    private void setMeatType(String meatType)
    {
        this.meatType = meatType;
    }

    private void setBreadType(String breadType)
    {
        this.breadType = breadType;
    }

    private void setPriceBase(double priceBase)
    {
        this.priceBase = priceBase;
    }

    private void setPriceLettuce(double priceLettuce)
    {
        this.priceLettuce = priceLettuce;
    }

    private void setPriceEgg(double priceEgg)
    {
        this.priceEgg = priceEgg;
    }

    private void setPriceTomato(double priceTomato)
    {
        this.priceTomato = priceTomato;
    }

    private void setPriceSauce(double priceSauce)
    {
        this.priceSauce = priceSauce;
    }
}
