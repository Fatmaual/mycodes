package day16;

public class ExampleOfIndex {
    public static void main(String[] args) {
      /**                   0123456789012345
       *  String sentence ="My Name Is Fatma";
       *         int firstSpace=sentence.indexOf(" ");
       *         System.out.println("firstSpace = " + firstSpace);
       *         int lastSpace =sentence.lastIndexOf(" ");
       *         System.out.println("lastSpace = " + lastSpace);
       *         String secondWord;
       *         secondWord = sentence.substring(2,7);
       *         System.out.println("secondWord = " + secondWord);
       *         String lastWord;
       *         lastWord = sentence.substring(lastSpace);
       *         System.out.println("lastWord = " + lastWord);
       *         int  lastLetterOf;
       *         lastLetterOf = sentence.indefof("F")
       * */
        //ikinci javayi bulmak icin ilk javanin indexine bakarim daha sonra ikincisini ararim.


                 //  012345678901234567890123456789012
      String name = "I love Java I Love Java Java Java";
        System.out.println("starting from 0 " +name.indexOf("Java"));
        System.out.println(" starting from 7 "+name.indexOf("Java", 7));
        System.out.println(" starting from 7 "+name.indexOf("Java", 8));
        System.out.println(" starting from 7 "+name.indexOf("Java", 9));
        System.out.println(" starting from 7 "+name.indexOf("Java", 19));
        System.out.println(" starting from 7 "+name.indexOf("Java", 20));
 // ilk java gosterecek yani location of// simdi ise ikinci javayi ariyor +1 ile! (ava I Love )
                                                          //or you can start here + 4 nereden biliyorum +4 cunku
                                                        //java 4 character!!!!!!!!!!! yada ilk aradigin kelimeyi
                             // bitiri bitirmez +1 koyarsin eger bilmiyorsam +word.lenght();

        int firstJavaLocation = name.indexOf("Java");
        int startingPointToSearchSecondJava = firstJavaLocation+1;
        int secondJavaLocation = name.indexOf("Java",startingPointToSearchSecondJava);
        System.out.println("secondJavaLocation = " + secondJavaLocation);
        //eger cumlede nekadar kelime oldugunu bilmiyorsam I only know there are 3+ words
        // ve sadece ikinci kelimeyi biliyorsam;
        //the word in between first space and second space is second word
        int firstSpaceLocation = name.indexOf(" ");
        int secondSpace = name.indexOf(" ", firstJavaLocation + 1);
        System.out.println("second word in this sentence is "
                +name.substring(firstJavaLocation + 1, secondSpace));




    }
}
