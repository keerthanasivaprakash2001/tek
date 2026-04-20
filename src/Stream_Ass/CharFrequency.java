package Stream_Ass;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharFrequency {
    public static void main(String[] args){
        String input = "JavaStreamApi";

        Map<Character, Long> result = input.toLowerCase().chars()
                .mapToObj(c ->(char) c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue , (e1 , e2) -> e1 , LinkedHashMap::new) );

        result.forEach((k,v)->System.out.println(k+"->"+v));

    }

}
