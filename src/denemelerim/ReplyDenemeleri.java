package denemelerim;



import java.util.Scanner;

public class ReplyDenemeleri {
    public static void main(String[] args) {
        String employee = "Philipa Salthouse [Electrical Engineer] psalthouse0@g.co";
        // print job title from this String :  Electrical Engineer

        // logic : title is in between [ and ]  so we need to find index of [ and ]
        // and use substring(right after index of [   ,  index of ]    )

        int startingIndex = employee.indexOf("[") + 1;
        int endingIndex = employee.indexOf("]");

        String title = employee.substring(startingIndex, endingIndex);
        System.out.println("title = " + title);

         /*
         * Print all FirstName-lastName jobTitle
        for example :
         Philipa-Salthouse Electrical Engineer
         Ulrika-Goolding Nuclear Power Engineer
         * */
        // "Philipa Salthouse [Electrical Engineer] psalthouse0@g.co" ;

        // logic : get first name ( first word in this sentence)
        //                 get last name ( second word in this sentence) put dash in between
        //                 then concatenate with the title
        // this will break if we have name more than 2 words

        // logic 2 :  get the full name directly using subString
        //            replace all the space in full name with -
        //            then concatenate with the title
        //give expected title for philipa salthouse is electrical engineer
        //write a statement if it is correct or not
        if (title.equals("Electrical Engineer")) {
            System.out.println("PASS: Verification successfull");
        } else {
            System.out.println("failed : verification failed" + title);
        }
//get the initial tb-> geological engineer gibi
        //bunun icin oncelikle full name almam lazim first word of first character
        //last word of first character
        //  String employee = "Philipa Salthouse [Electrical Engineer] psalthouse0@g.co";
//nasil alirim ilk karakterleri

        String fullName = "Bruce D Wayne";
        //     int firstCharOf = fullName.indexOf(0);
        //   int lastCharOfLastName= fullName.lastIndexOf(" ")+1;
        System.out.println(fullName.charAt(0) + "" + fullName.charAt(fullName.lastIndexOf(" ") + 1) +
                " ->" + title);
        //Item1: Tomatoes Price: 5.5, Item2: Cheese Price: 3.5, Item3: Apples Price: 6.3
        //output: Total price: 15.3
        Scanner scan = new Scanner(System.in);
    }
    }



