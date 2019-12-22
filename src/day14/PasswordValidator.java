package day14;

public class PasswordValidator {
    public static void main(String[] args) {
       /**
        * String str= "I like Pumpkin";
        *         //System.out.println(str.equals("pumpkin")); //ciktisini al daha iyi anliyacaksin
        *         //contains:
        *         //it checks wheter a string exist in another string
        *         System.out.println("does it contains Pumpkin : ");
        *         System.out.println(str.contains("Pumpkin"));
        *         boolean gotPumpkin = str.contains("Pumpkin");
        *         //shortcut to print variable value in nice format soutv + tab(click enter)
        *         System.out.println("gotPumpkin = " + gotPumpkin);//soutv ile !!!!!!!
        * */

        //System.out.println(  str.equals("pumpkin")   );
        // contains :
        // it checks whether a string exists in another string'
        // and return true or false result
        //System.out.println("Does it contains Pumpkin : ");
       // System.out.println(   str.contains("Pumpkin")    );
        // true
       // boolean gotPumpkin =  str.contains("Pumpkin") ;
        //shortcut to print variable value in nice format soutv + tab
       // System.out.println("gotPumpkin = " + gotPumpkin);

        // startsWith  endsWith
        // check whether a string start with another string
        // check whether a string end with another string
        // and return true or false result

        //String str = "I like Pumpkin" ;
      //  System.out.println("str = " + str);

     //   boolean startedWithI = str.startsWith("I");
      //  System.out.println("startedWithI = " + startedWithI);

      //  boolean endWithPumpkin = str.endsWith("Pumpkin");
      //  System.out.println("endWithPumpkin = " + endWithPumpkin);

        //password gecerliligni sorgulayacagim;

        String password = "Ab_12321$csa";

        //minimum 8 char max 16 char-->this is length!!!!! checking
        boolean min8max16 = password.length() >=8 && password.length() <=16;

        //it must contains _ or $ --> string contains check olmak zorunda!!!!
        boolean mustContains_or$ = password.contains("_") || password.contains("$");

        //it must not contains space --> string must check with contains section and put space!!
        boolean mustNotContainsSpace = ! password.contains(" ");

        //it must start with Ab --> string must check with startWith
        boolean mustStartWithAb = password.startsWith("Ab");

        //last part is how do I combine all of them???it might take very longso valid password or invalid password
        if( min8max16 && mustContains_or$ && mustNotContainsSpace && mustStartWithAb){
            System.out.println("Valid password");
        }else{
            System.out.println("invalid password");
        }




    }
}
