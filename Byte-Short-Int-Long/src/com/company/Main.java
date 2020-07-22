package com.company;
public class Main {

    public static void main(String[] args) {
        int value = 10000;
        int MininumValueOfInt = Integer.MIN_VALUE;
        int MaximumValuesOfInt = Integer.MAX_VALUE;
        System.out.println("Minumum Value of an Integer = " + MininumValueOfInt);
        System.out.println("Maximum Value of an Integer = " + MaximumValuesOfInt);
        System.out.println(value);
        System.out.println("Overflow = " + (MaximumValuesOfInt+1));
        System.out.println("Underflow = " + (MininumValueOfInt-1));

        byte MaximumValueOfByte = Byte.MAX_VALUE;
        byte MinumumValueOfByte = Byte.MIN_VALUE;
        System.out.println("Minimum Value of a Byte = "+ MinumumValueOfByte);
        System.out.println("Maximum Value of a Byte = "+ MaximumValueOfByte);

        short MaximumValueOfShort = Short.MAX_VALUE;
        short MinumumValueOfShort = Short.MIN_VALUE;
        System.out.println("Minimum Value of a Short = "+ MinumumValueOfShort);
        System.out.println("Maximum Value of a Short = "+ MaximumValueOfShort);

        long MaximumValueOfLong = Long.MAX_VALUE;
        long MinumumValueOfLong = Long.MIN_VALUE;
        System.out.println("Minimum Value of a Long = "+ MinumumValueOfLong);
        System.out.println("Maximum Value of a Long = "+ MaximumValueOfLong);
    }
}
