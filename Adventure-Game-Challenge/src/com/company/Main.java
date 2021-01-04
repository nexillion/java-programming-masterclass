package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main
{
    private static Map<Integer, Location> locations = new HashMap<>();

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        locations.put(0, new Location(0, "Exiting program."));
        locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building."));
        locations.put(2, new Location(2, "You are at the top of a hill."));
        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring."));
        locations.put(4, new Location(4, "You are in a valley beside a stream."));
        locations.put(5, new Location(5, "You are in the forest."));

        locations.get(1).addExit("W", 2);
        locations.get(1).addExit("WEST", 2);
        locations.get(1).addExit("E", 3);
        locations.get(1).addExit("EAST", 3);
        locations.get(1).addExit("S", 4);
        locations.get(1).addExit("SOUTH", 4);
        locations.get(1).addExit("N", 5);
        locations.get(1).addExit("NORTH", 5);


        locations.get(2).addExit("N", 5);
        locations.get(2).addExit("NORTH", 5);

        locations.get(3).addExit("W", 1);
        locations.get(3).addExit("WEST", 1);

        locations.get(4).addExit("N", 1);
        locations.get(4).addExit("NORTH", 1);
        locations.get(4).addExit("W", 2);
        locations.get(4).addExit("WEST", 2);


        locations.get(5).addExit("S", 1);
        locations.get(5).addExit("SOUTH", 1);
        locations.get(5).addExit("W", 2);
        locations.get(5).addExit("WEST", 2);

        int position = 1;
        while(true)
        {
            System.out.println(locations.get(position).getDescription());

            if(position == 0)
            {
                break;
            }

            Map<String, Integer> exits = locations.get(position).getExits();
            System.out.print("Available exits are ");
            for(String exit: exits.keySet())
            {
                System.out.print(exit + ", ");
            }
            System.out.println();

            String direction = scanner.nextLine().toUpperCase();
            String[] directionArray = direction.split(" ");

            boolean invalidInput = true;

            for(int i = 0; i <= directionArray.length; i++)
            {


               if(exits.containsKey(directionArray[i]))
               {
                   position = exits.get(directionArray[i]);
                   invalidInput = false;
                   break;
               }
            }

            if(invalidInput)
            {
                System.out.println("You cannot go in that direction.");
            }
        }
    }
}