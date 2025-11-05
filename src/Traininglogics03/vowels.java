package Traininglogics03;
import java.util.regex.*;
public class vowels {

        public static void main(String[] args) {
            String str = "hello how are you";
            Pattern p = Pattern.compile("[aeiouAEIOU]");
            Matcher m = p.matcher(str);

            int count = 0;
            System.out.print("Vowels: ");
            while (m.find()) {
                System.out.print(m.group() + " ");
                count++;
            }

            System.out.println("\nTotal number of vowels: " + count);
        }



}
