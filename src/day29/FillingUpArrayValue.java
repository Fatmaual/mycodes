package day29;

import java.util.Arrays;

public class FillingUpArrayValue {
    public static void main(String[] args) {
        //100e kadar arrayde sayilari yazdir
        int[]number=new int [100];
        System.out.println("before filling up \n " + Arrays.toString(number));
      //  number[0]=1;
        //number[1]=2;
        //number[2]=3;
        for (int x = 0; x <number.length ; x++) {
            number[x]=x+1;

        }
        System.out.println("after filling up\n "+Arrays.toString(number));
        // simdi burada iki cesit cikis aldik ikisi arasindaki farka iyi bak!!!!!!!!
    }
}
