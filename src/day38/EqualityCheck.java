package day38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EqualityCheck {
    public static void main(String[] args) {
        List<Integer> num1= new ArrayList<>(Arrays.asList(200,300,600,700,800));
        List<Integer> num2 = new ArrayList<>(Arrays.asList(200,300,600,700,800));
        List<Integer> num3 = new ArrayList<>(Arrays.asList(300,200,700,600,800));
        System.out.println(" is num1 equals to num2?  " +num1.equals(num2));
        System.out.println("num2.equals(num3) ? " + num2.equals(num3));

    }
}
