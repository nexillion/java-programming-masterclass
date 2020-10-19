package com.company;

public class Dimensions
{
    private int width;
    private int height;
    private int depth;
    private boolean isRoofTilted;

    public Dimensions(int width, int height, int depth, boolean isRoofTilted)
    {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.isRoofTilted = isRoofTilted;
    }

    public void exactRoomSize()
    {
        double exactSize = this.width * this.height * this.depth;

        if(isRoofTilted)
        {
            exactSize = this.width * this.height * this.depth * 0.875;
        }

        System.out.println("My rooms exact size is " + exactSize);
    }

    private int getWidth()
    {
        return width;
    }

    private int getHeight()
    {
        return height;
    }

    private int getDepth()
    {
        return depth;
    }

    private boolean isRoofTilted()
    {
        return isRoofTilted;
    }

    private void setWidth(int width)
    {
        this.width = width;
    }

    private void setHeight(int height)
    {
        this.height = height;
    }

    private void setDepth(int depth)
    {
        this.depth = depth;
    }

    private void setRoofTilted(boolean roofTilted)
    {
        isRoofTilted = roofTilted;
    }
}
