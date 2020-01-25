package daysOfMuhtar;


import java.util.Arrays;

public class ArrayList10_7ReturnM {

    public static char [] SortDe(char[] arr){
        Arrays.sort(arr);//ascending order
        int tumsayilaricin=0;
        char [] arr2= new char[arr.length];
        for (int x = arr.length-1; x >=0 ; x--) {
            arr2[tumsayilaricin]=arr[x];
            tumsayilaricin++;
        }


        return arr2;
    }
    public static double [] SortDe(double[] arr){
        Arrays.sort(arr);//ascending order
       int tumsayilaricin=0;
        double [] arr2= new double[arr.length];
        for (int x = arr.length-1; x >=0 ; x--) {
            arr2[tumsayilaricin]=arr[x];
            tumsayilaricin++;
        }


        return arr2;
        }
    public static int[] SortDe(int[] arr){
        Arrays.sort(arr);
        int[] arr2 =new int [arr.length]; //can contains all values of arr
        int arr2Cont=0;
        for (int x = arr.length-1; x >=0 ; x--) {
            arr2[arr2Cont]=arr[x];
            arr2Cont++;

        }
        return arr2;
    }
    public static void main(String[] args) {
  int [] arr = {10,89,20,300,10,900,0};
  arr=SortDe(arr);
        System.out.println(Arrays.toString(SortDe(arr)));
        double [] arr2={10.5,7.8,9.0,6.5};
        System.out.println(Arrays.toString(SortDe(arr2)));
        char [] ch={'a','c','h','y','r'};
        ch=SortDe(ch);
        System.out.println(Arrays.toString(ch));

    }
}
