package Denemelerim;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMuhtarScanner12_15 {
    public static void main(String[] args) {
      //ask user to write a number and print  the numbers 5 times
        Scanner scn=new Scanner(System.in);
      int [] numbers=new int [3];
        for (int i = 0; i <numbers.length; i++) {
            System.out.println("enter the number please :");
           int userInput= scn.nextInt();
             numbers[i]=userInput;

        }
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        int largestNum=numbers[numbers.length-1];
        System.out.println("largest number is : "+largestNum);
        int min =numbers[0];

        //   System.out.println("enter your number please:");
       // int userInput=scn.nextInt();
        //System.out.println("your number is: "+userInput);

            }
        }


