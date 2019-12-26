package Denemelerim;

public class Deep2DArrayMuhtar12_15 {
    public static void main(String[] args) {
        int [][]numbers={{12,11,10,19},{19,20,15,788}};
        int max=numbers[0][0];
        for (int i = 0; i <numbers.length ; i++) {
            for (int x = 0; x <numbers[i].length ; x++) {
               if(max<numbers[i][x]){
                   max=numbers[i][x];
               }

            }
        }
       System.out.println(max);
        int Max2=numbers[0][0];
        for(int[] eachDnum :numbers){
            for(int eachItem:eachDnum){
           if(Max2<eachItem){
               Max2=eachItem;
           }
            }
        }
        System.out.println("Max2 = " + Max2);
        int min=numbers[0][0];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j <numbers[i].length ; j++) {
                if(min>numbers[i][j]){
                    min=numbers[i][j];
                }
                
            }

        }
        System.out.println("min = " + min);
    }

}
