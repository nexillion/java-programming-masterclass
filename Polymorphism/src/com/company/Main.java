package com.company;

public class Main {

    public static void main(String[] args)
    {
        int counter = 1;
        while(counter <= 10)
        {
            Movie movie = randomMovie();
            System.out.println("Movie number #" + counter + " , named " + movie.getName() + " and is about " + movie.plot() + ".");
            counter++;
        }
    }

    public static Movie randomMovie()
    {
        int randomNumber = (int)(Math.random() * 5) + 1;
        System.out.println("The Random number was = " + randomNumber);

        switch (randomNumber)
        {
            case 1:
                return new Shrek();
            case 2:
                return new TheSimpsons();
            case 3:
                return new SanikTheMeme();
            case 4:
                return new Gangstas();
            case 5:
                return new Five();
        }
        return null;
    }
}
