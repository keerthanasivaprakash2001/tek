package Traininglogics04;

public class Replace {
    public static void main(String[] args) {
        String str="hello how  are you";
        String str1=str.replaceAll("\\s+", "!");
        System.out.println(str1);
    }
}
