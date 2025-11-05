package Traininglogics04;
//16. Java Program to Find the Maximum and Minimum Occurring Characters in a String

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Maxmin {
    public static void main(String[] args){

        String str="hello java program languages";
        Map<Character,Integer> map=new LinkedHashMap<>();
        char maxChar = ' ';
        char minChar = ' ';
        int maxCount = Integer.MIN_VALUE;
        int minCount = Integer.MAX_VALUE;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
      for(Map.Entry<Character,Integer> entry:map.entrySet()){
          char key = entry.getKey();
          int value = entry.getValue();

          if(value>maxCount){
              maxCount=value;
              maxChar=key;
          }
          if(value<minCount){
              minCount=value;
              minChar=key;

          }


      }
      System.out.println( "maximum character:" + maxChar+" "+"minimum  character:"+minChar);



    }

}
