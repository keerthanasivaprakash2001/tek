package Stream_Ass;

//Write a program to remove duplicate characters while preserving
// insertion order using Streams. String input = "JavaProgramming";

import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String input = "JavaProgramming";

        String result = input.toLowerCase()
                .chars()
                .mapToObj(c -> (char) c)
                .distinct() // removes duplicates while preserving order
                .map(String::valueOf)
                .collect(Collectors.joining());

        System.out.println("Result: " + result);
    }
}
