package day34;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Enumeration;

public class PracticeMethodWithNumbers {
    public static void main(String[] args) {
  //create 3 digit numbers if any digit is not in the range then don't print it out
 //       int digit1, digit2, digit3;
   //digit1=3;
   //digit2=7;
   //digit3=6;
     //   int numbers = digit1*100+digit2*10+digit3;
       // System.out.println("numbers = "+ numbers);
        int result1=buildDigitNumber(6,4,0);
        System.out.println("result1 = " + result1);
        int result2= buildDigitNumber(6,14,0);
        System.out.println("result2 = " + result2);
      //System.out.println(result1+result2); ///-->>ERRORRRRRR
        System.out.println(" result 1 and result 2 : "+(result1+result2));
        System.out.println(result1+result2 +" is; result of --> result 1 and result 2 ");

    }
    public static int buildDigitNumber(int digit1, int digit2, int digit3) {
        if (digit1 < 0 || digit1 > 9) {
            digit1 = 0;
        }
        if (digit2 < 0 || digit2 > 9)
            digit2 = 0;
    if(digit3<0 || digit3>9){
digit2=0;
    }

        int numbers =digit1*100+digit2*10+digit3;
        return numbers;
    }
}
