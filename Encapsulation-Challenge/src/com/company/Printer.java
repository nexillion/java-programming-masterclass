package com.company;

public class Printer
{
    private int tonerLevel;
    private int pagesPrinted;
    private boolean isDuplex;

    public Printer(boolean isDuplex)
    {
        this.tonerLevel = 0;
        this.pagesPrinted = 0;
        this.isDuplex = isDuplex;
    }

    public void fillUpToner(int fillUpToner)
    {
        if(fillUpToner < 0)
        {
            System.out.println("You attempt to remove " + (fillUpToner * -1) + " int from the toner.");

            if(this.tonerLevel + fillUpToner < 0)
            {
                System.out.println("You tried to remove " + ((this.tonerLevel + fillUpToner) * - 1) + " ink, that does not exist. Toner level set to 0.");
                this.tonerLevel = 0;
            }
            else
            {
                System.out.println("You remove " + fillUpToner + "ink from the toner. New toner value = " + this.tonerLevel);
            }
        }

        if(this.tonerLevel + fillUpToner > 100)
        {
            System.out.println("You attempted to overfill the toner with " + ((this.tonerLevel + fillUpToner) - 100) + ". Toner level set to 100.");
            this.tonerLevel = 100;
        }
        else
        {
            System.out.println("You fill the toner with " + fillUpToner + ".");
            this.tonerLevel += fillUpToner;
            System.out.println("New toner value = " + this.tonerLevel);
        }
    }

    public void printPage()
    {
        if(this.isDuplex)
        {
            if(this.tonerLevel > 20)
            {
                System.out.println("You print a two-sided page.");
                this.tonerLevel -= 20;
                System.out.println("New toner value = " + this.tonerLevel);
            }
            else
            {
                System.out.println("Not enough ink for a two-side print. Toner level = " + this.tonerLevel);
            }
        }
        else
        {
            if(this.tonerLevel > 10)
            {
                System.out.println("You print a one-sided page.");
                this.tonerLevel -= 10;
                System.out.println("New toner value = " + this.tonerLevel);
            }
            else
            {
                System.out.println("Not enough ink for a one-side print. Toner level = " + this.tonerLevel);
            }
        }
    }

    private int getTonerLevel()
    {
        return tonerLevel;
    }

    private int getPagesPrinted()
    {
        return pagesPrinted;
    }

    private boolean isDuplex()
    {
        return isDuplex;
    }

    private void setTonerLevel(int tonerLevel)
    {
        this.tonerLevel = tonerLevel;
    }

    private void setPagesPrinted(int pagesPrinted)
    {
        this.pagesPrinted = pagesPrinted;
    }

    private void setDuplex(boolean duplex)
    {
        isDuplex = duplex;
    }
}
