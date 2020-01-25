package day38;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList10_08 {
    public static void main(String[] args) {
        /**
         * write a method can find arrayList
         * for trying to work this method or not I need to create arrayList
         */
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(100,30,40,89,12));

        int num=Maximum(list);
        System.out.println(num);
        int minNum=Minimum(list);
        System.out.println(minNum);
    }
    public static int Maximum(ArrayList<Integer>list){
        int max=Integer.MAX_VALUE;
        for(int each:list){
            if(each>max){
                max=each;
            }
        }
        return max;
    }
    public static int Minimum(ArrayList<Integer> list){
        int min=Integer.MIN_VALUE;
        for(int each:list){
            if(each<min){
                each=min;
            }
        }
        return min;
    }
}
