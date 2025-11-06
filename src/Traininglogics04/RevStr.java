package Traininglogics04;

public class RevStr {
    public static void main(String[] args) {
        String res="";
        String str="I love programming Languages";
        String[] s=str.split(" ");
        for(int i=s.length-1;i>=0;i--){
            res+=s[i]+" ";
        }
        System.out.println(res);
    }
}
