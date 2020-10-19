package com.company;

public class Windows
{
    private int howManyWindows;
    private int width;
    private int height;

    public Windows(int howManyWindows, int width, int height)
    {
        this.howManyWindows = howManyWindows;
        this.width = width;
        this.height = height;
    }

    public void glassSize()
    {
        System.out.println("Overall glass size = " + this.howManyWindows * this.height * this.width);
    }

    private int getHowManyWindows()
    {
        return howManyWindows;
    }

    private int getWidth()
    {
        return width;
    }

    private int getHeight()
    {
        return height;
    }

    private void setHowManyWindows(int howManyWindows)
    {
        this.howManyWindows = howManyWindows;
    }

    private void setWidth(int width)
    {
        this.width = width;
    }

    private void setHeight(int height)
    {
        this.height = height;
    }
}
