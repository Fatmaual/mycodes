package day24;

import java.util.Arrays;
import java.util.Scanner;

public class OfficeHours {
    public static void main(String[] args) {
        String[] cars = {"bmw", "wv" ,"audi"};
        System.out.println(cars[0]);
        for (String  carModel:cars){
            System.out.println(carModel);
            int eachCarCount = cars.length;
            for (int carsIndex = 0; carsIndex <= 2; carsIndex++) {
                System.out.println("here is your car "+ cars[carsIndex]+" count : "+eachCarCount);
            }

        }
        System.out.println("===============");
        int[] ages ={23,43,5,7,87};
        System.out.println(ages[2]);
        System.out.println(ages[3]-ages[2]);
        for(int eachOfStudent: ages){
            System.out.println("each student age is: "+eachOfStudent);
            System.out.println();
        }
        System.out.println(Arrays.toString(ages));


    }
}
