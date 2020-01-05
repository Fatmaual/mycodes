package day36;

import java.util.Arrays;

public class MethodWithParameterArray {
    public static void main(String[] args) {
      // int[] nums={1,5,3,4,7,2};
      // System.out.println("before sort "+ Arrays.toString(nums));
      //Arrays.sort(nums);
       // System.out.println("after sort: "+ Arrays.toString(nums));

        int[] nums={1,5,3,4,7,2};
        System.out.println("before change nums: "+ Arrays.toString(nums));
        changeArrayFirstItemTo100(nums);
        System.out.println("after change nums: "+ Arrays.toString(nums));
       // changeArrayFirstItemTo100(nums);
      //  System.out.println(Arrays.toString(nums));

     /**
      * what happened!
      * numbers variable are copinng inside of nums.but what is inside of nums variable?
      * int[] numbers=nums;
      * int[0] numbers=100;
      * changing value does not change original value that passed
      *
      * */

    }
    public static void changeArrayFirstItemTo100(int [] numbers){
        numbers[0]=100;
      // int []num2 = numbers;
     //   num2[3]=200;


    }
}
