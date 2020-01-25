package daysOfMuhtar;

import InheritanceMuhtar.Inheritance;
import InheritanceMuhtar.ProtectedVariables;

class Data{
    public static int num1=10;
    protected static int num2=20;
    private static int num3=30;
    static int num4=40; //-->default method

    static int staticNum;
    int insNum;


}

public class InheritanceReview extends Data{
     //   sub                         super

    public static void main(String[] args) {
        System.out.println("public static num1: "+ num1);
        System.out.println("protected static num2: "+num2);
      //  System.out.println(num3); ->it gives compile error bc private cannot be inheritance
        System.out.println("default num4: "+num4);
        InheritanceReview obj=new InheritanceReview();
        System.out.println("public static num1: "+obj.num1);
        System.out.println("protected static num2: "+obj.num2);
    //    System.out.println(obj.num3);
        System.out.println("default num4: "+obj.num4);

        Data obj2 =new Data();
        System.out.println("public static num1: "+obj2.num1);
        System.out.println("protected static num2: "+ obj2.num2);
        System.out.println("default: "+obj2.num4);
        System.out.println(num2);

        ProtectedVariables obj3=new ProtectedVariables();
      //  System.out.println(obj3.nameProtected);->compile error bc only public classes are visible outside of package
        System.out.println("baska bir packagede olan String public oldugu icin: " +obj3.namePublic);

        InheritanceReview objA= new InheritanceReview();
        objA.staticNum=100;
        objA.insNum=200;
        System.out.println("static object a: "+objA+" -> hashcode ..neden?");
        System.out.println("int object a: "+objA.insNum);
        InheritanceReview objB= new InheritanceReview();
        System.out.println("static object b ye deger vermedim sonuc: "+objB.insNum+" default");
        System.out.println("default object b:"+ objB.staticNum);
       // System.out.println(objB.nameStatic);
     objA.staticNum=3;
     objB.insNum=22;
        System.out.println("object b ya deger verdikten sonra static  objectb: "+objB.insNum);
        System.out.println("object b ya deger verdikten sonra default objectb: "+objB.staticNum);
        System.out.println("object b ya deger verdikten sonra default objecta: "+objA.staticNum);
        System.out.println("object a default value is after obj b: "+objA.insNum);




    }

    }

