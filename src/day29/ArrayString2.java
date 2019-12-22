package day29;

import java.util.Arrays;

public class ArrayString2 {
    public static void main(String[] args) {
        //hero code is superman and identity is clark kent
        //the initial of the hero is ck
        //split this string by dash to get 2 pieces of string into a string array
        String hero1 = "superman-clark kent";
        String[] heroSplitted = hero1.split("-");
        System.out.println("hero splitted "+ Arrays.toString(heroSplitted));
        //hero code is superman and identity is clark kent
       // System.out.println("hero code is "+heroSplitted[0]+" and identity is "+heroSplitted[1]);

        ///ikinci yol
        String heroCode =heroSplitted[0];
        String heroFullname  =heroSplitted[1];
        System.out.println("hero code is "+hero1+" and identity is "+heroFullname);

        //DIGER TASK
        //get hero' initial CK
//i can just use fullname variable to finish this task
        //logic 1 get the first letter of fullname then get the letter after the space ve concatenate
        //ama bu durumda ya middle name ise last name ya da bilmiyorsam
        //solution instead of looking for the letter after first space look for last index of the space then
        //then get next character
        //str.chartat(str.length-1
        //arr[arr.length-1]


        //logic2
        //bizim herhalukarda full name mimiz var. split yapiyoruz ve frist name last name aliyoruz
        //get the first letter of fullanme
        //rhen get the last name using last item index
        //get the first character then concatenate
        //clark kent -->[clark kent,] clark->c kent ->k --->ck

        String[] fullnameSplitted = heroFullname.split(" ");
        System.out.println("ad ve soyadi split ile ayirdik: "+ Arrays.toString(fullnameSplitted));
        //last name will be always LAST ELEMENT OF SPLITTED FULL NAME
        String lastName = fullnameSplitted[fullnameSplitted.length-1];
        System.out.println("initial of the hero is: "+ heroFullname.charAt(0)+lastName.charAt(0));





    }
}
