package day23;

import java.util.Scanner;

public class ArrayAndCounting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int [5];
        for (int x = 0; x <numbers.length ; x++) {
            System.out.println("enter your number"+ (x+1)+":");
            numbers[x]=scan.nextInt();
        }
        for (int x = 0; x <numbers.length ; x++) {
            System.out.println(numbers[x]+" ");


        }
    }
}
