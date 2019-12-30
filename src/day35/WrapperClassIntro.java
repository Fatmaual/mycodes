package day35;

public class WrapperClassIntro {
    public static void main(String[] args) {
     int object= 10;
     Integer object1 = Integer.valueOf(10);
        System.out.println("xObject1  degeri = " + object1);
    // Integer object1= new Integer(10);
        Integer object2= Integer.valueOf(10);
        System.out.println("what is xObject 2 :"+ object2);
     Integer object3=Integer.valueOf("10");
 byte bValue = object2.byteValue();
        System.out.println("byte bValue = "+ bValue);
  double dDeger =object3.doubleValue();
        System.out.println("dValue = " + dDeger);
  float fDeger=object1.floatValue();
        System.out.println("fDeger = " + fDeger);
 //!!!!!--->loolk at this -->>>  byte bDeger =x.valueOf
  //Use this number IPR2012-00001 and store the year into a int variable


    }
}
