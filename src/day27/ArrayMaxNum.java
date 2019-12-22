package day27;

public class ArrayMaxNum {
    public static void main(String[] args) {
        //finding max
        int[] nums ={100,1000,9999,8888,9999,1231,2345};
        int max =nums[0]; //assumption probably true or not true
        for (int i = 0; i <nums.length ; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
        }
        System.out.println("first max number is :"+ max);
        int secondMax = nums[0];
        for (int i = 0; i <nums.length ; i++) {
            if(secondMax<nums[i] && nums[i]!=max){
                secondMax=nums[i];
            }
        }
        System.out.println("second max number is : "+secondMax);
    }
}
