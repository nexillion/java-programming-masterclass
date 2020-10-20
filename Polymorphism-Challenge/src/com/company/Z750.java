package com.company;

public class Z750 extends Vehicle
{
    private int currentSpeed = 0;

    public Z750()
    {
        super("Z750", 4, 2, 0);
    }

    @Override
    public void accelerate(int speedUp)
    {
            if(speedUp > 0)
            {
                if (this.currentSpeed + speedUp > 230)
                {
                    System.out.println("You accelerate from " + this.currentSpeed + " to 230, as the Z750 can not go any faster.");
                    this.currentSpeed = 230;
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
