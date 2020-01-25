package daysOfMuhtar;

import java.util.Arrays;

public class ArrayLisrReturn10_7 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 34, 6, 75, 4, 345, 6};
        arr = descending(arr);
        System.out.println(Arrays.toString(arr));
        double arr2[] = {12.4, 67.78, 0.98, -23.78, -1234};
        arr2 = doubleArrdesending(arr2);
        System.out.println(Arrays.toString(arr2));
        char[] chars={'c','o','f','f','e','e'};
        chars=chrdescending(chars);
        System.out.println(Arrays.toString(chars));
        String[] arrS={"Kerem","Esad","Cevdet","Nimet"};
        arrS=desString(arrS);
        System.out.println(Arrays.toString(arrS));
        String[] name={"Kerem","Esad","Cevdet","Nimet"};
        name=sortOnly(name);
        System.out.println(Arrays.toString(name));
    }

    public static int[] descending(int[] arr) {
        //write a return method accepts int[] and sorts it in descending order
        Arrays.sort(arr);//ascending order
        int arrtamamla = 0;
        int[] arr2 = new int[arr.length];//can contain all values of arr
        for (int x = arr.length - 1; x >= 0; x--) {
            arr2[arrtamamla] = arr[x];    //arr2[arr.length-1-x]=arr[x];-->ikinci way
            arrtamamla++;

        }
        return arr2;
    }

    //write a method accepts double arr and sorts it in descending order
    public static double[] doubleArrdesending(double[] arr) {
        Arrays.sort(arr);
        int a = 0;
        double[] arr2 = new double[arr.length];
        for (int x = arr.length - 1; x >= 0; x--) {
            arr2[a] = arr[x];
            a++;         // arr[arr.length-1-x]=arr2[x];

        }
        return arr2;
    }

    public static char[] chrdescending(char[] arr) {
        Arrays.sort(arr);
        int a = 0;
        char[] arrC = new char[arr.length];
        for (int x = arr.length - 1; x >= 0; x--) {
            arrC[a] = arr[x];
            a++;         // arr[arr.length-1-x]=arr2[x];

        }
        return arrC;

    }
    public static String[] desString(String[] arr){
        Arrays.sort(arr);
        int d=0;
        String[] arr2=new String[arr.length];
        for (int x = arr.length-1; x >=0 ; x--) {
        arr2[d]=arr[x];
        d++;                 //arr2[arr.length-1-x]=arr2[x];


        }
        return arr2;
    }
    public static String [] sortOnly(String [] names){
        Arrays.sort(names);
        return names;
    }
}