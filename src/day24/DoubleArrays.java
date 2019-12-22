package day24;

import java.util.Arrays;

public class DoubleArrays {
    public static void main(String[] args) {
        double[] price = {2.99, 76.89,5.90}; //after that how do i save this
        System.out.println("Arrays.toString(prices)result :"+Arrays.toString(price));//we can see what is inside like this
        String priceString = Arrays.toString(price);
        System.out.println("priceString = " + priceString);//arraysin icindekiler

        for (int x = 0; x <priceString.length() ; x++) {
            System.out.println("character at index "+x+" is :"+priceString.charAt(x));

        }
    }
}
