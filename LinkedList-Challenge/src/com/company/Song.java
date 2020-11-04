package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Song
{
    public ArrayList<String> arrayListSongs = new ArrayList<>();
    Words words = new Words();

    public void createSong(int counter)
    {
        for(int i = 0; i < counter; i++)
        {
            Random random = new Random();
            int minutes = random.nextInt(5) + 2;
            int seconds = random.nextInt(60);

            arrayListSongs.add(words.returnRandomWord(random.nextInt(3) + 1) + " - " + minutes + "m." + seconds + "s."); // (0-2) + 1
        }
    }

    public void printSongsArray()
    {
        for(int i = 0; i < arrayListSongs.size(); i++)
        {
            System.out.println((i + 1) + ". " + arrayListSongs.get(i));
        }
    }
}