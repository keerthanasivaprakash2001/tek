package Traininglogics03;

public class divstr {
    public static void main(String[] args){
        String str="javaprogramminglanguages";
        int div=4;
        int len=str.length();
        System.out.println(len);
        if(len %  div !=0){
            System.out.println("we cannot divide & store");
            return;
        }
        int part =len/div;
        for(int i=0;i<len-1; i=i+part){
            System.out.println(str.substring(i,i+part));
        }


    }
}
