package Denemelerim;

import java.util.Arrays;

public class ArraysNameOut {
    public static void main(String[] args) {
        //store this array without Ahmed;

        String[] names = {"Gunday","Mustafa","Yasemin","Secil","Fatma","Emre","Emre"};
        int a=0;
        for (int x = 0; x <names.length ; x++) {
            if(!names[x].equalsIgnoreCase("Emre")){
                a++;
            }
        }
        int b=0;
        String[] str= new String[a];
        for (int i = 0; i <names.length ; i++) {
            if(!names[i].equalsIgnoreCase("Emre")){
                str[b]=names[i];
                b++;
            }

        }
        System.out.println(Arrays.toString(str));
    }
}
