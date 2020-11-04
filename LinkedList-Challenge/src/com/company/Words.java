package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Words
{
    private Random random = new Random();

    public String returnRandomWord(int numberOfWords) // song names are sometimes longer than a single word
    {
        if(numberOfWords == 1)
        {
            return (returnNoun());
        }

        if(numberOfWords == 2)
        {
            return (returnAdjective() + " " + returnNoun());
        }

        if(numberOfWords == 3)
        {
            return (returnAdjective() + " " + returnVerb() + " " + returnNoun());
        }

        return null;
    }

    private String returnAdjective()
    {
        ArrayList<String> arrayListAdjectives = new ArrayList<>();

        arrayListAdjectives.add("Large");
        arrayListAdjectives.add("Small");
        arrayListAdjectives.add("Rusty");
        arrayListAdjectives.add("Pristine");
        arrayListAdjectives.add("Polished");
        arrayListAdjectives.add("Cracked");
        arrayListAdjectives.add("Salty");
        arrayListAdjectives.add("Aggressive");
        arrayListAdjectives.add("Polite");
        arrayListAdjectives.add("Confused");
        arrayListAdjectives.add("Tiny");
        arrayListAdjectives.add("Huge");
        arrayListAdjectives.add("Epic");
        arrayListAdjectives.add("Juicy");
        arrayListAdjectives.add("Wet");
        arrayListAdjectives.add("Shining");
        arrayListAdjectives.add("Blue");
        arrayListAdjectives.add("Red");
        arrayListAdjectives.add("Blind");
        arrayListAdjectives.add("Farseeing");
        arrayListAdjectives.add("Big-Eyed");
        arrayListAdjectives.add("Snotty");
        arrayListAdjectives.add("Tasty");
        arrayListAdjectives.add("Orange");

        return arrayListAdjectives.get(random.nextInt(24));
    }

    private String returnNoun()
    {
        ArrayList<String> arrayListNouns = new ArrayList<>();

        arrayListNouns.add("Robot");
        arrayListNouns.add("Bucket");
        arrayListNouns.add("Unicorn");
        arrayListNouns.add("Sock");
        arrayListNouns.add("Cabinet");
        arrayListNouns.add("Lizard");
        arrayListNouns.add("Kraken");
        arrayListNouns.add("Bolts");
        arrayListNouns.add("Chicken");
        arrayListNouns.add("Typewriter");
        arrayListNouns.add("Stone");
        arrayListNouns.add("Grass");
        arrayListNouns.add("Banana");
        arrayListNouns.add("Orange");
        arrayListNouns.add("Pepper");
        arrayListNouns.add("Potato");
        arrayListNouns.add("Wings");
        arrayListNouns.add("Light");
        arrayListNouns.add("Hardware");
        arrayListNouns.add("Crow");
        arrayListNouns.add("Jukebox");
        arrayListNouns.add("Jacket");
        arrayListNouns.add("Dog");
        arrayListNouns.add("Caps");
        arrayListNouns.add("Window");

        return arrayListNouns.get(random.nextInt(24));
    }

    private String returnVerb()
    {
        ArrayList<String> arrayListVerbs = new ArrayList<>();

        arrayListVerbs.add("Meditating");
        arrayListVerbs.add("Deceiving");
        arrayListVerbs.add("Lollygagging");
        arrayListVerbs.add("Rusting");
        arrayListVerbs.add("Cracking");
        arrayListVerbs.add("Growing");
        arrayListVerbs.add("Murdering");
        arrayListVerbs.add("Fleeing");
        arrayListVerbs.add("Flying");
        arrayListVerbs.add("Confusing");
        arrayListVerbs.add("Falling");
        arrayListVerbs.add("Jumping");
        arrayListVerbs.add("Glowing");
        arrayListVerbs.add("Raging");
        arrayListVerbs.add("Raining");
        arrayListVerbs.add("Shining");
        arrayListVerbs.add("Crouching");
        arrayListVerbs.add("Hiding");
        arrayListVerbs.add("Binding");
        arrayListVerbs.add("Stalking");
        arrayListVerbs.add("Popping");
        arrayListVerbs.add("Screaming");
        arrayListVerbs.add("Walking");
        arrayListVerbs.add("Mailing");

        return arrayListVerbs.get(random.nextInt(24));
    }
}