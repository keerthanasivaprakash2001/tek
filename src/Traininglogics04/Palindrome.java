package Traininglogics04;

public class Palindrome {
    public static void main(String args[]){
        String str="amma";
        String res="";
        for(int i=0;i<str.length();i++){
            res=str.charAt(i)+res;

        }
        if(str.equals(res)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }


    }
}
