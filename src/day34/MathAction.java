package day34;

import day31.Calculator_V2;

import java.util.Arrays;

public class MathAction {
    public static void main(String[] args) {
        int result1= PracticeMethodWithNumbers.buildDigitNumber(6,4,0);
        System.out.println("resut 1 is : "+result1);
   int result2=PracticeMethodWithNumbers.buildDigitNumber(3,4,1);
        System.out.println("result 2 is : "+result2);
     // in order to use Arrays class that coming from java.util package (not your package ) first we need to import
     //java.util.Arrays;
        int[] nums={2,5,87};
        System.out.println("Arrays.toStroing(nums) " + Arrays.toString(nums));
    // how can I call static method called calculate in calculater_v2 under 31 package
   //first thing first it is not in current package day 34
   //so we need to import the class-->import day31.Calculate_V2
   // in order to call static method of Calculator _V2 class,
   //Calculator_V2.yourstaticMethodName(...)
        Calculator_V2.calculate(10,20,'-');
    }

}
