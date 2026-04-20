package Stream_Ass;
//16.	Write a program to sort the map by values using Streams.
//Map<String, Integer> map = Map.of("A", 3, "B", 1, "C", 2);

import java.util.*;
import java.util.stream.Collectors;

public class SortMapByValue {
    public static void main(String[] args) {

        Map<String, Integer> map = Map.of("A", 3, "B", 1, "C", 2);

        Map<String, Integer> sortedMap = map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue()) // sort by value
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new // maintain sorted order
                ));

        System.out.println(sortedMap);
    }
}