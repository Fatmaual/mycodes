package day37;

import java.util.ArrayList;
import java.util.List;

public class MethodWithArrayListAsReturnType {
    public static void main(String[] args) {
        System.out.println(getListFrom1ToFinalNumber(7));
        System.out.println(getListFrom1ToFinalNumber(2));
        System.out.println(getListFrom1ToFinalNumber(20));
        List<Integer> myList = getListFrom1ToFinalNumber(25);
        System.out.println("my list is: "+myList);
 List<Integer>lst=new ArrayList<>();
 lst.add(2);
 lst.add(14);
 lst.add(34);
 lst.add(41);
 lst.add(19);
        System.out.println("lst = " + lst);
      //  lst.remove(new Integer(2));
        lst.remove(Integer.valueOf(2));
        System.out.println("lst = " + lst);


    }

    public static List<Integer> getListFrom1ToFinalNumber(int finalNumber){
        /**
         * this method will return a list of Integer that containing numbers starting
         * from 1 till final Number
         */
        List<Integer> nums=new ArrayList<>();
       // int finalNumber=100;
        for (int numbers = 1; numbers <=finalNumber ; numbers++) {
            nums.add(numbers);
        }
        System.out.println("nums are : "+nums);
        return nums;
    }

}
