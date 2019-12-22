package day22;

public class ArrayIntro {
    public static void main(String[] args) {
        int number1 =10;
        System.out.println("number1 = " + number1);
       // int [] number2 = new int[10];
        int [] scores = new int[4]; //count of item is 4 kesin rakam 4!
        scores[0] = 95;
        scores[1] = 70;
        scores[2]=88;
        scores[3]=100; //kesinlikle 4 score girdik cunku osekil saydik!
        //let's print out one by one
        System.out.println( scores[0]);
        System.out.println( scores[1]);
        System.out.println( scores[2]);
        System.out.println( scores[3]);
        //updating the value at certain index
        scores[1]=99 ;
        System.out.println(scores[1]);
        //arrayin sizeni kesinlikle degistiremezsin ayrica sizr kesinliklemunutma
        int [] numbers = new int[3];
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);


      //  byte [] data = new byte[4];
        //     data[0] =50;
          //   data[1]= 45;
            // data[2]=60;
             //data[3]=100;
        //System.out.println(data[0]);
        //System.out.println(data[1]);
        //System.out.println(data[2]);
        //System.out.println(data[3]);
        byte []data = new byte[4];
        data[0] =10;
        data[1]=20;
        data[2]=30;
        data[3]=40;
        System.out.println(data[0]);
        System.out.println(data[1]);
        System.out.println(data[2]);
        System.out.println(data[3]);

        String[] houseHold = new String[6];
        houseHold[0]="Neset";
        houseHold[1]="Fatma";
        houseHold[2]="Kerem";
        houseHold[3]="Esad";
        houseHold[4]="Cevdet";
        houseHold[5]="Nimet";
        System.out.println(houseHold[0]);
        System.out.println(houseHold[1]);
        System.out.println(houseHold[2]);
        System.out.println(houseHold[3]);
        System.out.println(houseHold[4]);
        System.out.println(houseHold[5]);


    }
}
