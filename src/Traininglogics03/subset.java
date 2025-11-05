package Traininglogics03;

public class subset {
    public static void main(String[] args) {
        String str1="fun";
        for(int i=0; i<str1.length(); i++){
            for(int j=i; j<str1.length(); j++){
                String s1=str1.substring(j,str1.length());
                System.out.println(s1);
            }

        }
    }
}
