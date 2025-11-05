package Traininglogics01;
import java.util.*;
public class FrqArr {



        public static void main(String[] args) {
            int[] arr = {1, 2, 2, 3, 1, 4, 2, 3};


            Map<Integer, Integer> map = new LinkedHashMap<Integer,Integer>();


            for (int num : arr) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }


            for (Map.Entry e: map.entrySet()) {
                System.out.println(e.getKey() + " → " + e.getValue());
            }
        }
    }


