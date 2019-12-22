package day24;

import java.util.Arrays;

public class ArraysClassMethods {
    public static void main(String[] args) {
        String[] superHeros={"Superman","Batman","Wonder Woman", "Aquaman","Cyborg","Falsh"};
        System.out.println(Arrays.toString(superHeros));
        String superHeroAsString = Arrays.toString(superHeros);
        System.out.println(superHeroAsString);
        System.out.println(superHeroAsString.charAt(0));
        int[] numbers={10,44,55,3,78};
        System.out.println("Arrays.toString(numbers) Result : ");
        System.out.println(Arrays.toString(numbers));

    }
}
