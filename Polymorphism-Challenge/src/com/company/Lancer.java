package com.company;

public class Lancer extends Vehicle
{
    private int currentSpeed;

    public Lancer()
    {
        super("Lancer", 4, 4, 0);
    }

    @Override
    public void accelerate(int speedUp)
    {
        if(speedUp > 0)
        {
            if (this.currentSpeed + speedUp > 200)
            {
                System.out.println("You accelerate from " + this.currentSpeed + " to 200, as the Lancer can not go any faster.");
                this.currentSpeed = 200;
            }
            else
            {
                System.out.println("You accelerate from " + this.currentSpeed + " to " + (this.currentSpeed + speedUp) + ".");
                this.currentSpeed += speedUp;
            }
        }
        else
        {
            System.out.println("Invalid Value. Nothing changes.");
        }
    }

    @Override
    public void pressBrake(int speedDown)
    {
        if(speedDown > 1)
        {
            if(this.currentSpeed - speedDown < 0)
            {
                System.out.println("You decelerate from " + this.currentSpeed + " to 0.");
            }
            else
            {
                System.out.println("You decelerate from " + this.currentSpeed + " to " + (this.currentSpeed - speedDown) + ".");
                this.currentSpeed -= speedDown;
            }
        }
        else
        {
            System.out.println("Invalid Value. Nothing changes.");
        }
    }
}
