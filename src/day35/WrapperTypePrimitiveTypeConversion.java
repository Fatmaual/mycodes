package day35;

public class WrapperTypePrimitiveTypeConversion {
    public static void main(String[] args) {
        Integer num1=100;
        int num2 =Integer.valueOf("200");
        int num3 =Integer.parseInt("200");
     //get 2012 out of it
      //  String caseNumber ="IPR2012-00001";
        //int year;
        //String strYear =caseNumber.substring(3,7);
        //year= Integer.parseInt(strYear);
        //System.out.println("strYear = " + strYear);


        System.out.println(getYearOutOfCaseNumber("DER2019-00034"));
        System.out.println(getYearOutOfCaseNumber("IPR2009-01042"));
        System.out.println("CBM2001-10133");
    }
    public static int getYearOutOfCaseNumber(String caseNumber){
       // String caseNumber ="IPR2012-00001";
        //int year;
        //String strYear =caseNumber.substring(3,7);
        //year= Integer.parseInt(strYear);
    /**
     * task2
     * */


       return Integer.parseInt(caseNumber.substring(3,7));
    }
}
