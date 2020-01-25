package day38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListPracticeShortWay {
    public static void main(String[] args) {
        /**
         * create 6 double in short way
         * we will just read them and will not remove and add item
         */
        List<Double> dnumber= Arrays.asList(9.99,5.55,3.76,8.99,0.99,65.67,0.99);
        //you cannot do dnumber.add(12.8)
        //or cannot code dnumber.remove(0)
        int count=0;
        for(Double eachNum:dnumber){
           if(eachNum>5){
               ++count;
           }
        }
        System.out.println("count = " + count);
        //I wanna add 2 more item if this method doesn't allow to do that than change the type of that method!!
        //we will dump everything inse of new arraylist
        ArrayList<Double> newnumbers=new ArrayList<>(dnumber);
        newnumbers.add(199.99);
        newnumbers.remove(0.99);//if you have several 0.99 will remove first occurrence of the value
        System.out.println(newnumbers);
        ArrayList<Double> oneShotNumbers= new ArrayList<>(Arrays.asList(9.99,5.55,3.76,8.99));
        oneShotNumbers.add(1,100.99);
        oneShotNumbers.remove(2);
        System.out.println("oneShotNumbers = " + oneShotNumbers);

    }
}
