package day38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
      /**
         Create Arraylist of String and store
         teamMates
         print one by one
         print reverse
         print first last
         print 2 at a time
         concat everyone in one string separated by -
         SECOND REVERSE WITH SWAP
         for (int i = 0, j=names.size()-1; i <names.size() /2 ; i++, j--) {
         String temp= names.get(i);
         names.set(i,names.get(j));
         names.set(j,temp);
         */
        List<String> teamMates=new ArrayList<>();
        teamMates.add("ayse");
        teamMates.add("fatma");
        teamMates.add("asli");
        teamMates.add("serife");
        for (int x = 0; x <teamMates.size() ; x++) {
            System.out.print(teamMates.get(x)+"");
            if(x<teamMates.size()-1){
                System.out.print("-");
            }

        }
        System.out.println(" ");
        System.out.println("****reverse****");
        for (int x = teamMates.size()-1; x >=0 ; x--) {
            System.out.print(teamMates.get(x)+" ");
        }

        System.out.println();
        System.out.println("****print first and last***");
        System.out.println(teamMates.get(0));
        System.out.println(teamMates.get(teamMates.size()-1));
        System.out.println("******void method****");

        /** /**   Given a ArrayList of 6 Integer 1,3,7,2,12,7
         insert 100 in between each numbers
         For example :
         1,100,3 ,100, 7, 100, 2, 100, 12, 100, 7
         * first way:
         *  numbers.add(1,100);
         //numbers.add(3,100);
         //numbers.add(5,100);
         */

         ArrayList<Integer> numbers =new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(7);
        numbers.add(2);
        numbers.add(12);
        numbers.add(7);
        // System.out.println("numbers = " + numbers);
        Add100(numbers);
        System.out.println(numbers);

    }
   public static void Add100(ArrayList<Integer> numbers){
       for (int x = 1; x <numbers.size() ; x+=2) {
       numbers.add(x,100);

       }
        }

    }

