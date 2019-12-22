package day18;
import java.util.Scanner;

public class DoWhileAtLeastRunOnce {
    public static void main(String[]args){
      //  int x = 10;
       // do{
         //   System.out.println("keep going");
        //}while(x<5);
        //System.out.println("the end");

        //while(x<5){
          //  System.out.println("keep going in while");

        //}
        Scanner scan = new Scanner(System.in);
        System.out.println("knock knock!!");

        String password;
        do{
            System.out.println("what is the password");
            password = scan.next();

        }while(! password.equals("B15"));
        System.out.println("door is open!!");
//do while loopda devamli degisen yer neresi ona dikkat et shopping list de count devamli degisiyor
 //oyuzden okismi do section yaziyoruz.cumle cumle git first parti tamamladik degil mi sonra yine
 //bakacak yes cevabi no ya donenen kadar no dedigi an birakacak oyuzden while continue diyoruz ve evet
 // while da eger user keep want it && count(ekadar istiyorsa)okadar yazip &&count<10
        // we count until 10 bc the question wants that 10 items
 //reportu duzenlerken we need to undesrstand that totalPrice +=price;
                                                 //count++;
        //shoppinglistreport;"orada neyaziyorsa karakter karakter git comma space hepsini codla
        //shoppinglist report ilk iki item ayni concept de so if () diyoruz iki item icin
        //uvuncu item icin else diyoryz else{
        //shoppinglist

    }
}
