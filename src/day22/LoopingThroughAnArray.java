package day22;

public class LoopingThroughAnArray {
    public static void main(String[] args) {
        int number1 =10;
        System.out.println("number1 = " + number1);
        // int [] number2 = new int[10];
        int [] scores = new int[4]; //count of item is 4 kesin rakam 4!
        scores[0] = 95;
        scores[1] = 70;
        scores[2]=88;
        scores[3]=100; //kesinlikle 4 score girdik cunku osekil saydik!

   int itemCount = scores.length;
   int lastItemIndex =itemCount-1;// no parenthesis


        for (int x = 0; x <itemCount ; x++) {
            System.out.println(scores[x]);

        }


        }

    }

