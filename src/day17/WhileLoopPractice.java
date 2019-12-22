package day17;

public class WhileLoopPractice {
    public static void main(String[] args) {
        //skip counting by 3 from 0 till 30-->3  6  9 12 15 18 21  24 27 30

       // int counting  = 0;  //0dan basliyorum neden 1 den degil nezaman bitirecegim<= ama 0 gormek istemiyorum ??
        //while(counting<=30 ) {
          //  System.out.print(counting+ " ");
           // counting+=3;

            int number = 0;
            while(number<50){  // number <=50 esittir koymadigim icin 2den basladi 0dan baslamak yerine
                number+=2;
                System.out.print(number+ " ");
            }
        System.out.println();
int number2  = 0;
            while(number2<50){
                number2 = number2+=3;
                System.out.print(number2+" ");
            }
 //yada nasil yazardik; int number = 1;
 //while(number <=50) {
 // System.out.println();
 //number +=2;

 int number3 =0;
            while(number3 <=50) {
                if(number3 %2 == 0){
                    System.out.println(number3+" is even number");
                }else{
                    System.out.println(number3+ " is odd number");
            }
   ++number3;
   }



        }




    }

