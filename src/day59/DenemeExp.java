package day59;

import java.util.ArrayList;
import java.util.Arrays;

public class DenemeExp {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<Integer>();
        list.addAll(Arrays.asList(1,2,3));

        try {
            System.out.println(list.get(10));
            System.out.println("checked exception occurred in ArrayList");

        }catch(IndexOutOfBoundsException e){
            System.out.println("unchecked exception occurred in ArrayList");
        }
        try{
           Thread.sleep(1000);
            System.out.println("caught it try blocked and checked exp");
        }catch(Exception e){
            System.out.println("unchecked and catch block");

        }
int []nums={1,3,5};
        try{
            System.out.println(nums[10]);
        }catch(Exception e1){
            System.out.println();

        }

    }

    }

