package Stream_Ass;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String input = "JavaProgramming";

        Character result =  input.toLowerCase().chars()
                .mapToObj(c ->(char) c ).collect(Collectors.groupingBy(
                        Function.identity(), LinkedHashMap::new , Collectors.counting()
                ))
                .entrySet().stream().filter(entry -> entry.getValue()==1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);

        System.out.println("First non-repeating character: " + result);

    }
}
