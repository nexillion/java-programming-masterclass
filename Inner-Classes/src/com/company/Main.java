package com.company;

import java.util.Scanner;

public class Main
{
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        Gearbox lancer = new Gearbox(); // creating outer class instance

        boolean exit = false;
        while(!exit)
        {
            System.out.println("Enter gear.");

            boolean isInt = scanner.hasNextInt();
            if(isInt)
            {
                switch (scanner.nextInt())
                {
                    case 0:
                        Gearbox.Gear zero = lancer.new Gear(0.0); // creating inner class instance
                        System.out.println("Enter engine rpm.");

                        isInt = scanner.hasNextInt();
                        if(!isInt)
                        {
                            exit = true;
                            break;
                        }

                        System.out.println("You are moving at " + zero.drivingSpeed(scanner.nextInt()) + " kmph.");
                        break;

                    case 1:
                        Gearbox.Gear first = lancer.new Gear(0.0125); // creating inner class instance
                        System.out.println("Enter engine rpm.");

                        isInt = scanner.hasNextInt();
                        if(!isInt)
                        {
                            exit = true;
                            break;
                        }

                        System.out.println("You are moving at " + first.drivingSpeed(scanner.nextInt()) + " kmph.");
                        break;

                    case 2:
                        Gearbox.Gear second = lancer.new Gear(0.0225); // creating inner class instance
                        System.out.println("Enter engine rpm.");

                        isInt = scanner.hasNextInt();
                        if(!isInt)
                        {
                            exit = true;
                            break;
                        }

                        System.out.println("You are moving at " + second.drivingSpeed(scanner.nextInt()) + " kmph.");
                        break;

                    case 3:
                        Gearbox.Gear third = lancer.new Gear(0.041); // creating inner class instance
                        System.out.println("Enter engine rpm.");

                        isInt = scanner.hasNextInt();
                        if(!isInt)
                        {
                            exit = true;
                            break;
                        }

                        System.out.println("You are moving at " + third.drivingSpeed(scanner.nextInt()) + " kmph.");
                        break;

                    case 4:
                        Gearbox.Gear fourth = lancer.new Gear(0.05); // creating inner class instance
                        System.out.println("Enter engine rpm.");

                        isInt = scanner.hasNextInt();
                        if(!isInt)
                        {
                            exit = true;
                            break;
                        }

                        System.out.println("You are moving at " + fourth.drivingSpeed(scanner.nextInt()) + " kmph.");
                        break;

                    case 5:
                        Gearbox.Gear fifth = lancer.new Gear(0.0612); // creating inner class instance
                        System.out.println("Enter engine rpm.");

                        isInt = scanner.hasNextInt();
                        if(!isInt)
                        {
                            exit = true;
                            break;
                        }

                        System.out.println("You are moving at " + fifth.drivingSpeed(scanner.nextInt()) + " kmph.");
                        break;

                    case 6:
                        Gearbox.Gear sixth = lancer.new Gear(0.0825); // creating inner class instance
                        System.out.println("Enter engine rpm.");

                        isInt = scanner.hasNextInt();
                        if(!isInt)
                        {
                            exit = true;
                            break;
                        }

                        System.out.println("You are moving at " + sixth.drivingSpeed(scanner.nextInt()) + " kmph.");
                        break;

                    default:
                        exit = true;
                        break;
                }
            }
            else break;
        }
    }
}
