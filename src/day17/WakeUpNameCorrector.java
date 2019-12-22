package day17;

public class WakeUpNameCorrector {
    public static void main(String[] args) {
       // WAKE UP TASK 1 :
      //  create a class called WakeUp_NameCorrector with main
      //          Create a String variable to store your name in any case combination
     //   for example  jon jOn jON  any of them :
      //  Create a variable called name2
      //  make your first letter uppercase then rest lowercase
      //  jon  ---> Jon    arya -->> Arya
      //  Optionally ask your name from Scanner
      //  Optionally ask your full name
       //         -->> then make your full name first letter uppercase the rest lowercase
        //               01234
        //String name = "FAtMa";
               //         012345
        //String name2 = "Olivia";

        //int lengthOfName = name.length();
        //System.out.println("lengthOfName = " + lengthOfName);
       //String name2Starts = name2.startsWith("O");
       // System.out.println("name2 starts with  " + name2);

       // GET THE FRIST characcter -->make it uppercase get rest of the characters from 2nd character
       //make it lowercase
       //make whole name uppercase the get the first character
       //get the rest of the characters starting second characters
       //then make it lowercase
       //eventually concatenate them
       String name ="oliViA";
       //String nameFixed = (name.charAt(0)+"").toUpperCase();//adini butin bir islemde toplamak istiyorsan put all of them in one parantez
      // nameFixed =nameFixed+name.substring(1).toLowerCase();
       String nameFixed = name.toUpperCase().substring(0,1);
       nameFixed += name.substring(1).toLowerCase();
       System.out.println("nameFixed = " + nameFixed);








    }
}
