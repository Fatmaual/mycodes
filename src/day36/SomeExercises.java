package day36;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SomeExercises {
    public static void main(String[] args) {
  int[] numsArray={1,2,3,4,5,6,9,10};
        System.out.println("before changing first index: "+ Arrays.toString(numsArray));
        changeArrayTo100(numsArray);
        System.out.println("after changed the first index"+ Arrays.toString(numsArray));
        int[]numbers=numsArray;
        System.out.println(Arrays.toString(numbers));
    }
    public static void changeArrayTo100(int[] numbers){
       numbers[0]=100;
        System.out.println("===========");
        List<String> secondTeam=new ArrayList<>();
        secondTeam.add("Akbar");
        secondTeam.add("Kuzzat");
        secondTeam.add("Muhtar");
        secondTeam.add("Vasyl");
    }
}
