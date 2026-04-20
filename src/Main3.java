import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(1); list.add(2); list.add(3);
//
//        for (Integer i : list) {
//            list.add(4);   // Modification during iteration
//        }

        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30));

        list.clear();

        System.out.println(list); // Output: []



    }
}
