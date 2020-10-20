package com.company;

public class Vehicle
{
    private String name;
    private boolean combustionEngine;
    private int wheels;
    private int cylinders;
    private boolean isEngineOn;
    private int movementSpeed;

    public Vehicle(String name, int cylinders, int wheels, int movementSpeed)
    {
        this.name = name;
        this.combustionEngine = true;
        this.wheels = wheels;
        this.cylinders = cylinders;
        this.isEngineOn = false;
        this.movementSpeed = movementSpeed;
    }

    public void startEngine()
    {
        if(!this.isEngineOn)
        {
            System.out.println("Starting Engine.");
            this.isEngineOn = true;
        }
        else
        {
            System.out.println("Engine is already on.");
        }
    }

    public void stopEngine()
    {
        if(this.isEngineOn)
        {
            System.out.println("Turning engine off.");
            this.isEngineOn = false;
        }
        else
        {
            System.out.println("Engine is already off.");
        }
    }

    public void accelerate(int speedUp)
    {
        if(speedUp > 0)
        {
            if (this.movementSpeed + speedUp > 180)
            {
                this.movementSpeed = 180;
                System.out.println("You accelerate from " + this.movementSpeed + " to 180, as the car can not go any faster.");
            }
            else
            {
                System.out.println("You accelerate from " + this.movementSpeed + " to " + (this.movementSpeed + speedUp) + ".");
                this.movementSpeed += speedUp;
            }
        }
        else
        {
            System.out.println("Invalid Value. Nothing changes.");
        }
    }

    public void pressBrake(int speedDown)
    {
        if(speedDown > 1)
        {
            if(this.movementSpeed - speedDown < 0)
            {
                System.out.println("You decelerate from " + this.movementSpeed + " to 0.");
            }
            else
            {
                System.out.println("You decelerate from " + this.movementSpeed + " to " + (this.movementSpeed - speedDown) + ".");
                this.movementSpeed -= speedDown;
            }
        }
        else
        {
            System.out.println("Invalid Value. Nothing changes.");
        }
    }

    public boolean isEngineOn()
    {
        return isEngineOn;
    }

    public int getMovementSpeed()
    {
        return movementSpeed;
    }

    public String getName()
    {
        return name;
    }

    public boolean isCombustionEngine()
    {
        return combustionEngine;
    }

    public int getWheels()
    {
        return wheels;
    }

    public int getCylinders()
    {
        return cylinders;
    }

    private void setName(String name)
    {
        this.name = name;
    }

    private void setCylinders(int cylinders)
    {
        this.cylinders = cylinders;
    }

    private void setCombustionEngine(boolean combustionEngine)
    {
        this.combustionEngine = combustionEngine;
    }

    private void setWheels(int wheels)
    {
        this.wheels = wheels;
    }

    private void setEngineOn(boolean engineOn)
    {
        isEngineOn = engineOn;
    }

    private void setMovementSpeed(int movementSpeed)
    {
        this.movementSpeed = movementSpeed;
    }
}
