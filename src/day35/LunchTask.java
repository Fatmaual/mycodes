package day35;

public class LunchTask {
    public static void main(String[] args) {
        // Use this number IPR2012-00001 and store the year into a int variable
// This case number always start with 3 character either IPR , PGR , CBM , DER
// followed by year , followed by dash and 5 digit number
      String caseNumber = "IPR2012-00001" ;
       // int year ; //-- get 2012 out of it
    int year=Integer.parseInt(caseNumber.substring(3,7));
        System.out.println("year is : "+year);
        int  number =Integer.parseInt(caseNumber.substring(8));
        System.out.println(number);
        float f6=Float.parseFloat("3.14f");
        System.out.println(f6);
    }

    }

