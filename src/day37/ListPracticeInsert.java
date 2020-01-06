package day37;

import java.util.ArrayList;
import java.util.List;

public class ListPracticeInsert {
    public static void main(String[] args) {
        List<Integer> lst2 =new ArrayList<>();
        lst2.add(44);
        lst2.add(14);
        lst2.add(34);
        lst2.add(41);
        lst2.add(19);
        System.out.println("lst2 : "+lst2);
/**
 *  insert 100 right after 34: we do NOT KNOW WHERE IS 34!!
 *  we are changing the locetion og the next of it
 */
       int locationOf34Value=lst2.indexOf(34);
        lst2.add(lst2.indexOf(34)+1,100);
        System.out.println("lst2 : "+lst2);

   //add five times 100 infont of 44    --> at index (0)
        for (int x = 1; x <=5 ; x++) {
            lst2.add(0,100);

        }
        System.out.println("lst2 is : " + lst2);
        lst2.add(lst2.indexOf(41)-2,50);
        System.out.println("added 50: "+ lst2);

    }
}
