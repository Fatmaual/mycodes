package day12;

import jdk.swing.interop.SwingInterOpUtils;

public class LoginTest_V2 {
    public static void main(String[] args) {
       // String userName = "ABC123";
      // boolean userNameCorrect = userName.equals("ABC123");
       // System.out.println(userNameCorrect);
       // boolean nameCheckIgnoreCase = userName.equalsIgnoreCase("ABC123");
       //System.out.println(nameCheckIgnoreCase);

        String myName = "fatma";
        boolean myNameCheck = myName.equals("fATMA");
        System.out.println(myNameCheck);
        boolean myNameIgnoreCase = myName.equalsIgnoreCase("fatMA");
        System.out.println(myNameIgnoreCase);// bunu anlami iki ayri yerden check yapiliyor two different action
                                            //behavior olarak dusun..

        //String userName = "aBc123";
        // storing the result of equality check into boolean variable
       // boolean userNameCorrect = userName.equals("ABC123"); // this will be true or false according to condition
        // printing the variable to see what is it
        //System.out.println(userNameCorrect);
        // storing the result of equality check without caring about case into boolean variable
        //boolean nameCheckIgnoreCase = userName.equalsIgnoreCase("ABC123");
        // printing the variable to see what is it
       // System.out.println(nameCheckIgnoreCase);
        // store your name is a name variable
        // check for equality using different uppercase lowercase example
        // using equals and equalsIgnoreCase
       // String name = "Emre";
        // I want to store the result of checking name into a variable
       // boolean nameEqualsWithoutCase = name.equalsIgnoreCase("emre");
       // System.out.println("Does this name has same character without caring about the case");
       // System.out.println(nameEqualsWithoutCase);
        // here directly printing without saving into variable
        //                    This will eventually become true or false
       // System.out.println(  name.equalsIgnoreCase("eMrE")  );
       // System.out.println(  name.equalsIgnoreCase("eMrE"));


    }





}
