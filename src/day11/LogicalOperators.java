package day11;

public class LogicalOperators {
    public static void main(String[] args) {
     // eger x 60dan buyukse (int x = 70) yani soyle desek 60< x< 100 --> true <100 cok sacma olur boyle desek
     //Java icin nasil deriz bunu x> 60 && x <100  yazariz
     // && bunun adi ampersand yani & 1 boyle desekde olur ayni anlam.  __>logical and operator
     //boylelikle java diliyle isleme dogru diyoruz.
     // yani int x = 70;  x> 60 && x <100; that means true;
     //eger iki islemde birbirini tutyorsa true yanlissa false

     //               false     true
     // int  x = 10;  x> 60 && x <100 ;  false

        //       true             false
        //int  x = 110;  x> 60 && x <100 ;  false
        //mesela bu ornegi passport login example da dusun; eger username yanlissa passport dogru olsa bile
        // sisteme giremiyorsun! kesinlikle bunun icin.
        // || 2 pipe yada | 1 pipe icin;
        // herhangi bir durumda birinin cevabi dogruysa sonuc dogru ornek; sut almak istiyorsun iki markete gittin
        //eger bir marketden bukursan sut almis olursun
        // ornek; int x = 70; x>10 || x<5  --> true


       //System.out.println("truth table");
        //System.out.println(true && true);
        //System.out.println(false && true);
       // System.out.println(true && false) ;
       //System.out.println(false && false);

        //System.out.println("truth table");
        //System.out.println("result of true && true is" + (true && true) ); // parantez icinde olmasina dikkat et
        //System.out.println("result of false && true is" + (false && true) );
        //System.out.println("result of true && false is" + (true && false) );
        //System.out.println("result of false && false is" + (false && false) );

        //password ve user name buna harika bir ornek!

        //System.out.println( "TRUTH TABLE ||");

        //System.out.println( "RESULT OF true || true  is " +   (true || true)    );

        //System.out.println( "RESULT OF false || true  is " +  (false || true)    );
        // at least one is true yes
        //System.out.println( "RESULT OF true || false  is " +  (true || false)    );
        // at least one side is true yes result is true
        //System.out.println( "RESULT OF false || false  is " + (false || false)   );
         // false
        //int num = 80;
       // System.out.println(num > 100 && num< 100) ;
        //System.out.println("the result is " + (true && true));
        //System.out.println(num < 100 && num> 60);
        //int x = 55; // bundan sonra print statemnt alk ikinci asama icin
       // System.out.println(  x>100 || x<10    );
        //System.out.println(  x>10 && x<60   );
       // System.out.println(  x == 50 || x == 51 || x == 55 );// false || false ->false || true --> true
        //System.out.println( true || false || false ); //  -->true
        //System.out.println(true && true && false); // -->false
       // "&& means and"  "|| means or"

        int x =55 ;
        System.out.println(x >50 && x != 52 || x == 57);













    }
}
