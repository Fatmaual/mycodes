package day29;

import java.util.Arrays;

public class ArrayString3 {
    public static void main(String[] args) {
        //given a string with hero code and name seperated by -
        //heroX=superman- ******* yaz
        String hero1 = "Superman-Clark J Kent";
       String[] heroSplitted =hero1.split("-");
      String heroAdi = heroSplitted[0];//superman
     String fullName= heroSplitted[1];//clark j kent
        int nameCharacterCount = fullName.length();
        String stars = "";
        for (int i = 0; i <nameCharacterCount ; i++) {
            stars=stars+"*";


        }

       // System.out.println(fullName); superman clark j kent
       // System.out.println(stars);  *******  -->>> now time to concatenate!!!
        String herox = heroAdi+ "-"+stars;
        System.out.println("hero1 = "+hero1);
        System.out.println("herox : "+herox);



    }
}
