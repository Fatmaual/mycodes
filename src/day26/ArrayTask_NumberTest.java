package day26;

public class ArrayTask_NumberTest {
    public static void main(String[] args) {
      int[] scores = {450,567,234,123,128};

     for(int everyScore:scores){
         if(everyScore>100){
             System.out.println("yes!");
         }else{
             System.out.println("not!");
         }
         System.out.println(everyScore);


        }

    }
}

