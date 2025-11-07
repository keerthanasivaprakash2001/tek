package Traininglogics03;

import java.util.regex.*;

public class  consonants {

    public static void main(String[] args) {
        String str="hey what are you doing";
        Pattern p=Pattern.compile("[^aeiouAEIOU]+");
        Matcher m=p.matcher(str);
       int  count=0;
        while (m.find()){
            System.out.print(m.group()+" ");
            count++;
        }
        System.out.println("\n"+count);
    }

}
