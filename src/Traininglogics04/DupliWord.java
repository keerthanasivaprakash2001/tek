package Traininglogics04;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

//Java Program to Print the Duplicate Words in a String
public class DupliWord {
    public static void main(String[] args) {
        Map<String,Integer> map = new LinkedHashMap<>();
        String str="hello hi how to say hello hi to hello";
        String[] s=str.split(" ");
        for(int i=0;i<s.length;i++){
            String s1=s[i];
            map.put(s1,map.getOrDefault(s1,0)+1);

        }
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey());
            }
        }
    }

}
