package day22;

import java.util.Scanner;

public class ArraywithScanner {
    public static void main(String[] args) {
        //creating int array  with capacity 10  and assigning it to numbers variable
        Scanner scan = new Scanner(System.in);
       int [] numbers = new int[10];
        for (int x = 0; x <numbers.length ; x++) {
            System.out.println("enter the numbers :"+ (x+1));
            numbers[x]=scan.nextInt();

        }

    }
}
