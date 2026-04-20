package Stream_Ass;
//11.	Write a program to find the second highest unique number using Streams.
//List<Integer> numbers = List.of(10, 20, 30, 40, 40, 50);

import java.util.*;

public class SecondHighest {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(10, 20, 30, 40, 40, 50);

        Integer secondHighest = numbers.stream()
                .distinct()                 // remove duplicates
                .sorted(Comparator.reverseOrder()) // descending order
                .skip(1)                   // skip highest
                .findFirst()               // get second highest
                .orElse(null);

        System.out.println("Second highest: " + secondHighest);
    }
}