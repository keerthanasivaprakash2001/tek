package Traininglogics04;
//20. Java Program to Determine Whether One String is a Rotation of Another
public class Rotation {
        public static void main(String[] args) {
            String str="abcd";
            String str1="bcda";
            String str2=str+str;
            if(str2.contains(str1)){
                System.out.println(str1+" this is rotation of "+str);
            }else{
                System.out.println(str1+" this is  not a rotation of "+str);
            }




        }
}
