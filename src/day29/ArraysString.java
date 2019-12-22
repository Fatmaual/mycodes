package day29;


import java.util.Arrays;

public class ArraysString {
    public static void main(String[] args) {
            //300 kere I love Java yaz
            String[]strArr = new String[30];
            for (int j = 0; j <strArr.length; j++) {
                strArr[j]=(j+1)+"->I love Java";
                //the orijinal one is strArr ="I love Java"
            }
        System.out.println(Arrays.toString(strArr));
        }
    }

