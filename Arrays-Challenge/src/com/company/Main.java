package com.company;

public class Main {

    public static void main(String[] args)
    {
        Methods methods = new Methods();
        int[] intArrays = methods.sortHighToLow();

        for(int i = 0; i < intArrays.length; i++)
        {
            System.out.println(intArrays[i]);
        }
    }
}
