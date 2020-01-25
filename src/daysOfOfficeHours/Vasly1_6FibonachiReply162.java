package daysOfOfficeHours;

import java.util.Scanner;

public class Vasly1_6FibonachiReply162 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        fib(num);
    }

    public static void fib(int num){
        //WRITE YOUR CODE HERE
        int result=0;
   int num1=0;
   int num2=1;
   if(num==0){
      result=0;
   }
if(num==1){
    result=1;
}
        for (int x = 2; x <=num ; x++) {
            result=num1+num1;
            num1=num2;
            num2=result;
        }
        System.out.println(result);
    }
}
