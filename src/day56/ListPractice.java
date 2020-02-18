package day56;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ListPractice {
    public static void main(String[] args) {
        List<Integer> nums= new ArrayList<>();

        nums.add(10);
        nums.add(11);
        nums.add(12);
        nums.add(13);
        nums.add(14);
        nums.add(15);
        nums.add(16);
        nums.add(17);

        System.out.println("nums = " + nums);
        System.out.println("nums.contains(10) = " + nums.contains(10));
        System.out.println("nums.indexOf(15) = " + nums.indexOf(15));


    }
}
