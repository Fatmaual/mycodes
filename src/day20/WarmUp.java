package day20;

public class WarmUp {
    public static void main(String[] args) {
      //  int start = 10;
      //  int end = 100;
      //  int sumOdd = 0;
      //  for (int i = start; i <=end ; i++) {
       //  if(i%2==1){
         //    sumOdd += i;
 //   }
//}
//System.out.println("sumOdd = " + sumOdd);
       // int sum = 0;
      //  for(int x = 10; x <=100; x++){
     //       if(x%2==1){  // if(x%2!=0){
      //        sum = sum + x;
              
      //      }
     //   }

     //   System.out.println("sum = " + sum);
       int sumOfOdd = 0;
       int sumOfEven =0;
       for( int x = 10; x <=100; x++){
           if(x% 2==0){
               sumOfEven= sumOfEven + x;
           }else{
               sumOfOdd = sumOfOdd +x;
           }
       }
        System.out.println("sumOfEven " + sumOfEven);
        System.out.println("sumof odd "+ sumOfOdd);
    }
}
