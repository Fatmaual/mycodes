package Denemelerim;

import java.util.Arrays;

public class december15ArraysDimensional {
    public static void main(String[] args) {
        int[][] numbers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {2, 4, 6, 7}};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j <numbers[i].length ; j++) {
                System.out.print(numbers[i][j]+" ");

            }
        }
        System.out.println("\n----");
   int[]arr1D= {1,2,3};
        for(int herbir:arr1D){
            System.out.println(herbir+" ");
        }
        System.out.println("\n-----");
        int[][]arr2D= {{1,2,3},{2,5,4},{5,7,9100,87,34,23,0}};
        for (int[] herbirArray: arr2D) {
            for(int herbirelement:herbirArray){
                System.out.print(herbirelement+" ");
            }

        }
    }

}