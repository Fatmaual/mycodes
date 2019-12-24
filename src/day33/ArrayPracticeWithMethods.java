package day33;

import java.util.Arrays;

public class ArrayPracticeWithMethods {
    public static void printArrayItems(int[]numbers){
        System.out.println("Array has items "+ Arrays.toString(numbers));
    }
    public static void main(String[] args) {
        printArrayItems(new int[]{1,3,4,5,});
        int []scores={2,7,0,9,10};
        printArrayItems(scores);
    }
}
