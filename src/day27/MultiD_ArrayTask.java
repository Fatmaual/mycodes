package day27;

public class MultiD_ArrayTask {
    public static void main(String[] args) {
        //ilk elementin max oldugunu dusunerek yola cikiyorum
        //heerbir numarayi check yapmak icin loop almam lazim nested loop for loop and for each loop
        int[][]numbers={{12,11,10,19},{19,20,15},{100,90,89,7888} };
        int max=numbers[0][0];
        for (int i = 0; i <numbers.length ; i++) {// bu formulle each arrays ' items checked
            for (int j = 0; j < numbers[i].length; j++) {//bu formullede hepsini checked yapiyorum
                if(max<numbers[i][j]){
                    max=numbers[i][j];
                }
            }
        }
        System.out.println(max);
        //solution 2:
        int max2 = numbers[0][0];
        for(int[]herbirArray :numbers){
            for(int herbirItem :herbirArray){//buraya kadar formulu verdik ve tum itemlari
                                             // tanimladik simdi max bulalaim
               if(max2<herbirItem){
                   max2=herbirItem;
               }
            }
        }
        System.out.println(max2);
        //finding the minimum number;
        int min =numbers[0][0];
        for (int i = 0; i <numbers.length ; i++) {
            for (int j = 0; j <numbers[i].length ; j++) {
                if(min>numbers[i][j]){
                    min=numbers[i][j];
                }

            }
        }
        System.out.println(min);
    }
}
