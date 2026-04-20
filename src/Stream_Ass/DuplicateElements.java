package Stream_Ass;
//12.	Write a program to identify and print duplicate elements using Streams.
//List<Integer> numbers = List.of(1,2,3,2,4,5,1);

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateElements {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 2, 4, 5, 1);

        Set<Integer> seen = new HashSet<>();

        List<Integer> duplicates = numbers.stream()
                .filter(n -> !seen.add(n)) // add() returns false if already exists
                .distinct()               // avoid repeating duplicates
                .collect(Collectors.toList());

        System.out.println("Duplicates: " + duplicates);
    }
}