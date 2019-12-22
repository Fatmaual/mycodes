package day25;

import java.util.Arrays;
import java.util.Scanner;

public class Tekrar {
    public static void main(String[] args) {
   int[] numbers = {1,1,2,3,3,4,4,5,5,8,9};
        for (int j = 0; j <numbers.length ; j++) {


   int count = 0;
   for(int i =0; i<numbers.length; i++){
       if(numbers[i]==numbers[j]){
           count++;
       }
   }
  if(count ==1){
      System.out.println(numbers[j]);
  }


    }
}
}