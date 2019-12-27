package denemelerim;

import java.util.Arrays;

public class MethodsArrays {
    public static void main(String[] args) {
      printIntItems(new int[]{1,4,5,67,98,0,23});
      int[]scores={3,5,6,7,89,21,-1,0,8};
      printIntItems(scores);
     int []nums ={0,-1,6,7,90,34,3,23,67};
     FindMax(nums);
     FindMin(nums);
     FindSum(nums);
     Compare2Arrays(new String []{"Fatma","Asli","Kerem","Esad"},new String[]{"Secil","Yasemin"});
     //second way;
 String[] names1={"Sezgin","Ayse","Fatma"};
  String[] names2={"Senay","Ahmed","Fatma"};
  Compare2Arrays(names1,names2);
        }
    public static void Compare2Arrays(String[] item1,String[] item2 ){
        //compare 2 string arrays;
        if(item1.length>item2.length){
            System.out.println("item1 has more item");
        }else if(item2.length>item1.length){
            System.out.println("item 2 has more item");
        }else{
            System.out.println("they are equals");
        }
    }
    public static void FindSum(int[]nums){
        //FIND SUM OF THE ARRAY NUMBERS;
   int sum = 0;
  // for(int each:nums){
    // sum = sum+each;
        for (int i = 0; i <nums.length ; i++) {
                sum+=nums[i];
        }
        System.out.println("sum = " + sum);
    }
    public static void FindMin(int []nums){
        //FIND MINIMUM NUMBER;
        int min = nums[0];
        for (int i = 0; i <nums.length ; i++) {
            if (min > nums[i]) {
                min = nums[i];
            }
        }
        System.out.println("min = " + min);
    }
    public static void FindMax(int[] nums){
        //FIND MAXIMUM NUMBER;
        int max=nums[0];
        for (int i = 0; i <nums.length ; i++) {
            if(max<nums[i]){
                max=nums[i];
            }
        }
        System.out.println("max = " + max);
    }
    public static void printIntItems(int[] number){
        //print Array with int  parameter
        System.out.println(Arrays.toString(number));
    }

    }

