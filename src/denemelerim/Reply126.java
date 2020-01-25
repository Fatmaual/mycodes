package denemelerim;

import java.util.Arrays;
import java.util.Scanner;

public class Reply126 {
    public static void main(String[] args) {
      //  int[][] twoDim={{2,3,7},{4,8,9}};
       // int row=2, col=3;
        int[][]two =twoDArray(2,5);
        System.out.println(Arrays.deepToString(two));


}
public static int[] getNumbers1ToX(int num){
       int []arr =new int[7];
    for (int i = 0; i <arr.length; i++) {
        arr[i]=i+1;

    }
    return arr;
}
public static int[][] twoDArray(int row, int col) {
        int [][] arr2D= new int [row][col];
    for (int i = 1; i <=row ; i++) {
        for (int j = 1; j <=col ; j++) {
            arr2D[i-1][j-1]=j;

        }

    }
    return arr2D;


    }
}


