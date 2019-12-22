package day23;

public class WarmUpArray {
    public static void main(String[] args) {
        int[] number = new int [7];
        int numberCount = number.length;

        number[0]=70;
        number[1]=50;
        number[2]=20;
        number[3]=40;
        number[4]=13;
        number[5]=25;
        number[6]=22;

        for (int x = 0; x<=number.length  ; x++) {
            System.out.print(number[x]+ ",");
        }
        int lasIndex = numberCount-1;
        for (int x = lasIndex; x>=0; x--) {
            System.out.println(number[x]);
        }
    }
}
