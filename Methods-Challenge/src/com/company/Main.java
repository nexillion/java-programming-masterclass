package com.company;
public class Main
{
    public static void main(String[] args)
    {
        String playerName = "Nikolay";
        int highScore = 1500;
        int returnedNumber = calculateHighScore(highScore);
        System.out.printf("Number retuned form calculate highScore = " + returnedNumber);
        displayHighScorePosition(playerName,returnedNumber);
    }
    public static void displayHighScorePosition(String playerName,int playerPosition)
    {
        System.out.println(playerName + " placed number " + playerPosition + " on the highscore table.");
    }
    public static int calculateHighScore(int highScore)
    {
        int number = 0;
        if (highScore >= 1000)
        {
            number = 1;
        }
        else if (&& highScore >= 500)
        {
            number = 2;
        }
        else if (highScore >= 100)
        {
                number = 3;
        }
        else number = 4;
        return number;
    }
}
