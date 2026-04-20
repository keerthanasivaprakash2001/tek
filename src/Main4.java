public class Main4 {
    public static void main(String[] args) {
        String input = "a1b2c3";
        int sum = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check if character is a digit
            if (Character.isDigit(ch)) {
                sum += ch - 0; // convert char to int
            }
        }

        System.out.println("Sum of digits: " + sum);
    }
}
