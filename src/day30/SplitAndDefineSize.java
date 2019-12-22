package day30;

import java.util.Arrays;
import java.util.Scanner;

public class SplitAndDefineSize {
    public static void main(String[] args) {
        //now if I wanna get two pieces that's all!
        // System.out.println("sentence size: "+ splitsentence.length);
        String sentence="I love Java Coffee Chocolate MyKids";
        String[] splitsentence1 = sentence.split(" ");
        String[] splitsentence2=sentence.split(" ",4);//limit diyor ya kac bolmeye ayirmak
         String[] splitsentence3=sentence.split(" ",3);// istersin diyor!!!!
        String[] splitsentence4=sentence.split(" ",5);
        String[] splitsentence5=sentence.split(" ",6);
        String[] splitsentence7=sentence.split(" ",7);
        System.out.println(Arrays.toString(splitsentence1));
        System.out.println(Arrays.toString(splitsentence2));
        System.out.println(Arrays.toString(splitsentence3));
        System.out.println(Arrays.toString(splitsentence4));
        System.out.println(Arrays.toString(splitsentence5));
        System.out.println(Arrays.toString(splitsentence7));
        String car="Mzda-MY-5";
        String[] carSplitted =car.split("-",2);
        System.out.println(Arrays.toString(carSplitted));
    }
}
