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

        int IntNumber = (MininumValueOfInt / 2);
        // tova se naricha casting realno java pravi promenliva byte, no vijda MinimumValueOfByte
        // kato int, osven ako ne e cast-nato kato byte stoinost
        // ako "(byte)" se premahne Casting-a pada i shte dade greshka
        byte ByteNumber = (byte)(MinumumValueOfByte / 2);
        System.out.println("Value of Int Min /2 = "+ IntNumber);
        System.out.println("Value of Byte Min /2 = "+ ByteNumber);
        short ShortNumber = (short)(MinumumValueOfShort / 2);
        System.out.println("Value of Short /2 = "+ ShortNumber);
    }
}
