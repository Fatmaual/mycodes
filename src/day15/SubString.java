package day15;

public class SubString {
    public static void main(String[] args) {
                 //  0123456789012345
     String movie = "Lord Of The Ring";
     String wordOf = movie.substring( 5,7);
        System.out.println("wordOf = " + wordOf); //if I say 5 and 7 end before 7!
        String wordThe = movie.substring(8,11);
        System.out.println("wordThe = " + wordThe);
        int startingPoint = movie.indexOf(" ")+1;
        int endingPoint = movie.length(); //  try and see -1 after parantez
        System.out.println("second word till last :  "+movie.substring(startingPoint,endingPoint));
      String worldLordOf = movie.substring(0,7);
        System.out.println("worldLordOf = " + worldLordOf);
        String secondOfWordTillLast = movie.substring(5,16);
        System.out.println("second Word TillLast = " + secondOfWordTillLast);
        String secondToLast = movie.substring(5);
                    //     0123456789012345
        //String movie1 = "Lord Of The Ring"; //ring of the lord
        //String wordRing = movie1.substring(12,15);
        //System.out.println("wordRing = " + wordRing);
        //String wordOfThe =movie1.substring()
        //CONCATENATION YAPMAK ICIN System.out.println( WORDRING+WORDOFTHE+WORDLORD);
        //if you wanna write ring of java lord sout( wordRing+wordofthe+"java"+lord);



        
    }
}
