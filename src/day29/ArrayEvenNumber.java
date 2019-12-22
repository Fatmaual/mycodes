package day29;

import java.util.Arrays;

public class ArrayEvenNumber {
    public static void main(String[] args) {
        int[] numbers = new int[50];
        numbers[0] = 0;
        numbers[1] = 2;
        numbers[2] = 4;
        numbers[3] = 6;
        numbers[4] = 8;
        numbers[5] = 10;
        numbers[49] = 198;
        for (int i = 0; i <numbers.length ; i++) {
            numbers[i]=i*2;

        }
        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i <numbers.length ; i++) {
            numbers[i]=i*3;
        }
        System.out.println(Arrays.toString(numbers));
    }

}
