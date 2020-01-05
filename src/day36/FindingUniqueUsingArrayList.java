package day36;

import java.util.ArrayList;

public class FindingUniqueUsingArrayList {
    public static void main(String[] args) {
       int[] nums={11,33,44,11,33,44,22,22,55,44,33};
        ArrayList<Integer> uniquelst= new ArrayList<>();
        //I want to add items to uniquelst if it does not already contains that item
        for(int each:nums){
            //System.out.println("each items : "+each);
            if(! uniquelst.contains(each)){
                uniquelst.add(each); 
            }
        }
        System.out.println("uniquelst = " + uniquelst);
    }
}
