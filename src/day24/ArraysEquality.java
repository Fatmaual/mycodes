package day24;

import java.util.Arrays;

public class ArraysEquality {
    public static void main(String[] args) {
        int[] scores1 ={2,5,6,7,3,34,6};
        int[] scores2 ={22,45,6,37,3,6,9,};
        int[] scores3 = {2,5,6,7,3,34,6};
        int[] scores4 ={5,3,34,6,2,7,6};
        System.out.println(scores1==scores2);
        System.out.println(scores1==scores3);
//eger arraylerin esitligini olcmek istiyorsak;
boolean isS1S2Equals = Arrays.equals(scores1,scores2);
        System.out.println("eger birbirleri ile ayni icerikdeler ise : "+isS1S2Equals);
boolean isS1S3Equals = Arrays.equals(scores1,scores3);
        System.out.println("eger score1 ayni icerikde ise score3 : "+isS1S3Equals);
boolean isS3S4Equals = Arrays.equals(scores3,scores4);

        System.out.println("Sorting score 3 and score 4 then compare equality : "+isS3S4Equals);
        Arrays.sort(scores3);
        Arrays.sort(scores4);

        isS3S4Equals = Arrays.equals(scores3, scores4);
        System.out.println("AFTER SORTING : is score3 has same content as score4  = " + isS3S4Equals);

        ;

    }
}
