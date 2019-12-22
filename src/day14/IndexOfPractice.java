package day14;

public class IndexOfPractice {
    public static void main(String[] args) {

        //find out location of Java (name.indexOf print out alinca 8.karakterden itibaren basliyor)
        //find out location of letter O (letter o location 5 dan itibaren basliyor)
        //find out location of first space (
        //find out last location the letter a shows up
        // find out last location of the character space shows up
        //find out last location of the letter Ga space shows up
        //find out last location of the letter Kawa space shows up
        //             012345678901
        String name = "Game of Java";
        System.out.println(name.indexOf("Java") );
        System.out.println(name.indexOf("o") );
        System.out.println("find out the location of uppercase O");
        System.out.println(name.indexOf("O") );//it doesn not exits olmadigi icin -1 verdi!!!
        System.out.println("find out location of first space");
        System.out.println(name.indexOf(" ") ); //space print out aldim


        System.out.println(name.lastIndexOf("a") ); //lastIndexOf dedim dikkat et!!
        System.out.println(name.lastIndexOf(" ") ); //last location pay attention!!
        System.out.println(name.lastIndexOf("Ga") ); //last location pay attention!!
        System.out.println(name.lastIndexOf("Kawa") );


        if(name.indexOf("Kawa")> -1){
            System.out.println("KAWA FOUND!!!");
        }else{
            System.out.println("NO KAWA - NO PUMPKIN");
        }







    }
}
