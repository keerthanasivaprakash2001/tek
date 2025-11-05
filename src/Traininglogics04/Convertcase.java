package Traininglogics04;

public class Convertcase {
    public static void main(String[] args) {
        String str ="Hello WoRlD";
        String res="";
        for(int i=0;i<str.length();i++){
            char ch =str.charAt(i);
            if(ch>='a' && ch<='z'){
                res+=(char)(ch-32);
            }else if(ch>='A' && ch<='Z'){
                res+=(char)(ch+32);
            }
        }
        System.out.println(res);
    }
}
