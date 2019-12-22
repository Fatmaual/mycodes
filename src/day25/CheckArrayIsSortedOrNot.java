package day25;

import java.util.Arrays;

public class CheckArrayIsSortedOrNot {
    public static void main(String[] args) {
        int[]nums={13,31,8,5,21,2};
        System.out.println(" numbers = " + Arrays.toString(nums));
        int numsItemCount =nums.length;
        int[] numsCopy = new int[numsItemCount];//arrayin kopyasini aldik
        numsCopy[0]=nums[0];
        numsCopy[1]=nums[1];
        numsCopy[2]=nums[2];
        numsCopy[3]=nums[3];
        numsCopy[4]=nums[4];
        numsCopy[5]=nums[5];

        for (int x = 0; x < numsItemCount; x++) {
            numsCopy[x]=nums[x];

        }
        System.out.println("before sort of numbers  = " + Arrays.toString(numsCopy));
        Arrays.sort(numsCopy);//sortdan sonra buyukten kucuge siralaniyor sort lowest to highest yapiyor
        System.out.println("After sort "+Arrays.toString(numsCopy));
        if(Arrays.equals(nums,numsCopy)){
            System.out.println("this array is already sorted");
        }else{
            System.out.println("this array is not already sorted");
        }
    }
}
