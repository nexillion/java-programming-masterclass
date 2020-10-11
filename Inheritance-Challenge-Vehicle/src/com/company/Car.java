package com.company;

public class Car extends Vehicle
{
    private int wheels;
    private int doors;
    private int gear;
    private boolean isManual;

    private int currentGear;

    public Car(String name, double length, double width, double height, int currentMovementSpeed, int currentDirection, int wheels, int doors, int gear, boolean isManual)
    {
        super(name, length, width, height);

        this.wheels = wheels;
        this.doors = doors;
        this.gear = gear;
        this.isManual = isManual;
        this.currentGear = 0;
    }

    public void setCurrentGear(int currentGear)
    {
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear(): " + this.currentGear + " gear");
    }

    public int getWheels()
    {
        if(this.wheels < 4)
        {
            System.out.println("Tyres missing on " + getName());
        }
        return wheels;
    }

    public int getDoors()
    {
        return doors;
    }

    public int getGear()
    {
        return gear;
    }

    public boolean isManual()
    {
        return isManual;
    }

    public int getCurrentGear()
    {
        return currentGear;
    }

    public void setWheels(int wheels)
    {
        this.wheels = wheels;
    }

    public void setDoors(int doors)
    {
        this.doors = doors;
    }

    public void setGear(int gear)
    {
        this.gear = gear;
    }

    public void setManual(boolean manual)
    {
        isManual = manual;
    }
}
