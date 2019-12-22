package day24;

import java.util.Arrays;

public class ArraysMethodsSorting {
    public static void main(String[] args) {
        int[] scores = {99,44,66,23,19,55};
        System.out.println(Arrays.toString(scores));
        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));//it is assigned from lower to higher
        System.out.println("first item value : "+scores[0]);
        char[]nameChars = {'G','A','8','Z',' ','d'};
        System.out.println("before name sorting "+Arrays.toString(nameChars));
        Arrays.sort(nameChars);
        System.out.println("after sorting :"+Arrays.toString(nameChars));
        //eger characterlerdeb birini sayi ile degistirisem like ascii table yada bir characteri bos birakirsam
        //yada kucuk harf verirsem...
        System.out.println("------");
        String[] superHeros={"Superman","Batman","Wonder Woman", "Aquaman","Cyborg","Falsh","100","0","09"};
        System.out.println("before sorting :" + Arrays.toString(superHeros));
        Arrays.sort(superHeros);
        System.out.println("after sorting :"+Arrays.toString(superHeros));
        System.out.println("-------boolean sorting----sort method doesn't work boolean array");
        boolean[] fiveSwitchOnOffs ={true,false,false,true,true};
        //Arrays.sort(fiveSwitchOnOffs); doesn't work!!!!




    }
}
