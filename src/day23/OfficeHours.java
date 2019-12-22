package day23;

import java.util.Arrays;

public class OfficeHours {
    public static void main(String[] args) {
        int num=0;
        int[] nums = new int[4];
        nums[0]=5;
        nums[1]=num;
        nums[2]=25;
        nums[3]=22;
        System.out.println(Arrays.toString(nums));
        System.out.println("how many numbers in array?"+ nums.length);
        System.out.println(nums[1]);
        System.out.println("last value in array :"+nums[nums.length-1]);
        System.out.println("middle value is: "+nums[nums.length/2]);
        int[]newNums = new int[]{-45,1,2,456,3,4,5,7};
        System.out.println(newNums[newNums.length/2]);
        int max = newNums[0];
        int secondMax =newNums[0];
        int min = newNums[0];
        for (int index = 0; index <newNums.length ; index++) {
            if(newNums[index]>max){
                max=newNums[index];
            }
            if(newNums[index]>secondMax && newNums[index]!=max ){
                secondMax=newNums[index];
            }
        }
        System.out.println("max is :"+max);

    }
}
