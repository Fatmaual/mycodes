package day38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListBulkOperation {
    public static void main(String[] args) {
        List<String> grocerieslist= Arrays.asList("eggs","milk","butter","apple","salmon");
        System.out.println("groceries = " + grocerieslist);
        ArrayList<String> list2= new ArrayList<>(grocerieslist);
        list2.add("diet coke");
        list2.add("sugar");
        System.out.println("newLst = " + list2);
        List<String> newItemsMore= Arrays.asList("pasta","branzini","aspragus","spinach");
        //adding one list to another list
        list2.addAll(newItemsMore);
        System.out.println("final list : "+list2);

    }
}
