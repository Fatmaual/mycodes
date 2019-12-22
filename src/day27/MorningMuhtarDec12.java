package day27;

public class MorningMuhtarDec12 {
    public static void main(String[] args) {
        //unique olup olmadigini anlamak icin olan bir formul cok harika!! herseyi anlatiyor herseyi!!!!
        //muhakkak uzerinde calis!
        int[]numbers={1,1,2,2,3,4,4,5,5,6};
        for (int j = 0; j < numbers.length; j++) {
            int count =0;
            for (int i = 0; i <numbers.length ; i++) {

                if(numbers[i]==numbers[j]){
                    count++;
                }
            }
            if(count==1){
                System.out.println(numbers[j]);
            }

        }
        //write the program with string array aynisini string de yap
        String[]array={"A","A","B","C","C","D","E","E"};
        for (int y = 0; y <array.length ; y++) {
            int countY =0;
        for (int i = 0; i <array.length ; i++) {
            if(array[i].equals(array[y])){
                countY++;
            }
        }
if(countY==1){
    System.out.println(array[y]);//array[0] print out vermedi cunku unique degil!
}
    }
}
}