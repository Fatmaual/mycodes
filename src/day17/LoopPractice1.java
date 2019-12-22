package day17;

public class LoopPractice1 {
    public static void main(String[] args) {
        //for first track of loop how many the number check it first

        //count 1-5 then count 5-1
        int counting = 1;
        while(counting <=5) {
            System.out.print(counting + " "); //" "koydum cunku in one line check it for sout->12345
            ++counting;                      //sout println yazmiyor numaralar yanyana siralansindiye
        }
        System.out.println();
        System.out.println("after decrement");
        // now I want to count from 5 to 1, using same counter
       while (counting >= 1){     // while (counting >0) da dene!!
           System.out.print(counting+" ");
           --counting;

           // we got 6 cunku counting >= koyduk counting >1 yerine esittir extra islem yaptiriyor
           //0 geliyor
       }




    }
}
