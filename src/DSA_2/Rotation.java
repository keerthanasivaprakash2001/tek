package DSA_2;

public class Rotation {

        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5};
            int n = 2;  // rotate by 2 positions
            int len = arr.length;

            // temporary array
            int[] result = new int[len];

            for (int i = 0; i < len; i++) {
                result[i] = arr[(i + n) % len];
            }

            // print result
            for (int num : result) {
                System.out.print(num + " ");
            }
        }
    }

