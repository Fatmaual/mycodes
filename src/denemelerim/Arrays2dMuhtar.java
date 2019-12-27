package denemelerim;

import java.util.Arrays;

public class Arrays2dMuhtar {
    public static void main(String[] args) {

        String[][] names = {{"ali", "ayse"}, {"fatma", "asli"}};
        System.out.println(names[1][1]);
        System.out.println(Arrays.toString(names[1]));
      //  for (int x = 0; x < names.length; x++) {
    //        for (int j = 0; j < names.length; j++) {
           //     System.out.println(names[x][j] + " ");
             //   int[][] arr2D = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12, 13}};
               // System.out.println(arr2D.length);
                //System.out.println(Arrays.toString(arr2D[1]));
                //System.out.println(Arrays.deepToString(arr2D));
 int [][]ages ={{10},{12,13,14,16,17},{18,19,20,21,22,23}};
        for (int i = 0; i <ages.length ; i++) {
            for (int j = 0; j <ages[i].length ; j++) {
        if(ages[i][j]%2==0){
            continue;
        }
                System.out.println(ages[i][j]+" ");
            }
        }
        System.out.println("=========");
        int[][]arr2D={{10,20,30},{40,50,60,70,80,90,100}};
        for(int[]eachArr2D:arr2D){
            for(int eachItem:eachArr2D){
                System.out.print(eachItem+" ");
            }
        }
    }
}
