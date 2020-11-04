package com.company;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class Album extends Song
{
    private ArrayList<String> arrayListInAlbum = new ArrayList<>();

    private void printAlbumArray()
    {
        for(int i = 0; i < arrayListInAlbum.size(); i++)
        {
            System.out.println((i + 1) + ". " + arrayListInAlbum.get(i));
        }
    }

    public void startMenu()
    {
        Scanner scanner = new Scanner(System.in);
        createSong(10);
        printSongsArray();
        System.out.println("\n\n");
        switchMenuAlbum();

        boolean exitMenu = false;

        while(!exitMenu)
        {
            boolean hasNextInt = scanner.hasNextInt();
            if(!hasNextInt)
            {
                exitMenu = true;
                break;
            }

            switch(scanner.nextInt())
            {
                case 0:
                    switchMenuAlbum();
                    break;

                case 1:
                    printSongsArray();
                    break;

                case 2:
                    if(arrayListInAlbum.size() == 0)
                    {
                        System.out.println("Your album is currently empty.");
                        break;
                    }
                    printAlbumArray();
                    break;

                case 3:
                    System.out.println("Select the index of a song from the song list, that you want to add." +
                            "\n\tInvalid input will return you to the main menu.");
                    if(hasNextInt)
                    {
                        int validNumber = scanner.nextInt();
                        if(validNumber <= arrayListSongs.size() && validNumber > 0)
                        {
                            validNumber--;

                            System.out.println("Adding song: " + arrayListSongs.get(validNumber));
                            arrayListInAlbum.add(arrayListSongs.get(validNumber));
                        }
                    }
                    break;

                case 4:
                    System.out.println("Select the index of a song from your album, that you want to remove." +
                            "\n\tInvalid input will return you to the main menu.");
                    if(hasNextInt)
                    {
                        int validNumber = scanner.nextInt();
                        if(validNumber <= arrayListInAlbum.size() && validNumber > 0)
                        {
                            validNumber--;

                            System.out.println("Removing song: " + arrayListInAlbum.get(validNumber));
                            arrayListInAlbum.remove(validNumber);
                        }
                    }
                    break;

                default:
                    exitMenu = true;
                    break;
            }
        }
        playerMenu();
    }

    private void playerMenu()
    {
        Scanner scanner = new Scanner(System.in);
        if(arrayListInAlbum.size() == 0)
        {
            System.out.println("Nothing in album. Exiting program.");
        }
        else
        {
            switchMenuPlayer();
            ListIterator<String> listIterator = arrayListInAlbum.listIterator();

            boolean exitMenu = false;
            boolean nextTrack = true;
            boolean isPaused = false;

            System.out.println("\n\tNow playing: " + listIterator.next());

            while (!exitMenu)
            {
                boolean hasNextInt = scanner.hasNextInt();
                if(!hasNextInt)
                {
                    exitMenu = true;
                    break;
                }
                switch(scanner.nextInt())
                {
                    case 0:
                        switchMenuPlayer();
                        break;

                    case 1:
                        isPaused = false;
                        if(!nextTrack)
                        {
                            if(listIterator.hasNext())
                            {
                                listIterator.next();
                            }
                            nextTrack = true;
                        }
                        if(listIterator.hasNext())
                        {
                            System.out.println("\tNow Playing: " + listIterator.next());
                        }
                        else
                        {
                            System.out.println("\tReached the end of the album.");
                            nextTrack = false;
                        }
                        break;

                    case 2:
                        if(isPaused)
                        {
                            if(!(listIterator.hasPrevious()))
                            {
                                listIterator.next();
                            }
                            System.out.println("\tPlaying: " + listIterator.previous());
                            listIterator.next();
                            isPaused = false;
                            break;
                        }
                        if(!(listIterator.hasPrevious()))
                        {
                            listIterator.next();
                        }
                        System.out.println("\tPausing: " + listIterator.previous());
                        listIterator.next();
                        isPaused = true;
                        break;

                    case 3:
                        isPaused = false;
                        if(nextTrack)
                        {
                            if(listIterator.hasPrevious())
                            {
                                listIterator.previous();
                            }
                            nextTrack = false;
                        }
                        if(listIterator.hasPrevious())
                        {
                            System.out.println("\tNow Playing: " + listIterator.previous());
                        }
                        else
                        {
                            System.out.println("\tReached the start of the album.");
                            nextTrack = true;
                        }
                        break;

                    default:
                        exitMenu = true;
                        break;
                }
            }
        }
    }

    private void switchMenuPlayer()
    {
        System.out.println("\n\t0. List control menu again." +
                "\n\t1. Next song" +
                "\n\t2. Pause" +
                "\n\t3. Previous song" +
                "\n<ANY> Exit program.");
    }

    private void switchMenuAlbum()
    {
        System.out.println("Choose what you want to do. Currently you have " + arrayListInAlbum.size() + " songs in your album.");
        System.out.println("\n\t0. List control menu again." +
                "\n\t1. List available songs." +
                "\n\t2. List your album." +
                "\n\t3. Add song to album." +
                "\n\t4. Remove song from album." +
                "\n<ANY> Quit menu and go to player.");
    }
}