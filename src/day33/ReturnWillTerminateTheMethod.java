package day33;

import java.util.Scanner;

public class ReturnWillTerminateTheMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number more than 10");
        int number= scan.nextInt();
        if(number<10){
            return;//return is just like a break for here. cunku  sadece bir option verdin here.
            //retrun bu sekil kullanabiliriz
        }
        System.out.println("happy holidays");
        System.out.println("2 days of !!!!yaayyy");
    }
}
