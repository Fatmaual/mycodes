package denemelerim;

import java.util.Arrays;

public class B11Var_ArgPalindromeArrayReturn {
    public static void main(String[] args) {
      /**
       * palindrome olustur (boolean ile )
       * task 2: int arry method olustur retrun yap
       * task 3:2 dimensional array olustur retrun yap
       * */
     // boolean resultpalindrome = palindrom("naan");
      //System.out.print(resultpalindrome);
        System.out.println(palindrom("hannah"));
        System.out.println(palindrom("race car"));
        System.out.println(palindrom("was it a car or a cat i saw"));
        System.out.println(palindrom("myname"));
        System.out.println(reverseString("olivia"));
        System.out.println();
        int[] resultOfNum1= getTheNumbers1ToX(5);
        System.out.println(Arrays.toString(resultOfNum1));
        int[][] resultarr2D= get2DArray(4,4);
        //System.out.println(Arrays.deepToString(resultarr2D));
        System.out.println(Arrays.deepToString(get2DArray(4,4)));


    }
    public static boolean  palindrom(String sentence) {
        String reverse = "";
      sentence= sentence.replace(" ", "");
        for (int x = sentence.length() - 1; x >= 0; x--) {
            reverse += sentence.charAt(x) + "";

        }
        if (reverse.equals(sentence)) {
            return true;

        }
      return false;
    }
    public static String reverseString(String word){
        String reverse="";
        for (int x = word.length()-1; x >=0 ; x--) {
        reverse+=word.charAt(x);
        }
        return reverse;
    }
    public static int [] getTheNumbers1ToX(int num){
        int[] num1=new int[num];
        for (int x = 0; x <num1.length ; x++) {
            num1[x]=x+1;
        }
        return num1;
    }
    public static int[][] get2DArray(int num1,int num2){
        int [][] arr2D=new int[num1][num2];
        for (int i = 1; i <=arr2D.length; i++) {
            for (int j = 1; j <=arr2D.length ; j++) {
                arr2D[i-1][j-1]=j;

            }

        }
        return arr2D;
    }
}
