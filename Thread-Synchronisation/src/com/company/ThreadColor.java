package com.company;

public class ThreadColor
{
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";

    public static String getColor(String name)
    {
        String color = null;

        switch(Thread.currentThread().getName())
        {
            case "T1":
                color = ANSI_RED;
                break;

            case "T2":
                color = ANSI_BLUE;
                break;

            case "T3":
                color = ANSI_CYAN;
                break;

            case "T4":
                color = ANSI_GREEN;
                break;

            case "T5":
                color = ANSI_PURPLE;
                break;

            case "T6":
                color = ANSI_BLACK;
                break;

            default:
                break;
        }
        return color;
    }
}
