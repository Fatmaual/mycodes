package day27;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysReview {
    public static void main(String[] args) {
        int num=10;
        int[]arr ={10,20,30,40,50,60};
        int num1=arr[arr.length-1];
        System.out.println(num1);
        //lets get the results without comma
        for (int x = 0; x <arr.length ; x++) {
            System.out.println(arr[x]+" ");
        }
        System.out.println("\n=========");
        String str = Arrays.toString(arr);
        System.out.println(str);
  //using scanner; write to program that ask user to enter numbers 5 times store those numbers into int arry
        int[]numbers =new int[5];
        System.out.println(Arrays.toString(numbers));
        //wrong!!! it has to be initialized
        Scanner scan = new Scanner (System.in);
        System.out.println("enter an int number");
       // scan.nextInt();  this method returns int data type
        for (int i = 0; i < 5; i++) {
      //  int input = scan.nextInt();
        numbers[i]=scan.nextInt(); // this is first step for repeating 5 times
        //after that I wanna repeat 4 times i have to do for loop
        //initializating start with 0 for(int i =0

        }
        System.out.println(Arrays.toString(numbers));
        //largest number bulmak icin we can use sort
        Arrays.sort(numbers);
        int largestNumber = numbers[numbers.length-1];
        int minNumber = numbers[0];
        System.out.println("largest number is : "+largestNumber);
        System.out.println("minimum number is "+minNumber);//for minimum we use sort
        System.out.println("====");

    }
}
