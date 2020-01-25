package daysOfMuhtar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Benimdeneme {
        //ArrayList<String> names=new ArrayList<>();
        //  ArrayList<String> names=new ArrayList<>(Arrays.asList("Ayse","Fatma","Asli","Hakan","Cevdet");
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int size = scan.nextInt();
            int[] nums = new int[size];
            for(int i=0; i < size; i++){
                nums[i] = scan.nextInt();
            }
            printUniqueNumbers(nums);
        }

        public static void printUniqueNumbers(int[] nums){
            //WRITE YOUR CODE HERE
            /**
             * Complete a void method printUniqueNumbers() that will print all unique numbers from an array of ints.
             * Every single unique int should be printed from the new line.
             * Example:
             * input:[2, 5, 5, 6, 3, 6, 9, 34, 3]
             * output:
             * 2
             * 9
             * 34
             */



        }
}
