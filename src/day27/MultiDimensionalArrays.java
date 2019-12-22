package day27;

import java.util.Arrays;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
       // int[] arr ={1,2,3};
        //two demesional arrays contains demesional arrays
        int [] [] arr2D = { {1,2,3},{4,5,6}};
        System.out.println(arr2D.length);
        System.out.println(Arrays.toString(arr2D[0]));
        System.out.println(Arrays.toString(arr2D[1]));
        System.out.println(arr2D[0][2]);//3 almak icin
        System.out.println(arr2D[1][1]);// 5 almak icin
        System.out.println(arr2D[1]);//error verir
        System.out.println(Arrays.toString(arr2D[1]));
        System.out.println(Arrays.deepToString(arr2D));

    }
}
