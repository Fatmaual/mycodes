package day36;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {
        //create an array list object of long and assign it to a variable
        ArrayList<Long> lst = new ArrayList<>();
       // add item , read item, update item, remove the item, check the location
     //  C.D.U.D(YUKARIININ ACILIMI)
        lst.add(12L);//12 automatically converted to new Long (12L) ;bc ArrayList
        lst.add(100L);
        lst.add(150L);
        lst.add(200L);
        System.out.println("lst = " + lst);
        //counting items inside arraylist
        System.out.println("counting item using lst.size() and the list size:  "+lst.size());
        // getting items inside ArrayList object
        System.out.println("first item is : lst.get(0) = "+lst.get(0));
        System.out.println("second item is : lst.get(1) = "+lst.get(1));
        System.out.println("third item is : lst.get(2) = "+lst.get(2));
        System.out.println("fourth item is : lst.get(3) = "+lst.get(3));

          for (int i = 0; i <lst.size() ; i++) {
              System.out.println("item of lst : " + lst.get(i));
          }
             long  sum =0;
              for (int x = 0; x < lst.size(); x++) {
                 sum+=lst.get(x);
               
        }
        System.out.println("lst sum is : " + sum);
        // get the max
        long max = lst.get(0);
        for (int x = 0; x <lst.size() ; x++) {
            if(lst.get(x)>max) {
                max = lst.get(x);
            }
        }
        System.out.println("lst of max is : " + max);
    }
}
