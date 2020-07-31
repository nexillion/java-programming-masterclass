package com.company;
import java.util.Scanner;
import java.util.spi.AbstractResourceBundleProvider;

//-------------------------------------------------------------------------------

public class Main {
    public static void main(String[] args) {
        Switches.methodStartingSwitch();
    }
}

//-------------------------------------------------------------------------------

class Switches {

    static void methodStartingSwitch(){
        Scanner userSwitchChoiceStart = new Scanner(System.in);
        System.out.printf("You wake up in the middle of the forest. Your head hurts badly. " +
                "There is an old looking bag in front of you." +
                "\n\nWhat do you do?" +
                "\n1) - Look around" +
                "\n2) - Check to see what is in the bag" +
                "\n3) - Try to stop  your head from hurting by touching it");
        int startingChoice = userSwitchChoiceStart.nextInt();
        switch (startingChoice)
        {
            case 1:
                choice.myMethodOne();
                break;
            case 2:
                choice.myMethodTwo();
                break;
            case 3:
                choice.myMethodThree();
                break;
        }
    }
}

//-------------------------------------------------------------------------------

class choice {
    static void myMethodOne() {
        Scanner userChoiceUnicorn = new Scanner(System.in);
        System.out.printf("You see a unicorn. \nWhat do you do?" +
                "\n1) - Ride the unicorn." +
                "\n2) - Ride the unicorn." +
                "\n3) - Ride the unicorn." +
                "\n4) - Don't ride the unicorn.");
        int rideAUnicorn = userChoiceUnicorn.nextInt();
        switch (rideAUnicorn)
        {
            case 1:
                unicornRider.unicornRiderYES();
                break;
            case 2:
                unicornRider.unicornRiderYES();
                break;
            case 3:
                unicornRider.unicornRiderYES();
                break;
            case 4:
                Switches.methodStartingSwitch();
        }
    }
    static void myMethodTwo(){
        System.out.printf("You find a nail clipper, an empty plastic bottle and some peanuts.\n" +
                "I can't be bothered to finish this right now.\n\nTHE END");
    }
    static void myMethodThree(){
        System.out.printf("You get an infection from touching your wound." +
                "\nYou die.\n\nTHE END");
    }
}

//-------------------------------------------------------------------------------

class unicornRider{
    static void unicornRiderYES(){
        System.out.printf("You ride the unicorn back to civilization. \nYou marry the unicorn. \n" +
                "You live happily ever after. \n\nTHE END");
    }
}