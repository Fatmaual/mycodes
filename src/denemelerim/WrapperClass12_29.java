package denemelerim;

import java.util.Arrays;

public class WrapperClass12_29 {
    public static void main(String[] args) {
        String myId="FB-457";
    String[] splitmyId= myId.split("-");
    String part2=splitmyId[1];
    int partInt= Integer.parseInt(part2);
        System.out.println(" number is out "+partInt);
      //  String num1="100";
        //String num2="600";
        int firstnum= Integer.parseInt("100");
        int secondnum=Integer.parseInt("600");
        System.out.println(firstnum+secondnum);
     int x=10;
     Integer xObject=Integer.valueOf(10);
     Integer xObject2=Integer.parseInt("10");
       System.out.println(xObject);
        System.out.println(xObject2);
        byte bvalue=xObject2.byteValue();
        System.out.println("bvalue = " + bvalue);
        float fvalue=xObject2.floatValue();
        System.out.println("fvalue = " + fvalue);
      Integer num1 =100;
      int num2=Integer.valueOf("200");
      int num3=Integer.parseInt("200");
    //  String caseNumber="IPR2012-00001";
     // String gettingYear =caseNumber.substring(3,7);
       // System.out.println("gettingYear = " + gettingYear);
       // getYearOutCaseNumber();
        System.out.println(getYearOutCaseNumber("IPR2012-00001"));
        System.out.println(getYearOutCaseNumber("DER2019-00034"));
        System.out.println(getYearOutCaseNumber("CMB2001-10133"));

    }
    public static int getYearOutCaseNumber(String caseNumber){

        return Integer.parseInt(caseNumber.substring(3,7));
    }

}
