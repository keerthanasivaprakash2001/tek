import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        String str="abcddcdbccdcddddd";
        String res="";
        int len=0;
        int max=0;
        String s1="";
        for(int i=0;i<str.length();i++){
            res=str.charAt(i)+res;
        }
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                String check=str.substring(i,j+1);
                if(res.contains(check)){
                    len=check.length();
                    if(len>max){
                        max=len;
                        s1=str.substring(i,j+1);

                    }
                }
            }
            i+=len;
        }
        System.out.println( s1+" "+max);


    }
}
