package com.company;

public class Shrek extends Movie
{
    public Shrek()
    {
        super("Shrek");
    }

    @Override
    public String plot()
    {
        return "An Ogre goes on a quest to save a princess";
    }
}
