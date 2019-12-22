package day21;

public class TaskThrough {
    public static void main(String[] args) {
        //break //if line contains break reaches the loop will stop!!
        //continue ; if line contains break reaches the loop will skip to next iteration
        //we can use break and continue for any type of loop
       // for (int i = 1; i <10 ; i++) { //bu formul bir sayidan bir sayiya saymak icin
         //   System.out.println(i);

           // for (int i = 1; i <10 ; i++) {
             //   System.out.println(i);
               // break;
       // for (int i = 1; i <=10 ; i++) {
         //   System.out.println(i);
           // if(i==5){
             // break
        //buradaki olay numaralari ekledikce artan bi account var oyuzden ne yapmam lazim belirledigim rakamdan
        // once durmasi lazim formule diikkatli bak sum = sum +x bu numaramiza eklemek icin kullandigimiz formul
       String myName = "Fatma";
       int countName = myName.length();
        for (int x = 0; x <countName; x++) {
            if(myName.substring(x,x+1).equalsIgnoreCase("m")){
                System.out.println("you have reached m");
                break;
            }
            System.out.println(myName.substring(x, x+1)+" ");
        }

    }
}
