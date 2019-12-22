package day24;

import java.util.Arrays;
import java.util.Scanner;

public class OfficeHours2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please type your languages thay you know for Java");
        String l1 = scan.next();
        String l2 = scan.next();
        String l3 = scan.next();
        String[]languages={l1,l2,l3};
        System.out.println(Arrays.toString(languages));
        for(String lan : languages){
            System.out.println("here is the languages: "+lan);

        }
        for (int languageIndex = 2; languageIndex >=0; languageIndex--) {

        }



    }
}
