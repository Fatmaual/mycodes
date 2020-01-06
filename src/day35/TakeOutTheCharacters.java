package day35;

import java.util.Arrays;

public class TakeOutTheCharacters {
    public static void main(String[] args) {
        /**
         * // Use this number IPR2012-00001 and store the year into a int variable
         * // This case number always start with 3 character either IPR , PGR , CBM , DER
         * // followed by year , followed by dash and 5 digit number
         * String caseNumber = "IPR2012-00001" ;
         * int year ; //-- get 2012 out of it
         */
        String caseN="IPR2012-00001";
      String[] caseSplit=caseN.split("-");
       // System.out.println(Arrays.toString(caseSplit));
        String firstPart=caseSplit[0];
        firstPart=firstPart.substring(3);
        int year=Integer.parseInt(firstPart);
        System.out.println(year);
        String secondPart= caseSplit[1];
        int numberOut=Integer.parseInt(secondPart);
        System.out.println(secondPart);

        System.out.println("====second way===");
        System.out.println(yearOut("IPR2012-00001"));
        System.out.println(yearOut("CBM2000-00001"));
        System.out.println(yearOut("DER2019-00001"));


    }
    public static int yearOut(String caseNumber){
        if(!(caseNumber.startsWith("IPR") || caseNumber.startsWith("CBM") ||
                caseNumber.startsWith("DER"))){
            return 0;
        }else{
            return Integer.parseInt(caseNumber.substring(3,7));
        }
    }
}
