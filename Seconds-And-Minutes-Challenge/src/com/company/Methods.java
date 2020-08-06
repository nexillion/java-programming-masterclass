package com.company;

public class Methods
{
    public static void getDurationString(int minutes, int seconds)
    {
        int hours = 0;
        int overall = 0;

        if(minutes > 0 && seconds >= 0 && seconds <= 59)
        {
            overall = seconds + (minutes*60);
            hours = overall / 3600;

            if(hours>=1)
            {
                minutes = minutes % 60;
            }
            System.out.println(hours + "h " + minutes + "m " + seconds + "s ");
        }
        else
        {
            System.out.println("Invalid Value.");
        }
    }

    public static void getDurationString(int seconds)
    {
        int minutes = 0;

        if(seconds>0)
        {
            minutes = seconds / 60;
            if(minutes>=1)
            {
                seconds = seconds % 60;
            }
            System.out.println(minutes + "m " + seconds + "s");
        }
        else
        {
            System.out.println("Invalid Value.");
        }
    }
}

