package day36;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;

public class ArrayListTask {
    public static void main(String[] args) {
        ArrayList<Long> lst = new ArrayList<>();
        lst.add(12L);//12 automatically converted to new Long (12L) ;bc ArrayList
        lst.add(100L);
        lst.add(150L);
        lst.add(200L);
        System.out.println("lst = " + lst);
        //I want to insert 125L between 100L and 150L, basically 2nd and 3rd item
        lst.add(2,125L);
        System.out.println("lst after adding 125L is :  " + lst);
        System.out.println("lst.get(3) is : "+lst.get(3));
        //updating value at certain index: set method
        lst.set(3,195L);
        System.out.println("new value lst.get(3) is : "+ lst.get(3));
        System.out.println("new value of index 3 and value is : "+lst);
        //removing item by its value
        lst.remove(100L);
        System.out.println("lst after removing 100 = \n\t"+lst);
        lst.remove(2);
        System.out.println("lst after removing item at index 2 : \n\t"+lst);
        System.out.println("location of 100l is using lst.indexOf(100L) : "+lst.indexOf(100L));
        System.out.println("location of 23 L is using lst.indexOf (23L) "+lst.indexOf(23L));
        //check whether a list is empty or not
        System.out.println("lst.size() >0 : "+( lst.size()>0));
        System.out.println("\n lst.isEmpty() : "+lst.isEmpty());
        //how do I delete everything inside my ArrayList
      //  lst.clear();
       // System.out.println("check after clearing lst.isEmpty : "+lst.isEmpty());

        //check whether we have certain item or not
        System.out.println("\n lst.contains(100L) : "+lst.contains(100L));
        System.out.println("\n lst.contains(10L) : "+lst.contains(10L));
        // how do I check whether a list contains an item
        //
        System.out.println();






    }
}
