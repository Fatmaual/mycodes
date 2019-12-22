package day27;

import java.util.Arrays;

public class MultiDimensionalArrayPractice {
    public static void main(String[] args) {
        String[][] names ={{"Rukhshona","Ghoya",},{"Hasan","Tetiana"}};
        System.out.println(names[1][0]); //print hasan
        System.out.println(names[1][1]);//tetiana
        names[1][1]="Dilsat";// tetianayi dilsat ile degistirdik
        System.out.println(Arrays.toString(names[1]));//hasan ve dilsat print out aldim
        //tum isimleri almak istiyorum oyuzden deeptostring
        System.out.println(Arrays.deepToString(names));//tum arraylers icin
        System.out.println("=====");

        int[][] numbers={{1,2,3},{4,5,6},{7,8,9},{10,11,12,13}};
       for (int i = 0; i <numbers.length ; i++) {
 //  System.out.println(Arrays.toString(numbers[i]));
           for (int j = 0; j <numbers[i].length ; j++) {
               System.out.print(numbers[i][j]+ " ");

               //if i wanna get even numbers;
               }

           }
        System.out.println("=======");
        int[][] ages={{10},{12,13,14,16,17},{19,20,21,22,23}};
        for (int i = 0; i <ages.length ; i++) {
            for (int j = 0; j <ages[i].length ; j++) {
                if(ages[i][j]%2!=0){// if(ages[i][j]%2==0 ama bunda continue kullanma
                    continue;
                }
                System.out.print(ages[i][j]+" ");
            }
        }
        System.out.println("-====");
int[]arr1D={1,2,3};
        for(int each:arr1D){
            System.out.println(each+" ");
        }
        System.out.println("====");
        int[][]arr2D={{10,20,30},{40,50,60,70,80,90,100}};
        for(int[]each1DArray: arr2D){
            for(int eachElement: each1DArray)
            System.out.print(eachElement+" ");
        }
    }
}
