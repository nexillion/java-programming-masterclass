package com.company;

public class HealthyBurger extends Burger
{
    public HealthyBurger()
    {
        super("Healthy Burger", "Chicken", "Brown Bread", 3.50);
    }

    @Override
    public void additionScreen()
    {
        System.out.println("Select additions for " + this.getName() + ".");
        super.additionScreen();
    }
}
