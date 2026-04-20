package Stream_Ass;
//13.	Write a program to partition numbers into even and odd using Streams.
//List<Integer> numbers = List.of(1,2,3,4,5,6);
import java.util.*;
import java.util.stream.Collectors;

public class EvenOddPartition {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);

        Map<Boolean, List<Integer>> result = numbers.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        System.out.println(result);
    }
}