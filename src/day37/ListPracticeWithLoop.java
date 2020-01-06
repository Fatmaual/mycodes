package day37;

import java.util.ArrayList;
import java.util.List;

public class ListPracticeWithLoop {
    public static void main(String[] args) {
        /***
         * CREATE A LIST WITH ARRAYLIST of Integer fill it up with 1-100
         */
        List<Integer>nums=new ArrayList<>();
        for (int number = 1; number <=100 ; number++) {
            //System.out.println(number);
            nums.add(number);//the add
        }
        System.out.println("nums are 1 to 100: "+nums);

        //change all the odd number value to 0;
        //from what we observed, all the odd numbers are at even index:0,2,4,6.....
        //so we ca just work with those even index and set the value to 0 at those location
        for (int x = 0; x <nums.size() ; x+=2) {
          //  System.out.println("odd values are at index: "+x);
            nums.set(x,0);

        }
        // insert 100 to first index :
        nums.add(0,100);
        System.out.println("adding 100 for first place  "+nums);

        System.out.println("index of 20 after inserting 100 at index 0 :"+nums.indexOf(20));
    }
}
