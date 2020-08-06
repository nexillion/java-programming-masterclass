package com.company;

public class Main
{
    public static void main(String[] args)
    {
            double kilometersPerHour = 1.5;
            long roundedMilesPerHour = Math.round(kilometersPerHour);
            long convertedValue = SpeedConverter.toMilesPerHour(roundedMilesPerHour);
            SpeedConverter.printConversion(kilometersPerHour,convertedValue);

            kilometersPerHour = 10.25;
            roundedMilesPerHour = Math.round(kilometersPerHour);
            convertedValue = SpeedConverter.toMilesPerHour(roundedMilesPerHour);
            SpeedConverter.printConversion(kilometersPerHour,convertedValue);

            kilometersPerHour = -5.6;
            roundedMilesPerHour = Math.round(kilometersPerHour);
            convertedValue = SpeedConverter.toMilesPerHour(roundedMilesPerHour);
            SpeedConverter.printConversion(kilometersPerHour,convertedValue);

            kilometersPerHour = 25.42;
            roundedMilesPerHour = Math.round(kilometersPerHour);
            convertedValue = SpeedConverter.toMilesPerHour(roundedMilesPerHour);
            SpeedConverter.printConversion(kilometersPerHour,convertedValue);

            kilometersPerHour = 75.114;
            roundedMilesPerHour = Math.round(kilometersPerHour);
            convertedValue = SpeedConverter.toMilesPerHour(roundedMilesPerHour);
            SpeedConverter.printConversion(kilometersPerHour,convertedValue);
    }
}
