package daysOfMuhtar;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class IntegerArrayList10_1 {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        for (int x = 5; x >=0 ; x--) {
            list.add(x);
        }
        System.out.println(list);
        System.out.println();
        Collections.sort(list);
        System.out.println(list);
    }

}
