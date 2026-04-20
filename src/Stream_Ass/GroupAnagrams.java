package Stream_Ass;

//17.	Write a program to group anagrams using Streams.
//List<String> words = List.of("eat", "tea", "tan", "ate", "nat", "bat");
import java.util.*;
import java.util.stream.Collectors;

public class GroupAnagrams {
    public static void main(String[] args) {

        List<String> words = List.of("eat", "tea", "tan", "ate", "nat", "bat");

        Map<String, List<String>> result = words.stream()
                .collect(Collectors.groupingBy(
                        word -> {
                            char[] chars = word.toCharArray();
                            Arrays.sort(chars);        // sort characters
                            return new String(chars);  // use as key
                        }
                ));

        System.out.println(result);
    }
}