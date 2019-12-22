package day21;

import jdk.swing.interop.SwingInterOpUtils;

public class WakeUpOnemli {
    public static void main(String[] args) {


     // int myNameLength = myName.length();
       // System.out.println(myNameLength);
        //char myNameCharAt =myName.charAt(0);
      //  String myName1 = myNameCharAt();
        //for (String i = myName; i <= myNa; i++) {
                    //   012345678901234567890123
        String myName = "My name is Gulay Demirel";
        int charCount = myName.length();
        System.out.println("charCount = " + charCount);

        int lastCharIndex = charCount-1;
        System.out.println("lastCharIndex = " + lastCharIndex);

        //System.out.println(myName.substring(0,1)); //adin ilk harfi icin o,1!!!!!
        //System.out.println(myName.substring(1,2));//ikinci harf!!!
        //
        for (int x = 0; x <=lastCharIndex ; x++) {
           // System.out.println(myName.charAt(x));
            System.out.print(myName.substring(x, x+1) + ", ");

           
            }


        for (int x = 0; x <lastCharIndex-1 ; x++) {
            String twoChar = myName.substring(x, x+2);
            System.out.print(twoChar +", ");
            

        }
        System.out.println("------");
        for (int x = 0; x <lastCharIndex-1 ; x++) {
            String threeChar =myName.substring(x, x+3);
            System.out.print(threeChar + ", ");

            
        }

        }
    }
    

