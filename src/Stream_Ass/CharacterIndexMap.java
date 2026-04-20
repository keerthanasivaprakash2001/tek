package Stream_Ass;
//7. Write a program to create a Map<Character, List<Integer>>
// where each character maps to its indices. String input = "banana";

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CharacterIndexMap {

    public static void main(String[] args) {

        String input = "banana";

        Map<Character, List<Integer>> result =
                IntStream.range(0, input.length())
                        .boxed()
                        .collect(Collectors.groupingBy(
                                i -> input.charAt(i),   // key = character
                                LinkedHashMap::new,     // maintain order
                                Collectors.toList()     // values = indices
                        ));

        System.out.println(result);
    }
}
