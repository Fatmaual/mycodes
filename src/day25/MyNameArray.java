package day25;

import java.util.Arrays;

public class MyNameArray {
    public static void main(String[] args) {
        String name = "Anastasiya";
        char[] allCharsInName = name.toCharArray();
        for(char herbirkarakter  :allCharsInName){
            System.out.println("herbirkarakter = " + herbirkarakter+",");
        }
        //now count how many a we have
        int count = 0;
        for (char herbirkarakter: allCharsInName) {
           if(herbirkarakter=='a'){
               ++count;
           }
        }
        System.out.println("herbir karakterde a : "+ count);
        Arrays.sort(allCharsInName);
        System.out.println(Arrays.toString(allCharsInName));
    }
}
