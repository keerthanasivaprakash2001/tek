package Stream_Ass;

//Write a program using Streams to count the frequency
// of each word. String input = "java is easy java is powerful";

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordFrequency {
    public static void main(String[] args) {

        String input = "java is easy java is powerful";

        Map<String, Long> result = Arrays.stream(input.toLowerCase().split("\\s+"))
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                ));

        System.out.println(result);
    }
}
