package com.company;

public class Main {

    public static void main(String[] args)
    {
        String stringone = "string";
        System.out.println("This is a "+ stringone);
        stringone = stringone + ", and this is also a string!";
        System.out.println("This is a second "+stringone);
        stringone = stringone + "\u00AE 1991";
        System.out.println("This is a third "+stringone);
        String stringtwo = "616.356";
        stringtwo = stringtwo + "156.488";
        System.out.println(stringtwo);
        String stringthree = "25";
        int anumber = 25;
        stringthree = stringthree + anumber;
        System.out.println(stringthree);
        //pri output na String + integer, se poluchava vsqkash sum naprawil String+String
        //tova e hubavo da se zapomni kato interaction
    }
}
