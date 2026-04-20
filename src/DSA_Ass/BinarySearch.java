package DSA_Ass;

public class BinarySearch {


        public static void main(String[] args) {
            int[] arr = {-1, 0, 3, 5, 7, 9, 12, 15, 17, 21, 24};
            int target = 17;
            int start = 0;
            int end = arr.length - 1;
            while (start <= end) {
                int mid = start + (end - start)/2;
                if(arr[mid] == target){
                    System.out.println(mid);
                    return;
                }
                else if(target<arr[mid]){
                    end = mid-1;
                }
                else {
                    start = mid+1;
                }
            }
        }
    }


