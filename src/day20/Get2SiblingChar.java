package day20;

public class Get2SiblingChar {
    public static void main(String[] args) {
        // given a String with even number character count
// print 2 characters in one line as below example
//
// for example  :  Ayra
/*
    Ay 01-->02
    yr 12-->13
    ra 23-->24
*/          // 0123
 String name = "Ayse";
int lastCharIndex = name.length()-1;
 //       System.out.println(name.substring(0,2));
    //    System.out.println(name.substring(1,3));
  //      System.out.println(name.substring(2,4));
      //  for (int x = 0; x <=lastCharIndex ; x++) {
        //    System.out.println(name.substring(x,x+2));


        /*
    Ay 01-->02
    yr 12-->13
    ra 23-->24
*/
        for (int x = 0; x <=lastCharIndex-2 ; x++) {
            System.out.println(name.substring(x,x+3));

        }


    }
}
