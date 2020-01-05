package day36;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;

public class MethodPractice2 {
    public static void main(String[] args) {
        /**
         *  write a static void method to accept a long array.
         *     It should swamp first value with last value of the array
         */
        long[] myLongs= {6L,11L,44L,32L,65L};
        System.out.println("before swamp myLongs "+Arrays.toString(myLongs));
        swampFirstAndLastValue(myLongs);
        System.out.println("after swamp myLongs "+ Arrays.toString(myLongs));

        long[]myNums1 = new long[5];
        System.out.println("myNums 1 "+Arrays.toString(myNums1));
        String[] names = new String [5];
        System.out.println("names "+Arrays.toString(names));
        long [] myNums2 = new long[5];
        System.out.println("myNums 2 "+Arrays.toString(myNums2));

    }
    public static void swampFirstAndLastValue(long[] nums){
       //for swamp we need first and last element
        //temp aliyorsun tea icine koyarak holding yapiyorsun ki tea nin icine kahve koymak icin
        //sonra tea ni kahvenin icine tekrar koyuyorsun
       long temp= nums[0]; //putting tea in the teacup to temp cum
       nums[0]=nums[nums.length-1]; //putting coffe into your teacup
       nums[nums.length-1]=temp; //putting tea (in temp cup) into coffee cup

    }
}
