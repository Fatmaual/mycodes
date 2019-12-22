package day27;

import day18.ForLoopIntro;

import java.util.Arrays;

public class BenimPractices {
    public static void main(String[] args) {
        int[][] numbers={{1,2,3},{4,5,6},{7,8,9},{10,11,12,13}};
        for (int i = 0; i <numbers.length ; i++) {
            for (int j = 0; j <numbers[i].length ; j++) {
                System.out.print(numbers[i][j]+" ");
            }
        }
        System.out.println("\n========");
        int[][]ages ={{10},{12,13,14,16,17},{19,20,21,22,23}};
        for (int i = 0; i <ages.length ; i++) {
            for (int j = 0; j <ages[i].length ; j++) {
                if(ages[i][j]%2!=0){
                    System.out.print(ages[i][j]+ " ");
                }
                }


            }
        }
    }

