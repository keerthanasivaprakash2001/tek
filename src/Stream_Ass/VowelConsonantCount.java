package Stream_Ass;

import java.util.Map;
import java.util.stream.Collectors;

public class VowelConsonantCount {

    public static void main(String[] args) {

        String input = "hello world";

        Map<String, Long> result = input.toLowerCase()
                .chars()
                .mapToObj(c -> (char) c)
                .filter(Character::isLetter) // ignore spaces
                .collect(Collectors.groupingBy(
                        c -> "aeiou".indexOf(c) != -1 ? "Vowel" : "Consonant",
                        Collectors.counting()
                ));

        System.out.println(result);
    }
}
