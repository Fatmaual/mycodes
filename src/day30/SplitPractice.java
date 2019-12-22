package day30;

import java.util.Arrays;

public class SplitPractice {
    public static void main(String[] args) {
        String car ="Lexus-IS-F";
        String[] carSplitted=car.split("-",2);
        System.out.println("car bolmelere ayrildi "+ Arrays.toString(carSplitted));
        System.out.println("car in tam anlamiyla modeli "+car);
        String model = carSplitted[1];
        System.out.println("carin modeli : "+model);

    }
}
