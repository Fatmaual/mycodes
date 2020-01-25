package day38;

import java.util.*;

public class SortingAListObject {
    public static void main(String[] args) {
        /** Sorting an Array in ascending natural order
        lst.sort( Comparator.naturalOrder() );
        System.out.println("After Sorting in low to high (natural) order = \n\t" + lst);
        lst.sort( Comparator.reverseOrder() );
        System.out.println("After Sorting in high to low (reverse) order = \n\t" + lst);
        DOES THIS WORK FOR ARRAY ? SURE IT DOES
         overloaded version of sort method accept a comparator
        Arrays.sort( arrOutOfList,Comparator.reverseOrder() );
         */
        List<Integer> nums=new ArrayList<>(Arrays.asList(300,200,700,600,800));
        System.out.println("nums before sort: "+nums);
        //2 ways to sort an ArrayList
        //Use Collections utility class (just like Arrays utility calss for array objects
        //Collections is a class coming from Java.util package
        //it has a lot of ready method to work with Collection objects like ArrayList and so on
        Collections.sort(nums);
        System.out.println("nums after sort: " + nums);
        //This version of sort method accept 2 arguments
        //1st is the list to be sorted
        //2nd a Comparator Object that contains comparing logic
        //good news is there is ready method already in Java
        //we can get reverse order comparator object by calling
        //comparator.reverseOrder() just take it and use it

        Collections.sort(nums, Comparator.reverseOrder());
        System.out.println("nums after second sort: "+nums);
        //List itself also has sort method that accept one Comparator Object
        //simply way to get Comparator objects are
        //Comparator.naturalOrder()-->lower to highest order
        //Comparator.naturalOrder()-->higher to lower order
        nums.sort(Comparator.naturalOrder());
        System.out.println("nums after using : nums.sort(Comparator.naturalOrder() \n "+nums);
        nums.sort(Comparator.reverseOrder());


    }
}
