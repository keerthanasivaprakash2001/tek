package DSA_Ass;

import java.util.Arrays;

public class AdjacentSumPair {


    public static void sum(int[] arr){
        int total;

        for(int i =0 ; i<arr.length-1 ; i++){
            total = arr[i]+arr[i+1];
           for(int j=i+1;j<arr.length;j++){
               if(arr[j]==total){
                   int[] arr1=Arrays.copyOfRange(arr,i,i+2);
                   System.out.println(Arrays.toString(arr1));
               }
           }

        }

    }

    public static void main(String[] args){
        int[] arr = {1, 2, 3, 5, 8};

        sum(arr);



    }
}
