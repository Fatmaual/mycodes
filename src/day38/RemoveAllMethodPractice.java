package day38;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAllMethodPractice {
    public static void main(String[] args) {
        ArrayList<Integer> nums1=new ArrayList<>();
        nums1.add(100);
        nums1.add(200);
        nums1.add(300);
        nums1.add(400);
        nums1.add(500);
        nums1.add(600);
        //I wanna remove just 100,133
     //   nums1.removeAll(Arrays.asList(100,300));
      //  System.out.println("nums1 after remove 100 and 300: " + nums1);
      //  nums1.removeAll(Arrays.asList(100,300));
       // System.out.println("nums1 after remove 100 and 300: " + nums1);
        //if I  have one of them  exist the other one is not
        nums1.removeAll(Arrays.asList(100,1000));
        System.out.println("nums1 after 2nd removing: "+nums1);
        //nothing will be happen just removing the existing number



    }
}
