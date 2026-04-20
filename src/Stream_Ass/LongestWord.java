package Stream_Ass;

//Write a program to find the longest word using Streams.
// String input = "java stream api is powerful";

import java.util.Arrays;
import java.util.Comparator;

public class LongestWord {

    public static void main(String[] args) {

        String input = "java stream api is powerful";

        String longest = Arrays.stream(input.split("\\s+"))
                .max(Comparator.comparingInt(String::length))
                .orElse(null);

        System.out.println("Longest word: " + longest);
    }
}
