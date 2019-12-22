package day15;

public class OfficeHours {
    public static void main(String[] args) {
/**
 * 3 question to ask when we learn the methods
 *what does it do
 * does it need external data when performing the action
 * what do i get out of it
 * equals
 * equalsIgnoreCase
 * length
 * toUpperCase
 * toLoewrCase
 * starswith
 * endswith
 * charAt
 * indexOf
 * lastindexof
 * trim
 * contains
 * isempty
 * replace
 * substring//bu cok onemli dedi Akbar
 * */
String message = " A BC  ";// trim takes out left and right spaces!!(BEGINNING AND END)
        System.out.println("message = <" + message+">");   //soutv yapinca busekil print aliyorsun
        String messageTrimmed = message.trim();
        System.out.println("messageTrimmed = " + messageTrimmed); // trim olunca space out oluyor
      //  isEmpty = yourString.lenght() == 0 ;// is empty -->
        String emptySpaces = "          ";
        System.out.println(emptySpaces);
        System.out.println("emptySpace = " + emptySpaces);
        String emptySpaceAfterTrimmed = emptySpaces.trim();
        System.out.println("emptySpaceAfterTrimmed.length()  = " + emptySpaceAfterTrimmed.length() );
        System.out.println("emptySpaceAfterTrimmed is empty? " + emptySpaceAfterTrimmed.isEmpty());
        System.out.println("emptySpaces is blank or not?  = " + emptySpaces.isBlank());
        System.out.println("emptySpace  = " + emptySpaces.isEmpty());
        String name = " ";
        System.out.println(name.isEmpty());
        String message1 = "I LOVE JAVA";
        int locationOfLove = message.indexOf("Love");
        System.out.println("location Of word Love = " + locationOfLove);
        int lastIndexOfLetterA = message.lastIndexOf("A");
        System.out.println("lastIndexOfLetterA = " + lastIndexOfLetterA);// EGER bulamazsa system -1 veriyor!!!!
        boolean messageContainsLove = message.contains("LOVE");
        System.out.println("messageContainsLove = " + message.contains("LOVE") );//burada bi yanlislik var bak!!!true olmasi lazim



    }
}
