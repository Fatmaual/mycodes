package day38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddMethodPractice {
    public static void main(String[] args) {
        ArrayList<Integer> nums1 = new ArrayList<>();
        nums1.add(123);
        nums1.add(100);
        nums1.add(223);
        nums1.add(133);
        nums1.add(125);
        nums1.add(122);
        ArrayList<Integer> nums2 = new ArrayList<>();
        nums2.add(2000);
        nums2.add(1000);
        //add all nums1 to nums2
        nums1.addAll(nums2);
        System.out.println("nums 1 : " + nums1);
        System.out.println("nums 2 : " + nums2);
        //add 4 items to nums2 using add all 100, 200,300,400
        nums2.addAll(Arrays.asList(100,200,300,400));
        System.out.println("nums2 after adding 4 items: " + nums2);
        /**
         Given List of names with various character count,
         Remove any name with less than 2 characters
         and if any name has more than 10 character only keep 10 characters
         and if it has exactly 5 characters , reverse it
         Of course , Otionally make a method out of it.
   */
         List<String> newStr=new ArrayList<>(Arrays.asList("yasemincanim","fatma","I love Java","cb","a","@@##$$%%"));
        System.out.println(word(newStr));

       // System.out.println(sonuc);
    }
    public static List<String> word(List<String>newStr){

        String reverse="";
        for (int x = 0; x <newStr.size() ; x++) {
            newStr.get(x);
            if(newStr.get(x).length()<2){
                newStr.remove(x);
            }else if(newStr.get(x).length()>10){
                newStr.set(x,newStr.get(x).substring(0,11));
                } else if(newStr.size()==5){
                for (int i = newStr.get(x).length()-1; i >=0 ; i--) {
                   reverse+=newStr.get(x).charAt(i);

                }
                newStr.set(x,reverse);
            }

        }
 return newStr;
    }

}