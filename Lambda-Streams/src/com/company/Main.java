package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main
{
    public static void main(String[] args)
    {
        List<String> bingoNumbers = Arrays.asList("N40", "N36", "B12", "B6", "G53", "G49", "G60", "G50", "g64", "I26",
                "I17", "I29", "O71");
        List<String> gNumbers = new ArrayList<>();

        bingoNumbers.forEach(number -> {
            if (number.toUpperCase().startsWith("G"))
            // filters the list to leave only strings starting with "G"
            {
                gNumbers.add(number);
            }
        });

        // sorts list in numerical order (ASCII)
        gNumbers.sort((String s1, String s2) -> s1.compareTo(s2)); // this line can be replaced with method reference:
        // gNumbers.sort(String::compareTo);

        // prints stream contents in uppercase
        gNumbers.forEach((String s) -> System.out.println(s.toUpperCase()));

        System.out.println("---------------------------------------------------------------------");

        // the following is an example of a stream
        // what it does is the same as the code from line 25 up to 41
        bingoNumbers
                .stream()                          // stream creation
                .map(String::toUpperCase)          // changes letters from lower to upper case - this applies to the whole list
                .filter(s -> s.startsWith("G"))    // filters the list to leave only strings starting with "G"
                .sorted()                          // sorts list in numerical order (ASCII)
                .forEach(System.out::println);     // prints stream contents

        // creating two streams with variables that are semi-same
        Stream<String> firstNumberStream = Stream.of("I26", "I17", "I29", "O71");
        Stream<String> secondNumberStream = Stream.of("N40", "N36", "I29", "I17", "I26", "O71");
        // .concat() - creates a lazily formed stream whose elements are all the elements of the first stream
        // followed by all the elements of the second stream.
        // Lazily would mean that it does not check for same values or order.
        Stream<String> concatStream = Stream.concat(firstNumberStream, secondNumberStream);

        System.out.println("---------------------------------------------------------------------");

        // printing the stream
        System.out.println(
                concatStream
                .distinct()                        // checks for and removes same values that appear more than once
                .peek(System.out::println)         // .peek() is a completely transparent command that can be used for keeping an eye on the running stream
                .count());                         // .count() lists the number of entries in the stream at the point of calling
        // .distinct is the only line that is not printed because it is a stream modifying line
    }
}
