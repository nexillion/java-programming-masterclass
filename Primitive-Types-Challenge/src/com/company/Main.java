package com.company;

public class Main {

    public static void main(String[] args)
    {
        byte bytevariable = 12;
        short shortvariable = 24;
        int intvariable = 256;
        long longvariable = 50000L+10*(bytevariable+shortvariable+intvariable);
        System.out.println("bytevariable = "+ bytevariable);
        System.out.println("shortvariable = "+ shortvariable);
        System.out.println("intvariable = "+ intvariable);
        System.out.println("longvarable = "+ longvariable);
        //----
    }
}
