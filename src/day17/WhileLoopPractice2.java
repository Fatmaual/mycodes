package day17;

public class WhileLoopPractice2 {
    public static void main(String[] args) {
        //print the even nums backword 100-0
        int num = 100;

    while (num >=0){

        if(num%2 == 0 ){
            System.out.println(num+ "is even number ");
        }
        --num;
    }

    int num2 = 100;
    while(num2>=0){

        if(num2 %2 != 0){   // yada susekil yazabilirsin if(num2 %2 == 1)
            System.out.println(num2+" are  odd numbers ");
        }
        --num2;



    }





        }
    }