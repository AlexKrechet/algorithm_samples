package com.alexkrechet.samples.algorithm;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringToSetThroughStream {
    public static void main(String[] arg) {

        //Source String of twin words starting with regular or capital letters
        String words = "Apple banana Banana strawberry apple";

        //First solution - we're creating a stream of Strings, splitting
        // the source String by space's, converting to lower case and then collecting to the Set
        Stream.of(words.split(" "))
                .map(String::toLowerCase)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        //Second solution - we're assigning a link to the Set of Strings, converting source String (which is)
        // literally an array, converting all to upper case and then collecting to the Set.
        Set<String> setOfWords = Arrays.asList(words.split(" "))
                .stream()
                .map(String::toUpperCase)
                .collect(Collectors.toSet());

        for (String s : setOfWords) {
            System.out.println(s);
        }

    }
}
