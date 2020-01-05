package day36;

import java.util.ArrayList;
import java.util.List;

public class ArrayListIntro {
    public static void main(String[] args) {
     //how do we create an ArrayList Object
        ArrayList<String> lst1= new ArrayList<>();
      //Correct way to create arraylist object that store whole number
      //is to use Wrapper class type.Primitive type is Forbiddeennn!!!!
        ArrayList<Integer> lst2= new ArrayList<>();
        ArrayList<Long> lst3= new ArrayList<>();
        ArrayList<Double> lst4= new ArrayList<>();
        //optionally I can create in this way;
        List<String> myLst= new ArrayList<>();

    }
}
