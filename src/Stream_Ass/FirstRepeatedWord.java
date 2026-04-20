package Stream_Ass;

import java.util.*;
//Write a program to find the first repeated word using Streams.
// String input = "java is very very powerful";

public class FirstRepeatedWord {
    public static void main(String[] args) {

        String input = "java is very very powerful";

        Set<String> seen = new HashSet<>();

        String firstRepeated = Arrays.stream(input.toLowerCase().split("\\s+"))
                .filter(word -> !seen.add(word)) // add returns false if already present
                .findFirst()
                .orElse(null);

        System.out.println("First repeated word: " + firstRepeated);
    }
}