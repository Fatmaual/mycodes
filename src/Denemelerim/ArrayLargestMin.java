package Denemelerim;

import java.util.Arrays;

public class ArrayLargestMin {
    public static void main(String[] args) {
        int[] scores = {20, 67, 0, -123, -12, 45, 67};
        int min=999999999;
        for (int x = 0; x <scores.length ; x++) {
            if(min>scores[x]){
                min=scores[x];
            }
        }
        System.out.println("min = " + min);
        int secondMin=scores[0];
        for (int x = 0; x <scores.length ; x++) {
            if(scores[x]==min){
                continue;
            }
           if(secondMin>scores[x]){
               secondMin=scores[x];
           }
        }
        System.out.println("secondMin = " + secondMin);
        int thirdMin=scores[0];
        for (int x = 0; x <scores.length ; x++) {
            if(scores[x]==min ||scores[x]==secondMin){
                continue;
            }
            if(thirdMin>scores[x]){
                thirdMin=scores[x];
            }
        }
        System.out.println("thirdMin = " + thirdMin);
    }

    }

