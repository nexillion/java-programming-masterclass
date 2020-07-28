package com.company;

public class Main {

    public static void main(String[] args)
    {
        boolean gameOver = true;
        int highScore = 10000;
        int levelsCompleted = 8;
        int stageBonus = 200;
        if(gameOver)
        {
            int finalScore = highScore + levelsCompleted * stageBonus;
            if(finalScore > 5000)
            {
                System.out.println("Your final score is greater than 5000! Your final score is "+finalScore);
            }else if (finalScore < 5000)
            {
                System.out.println("Your final score is lesser than 5000. Your final score is "+finalScore);
            }else System.out.println("Your final score is "+finalScore);
        }

    }
}
