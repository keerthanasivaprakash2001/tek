package Stream_Ass;

//14.	Write a program to flatten the list into a single list using Streams.
//List<List<Integer>> list = List.of(
//    List.of(1,2),
//    List.of(3,4),
//    List.of(5)
//);

import java.util.*;
import java.util.stream.Collectors;

public class FlattenList {
    public static void main(String[] args) {

        List<List<Integer>> list = List.of(
                List.of(1, 2),
                List.of(3, 4),
                List.of(5)
        );

        List<Integer> result = list.stream()
                .flatMap(innerList -> innerList.stream()) // flatten
                .collect(Collectors.toList());

        System.out.println(result);
    }
}