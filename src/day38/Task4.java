package day38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        /**
         * Given a ArrayList of 10 String(yes String) as scores "79" , "54" , "100", "65", "44"....
         * * print pass if its more than 60 fail if not
         * * count how many score are more than 90
         * * get the average score
         * * update the values with score-grade pair
         *   for example
         * 79C , 54F, 100A, 65D, 44F , 89B , 95A
         * Optionally create 4 methods according to above criteria
         * Add numbers2 list to numbers1 list without duplicate items from numbers 2
         * Hint : removeAll , addAll bulk operations (gave away too much?)
         */
   ArrayList<String> scores=new ArrayList<>(Arrays.asList("79","54","100","65","44","43","65","87","98","90"));

        System.out.println(Score60(scores));
        System.out.println(Score90(scores));
      //  System.out.println(AvarageScore(scores));
        List<Integer> numbers1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9) ) ;
        List<Integer> numbers2 = new ArrayList<>(Arrays.asList(2,4,5,6,7,8,9,12,17,19) ) ;
        numbers2.removeAll(numbers1);
        numbers1.addAll(numbers2);
        System.out.println(numbers1);
        System.out.println(numbers2);
    }
   public static ArrayList<String> Score60(ArrayList<String> scores){
        for(String each:scores){
            if(Integer.parseInt(each)>60){
                System.out.println(each+ " passed");
            }else{
                System.out.println(each+ " failed");
            }
        }
        return scores;
   }
   public static ArrayList<String> Score90(ArrayList<String> scores){
        int count=0;
        for(String each:scores){
            if(Integer.parseInt(each)>90){
                count++;
            }
        }
        return scores;
   }

}
