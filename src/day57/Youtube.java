package day57;

import java.util.*;
public class Youtube {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int x =1;
       do {
           try {
               System.out.println("Enter the number : ");
               int number1 = input.nextInt();
               System.out.println("enter the second number: ");
               int number2 = input.nextInt();
               int sum = number1 / number1;
               System.out.println(sum);
               x=5;

           } catch (Exception e) {
               System.out.println("you can't do that");
           }
       }while(x==1);
    }
}
