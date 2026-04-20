package Stream_Ass;


//15.	Write a program to find the missing number in the range using Streams.
   //     List<Integer> numbers = List.of(1,2,3,5,6);


import java.util.*;
import java.util.stream.IntStream;

public class MissingNumber {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 5, 6);

        int n = numbers.size() + 1; // expected range size

        int totalSum = IntStream.rangeClosed(1, n).sum();

        int actualSum = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();

        int missingNumber = totalSum - actualSum;

        System.out.println("Missing number: " + missingNumber);
    }
}