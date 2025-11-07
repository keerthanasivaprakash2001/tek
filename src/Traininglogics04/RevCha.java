package Traininglogics04;

public class RevCha {
    public static void main(String[] args) {
        String str1="aabbccde";
        String res="";
        for(int i=0; i<str1.length(); i++){
            res=str1.charAt(i)+res;

        }
        System.out.println(res);
    }
}
