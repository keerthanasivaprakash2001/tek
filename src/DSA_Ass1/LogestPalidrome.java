package DSA_Ass1;

public class LogestPalidrome {

    public static String checkLogest(String str){
        int start=0,end=0;
        if  (str.length()==0)
            return " ";
        for (int i=0;i<str.length();i++){
            int l1=palindrome(str ,i,i+1);//0
            int l2=palindrome(str,i,i);//
            int l=Math.max(l1,l2);
            if(l>end-start){
                start=i-(l-1)/2;
                end=i+l/2;
            }


        }
        return str.substring(start,end+1);
    }

    private static int palindrome(String str, int start, int end) {


        while(start>=0&& end<str.length()&& str.charAt(start)==str.charAt(end)){
            start--;
            end++;
        }

        return end-start-1; // to avoid out of bound exception we are doing this
    }


    public static void main(String[] args) {

        String res = checkLogest("ababcdaabbaa");
        System.out.println(res);
    }
}