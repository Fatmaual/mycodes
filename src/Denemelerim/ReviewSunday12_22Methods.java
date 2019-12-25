package Denemelerim;

public class ReviewSunday12_22Methods {
    public static void main(String[] args) {
NumberComparision(10,60);
NumberComparision(50,10);
NumberComparision(0,0);
Rpeater("Java",3);
SkipTheNumber();
Print1ToX(5);
countDownEvenFrom50To0();

    }
    public static void countDownEvenFrom50To0(){
        for (int i = 50; i>=0 ; i--) {
            if(i%2==0){
                System.out.print(i+" ");
            }

        }
    }
    public static void Print1ToX(int x){
        //print 1 to x
        for (int i = 1; i <=x; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void SkipTheNumber(){
        //skip number 3;
        //first way;
    //     for (int i = 0; i <8; i++) {
      //      if(i==3){
        //        continue;
          //  }
            //System.out.println(i+" ");
    //    }
        //second way;
        for (int i = 0; i < 30; i=i+3) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void Rpeater(String strRepeat,int count){
        //repeat java 3 times
        for (int i = 1; i <=count ; i++) {
            System.out.println(strRepeat+" ");

        }
        System.out.println();
    }
    public static void NumberComparision(int num1, int num2){
        //comparision of num1 and num2
        if(num1>num2){
            System.out.println("num1 is more than num2");
        }else if(num2>num1){
            System.out.println("num2 is more than num1");
        }else{
            System.out.println("they are equal");
        }
    }
}
