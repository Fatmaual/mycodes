package day21;

public class NumberStair {
    public static void main(String[] args) {
        //plain english ile acikla; 1234 count from 1 to 4  5 times bunu yap print it out

        for (int x = 1; x <=5 ; x++) {
            // System.out.println("x : "+x);
            for (int y = 1; y <= x; y++) {
                System.out.print(y + " ");
            }
            System.out.println();
            //break and continue arasindaki farki dusun !! break is stop continue is skip
        }

    }
}
