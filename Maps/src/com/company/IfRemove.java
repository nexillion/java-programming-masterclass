package com.company;

import java.util.Map;

public class IfRemove
{
    // Demonstration of a simple if/else remove function.
    // If is true only is the key and value are the exact as those that are being checked.

    public static void ifRemove(Map myMap)
    {
        if(myMap.remove(0, "0"))
        {
            System.out.println("Removing value for key 0.");
        }
        else
        {
            System.out.println("Key and value pair not found.");
        }
    }
}
