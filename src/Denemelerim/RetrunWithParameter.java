package Denemelerim;

public class RetrunWithParameter {
    public static void main(String[] args) {
      double sum=addition(2.5,4.9);
        System.out.println("a ile b sum = " + sum);
        double findDivision =(division(10,2));
        System.out.println("findDivision = " + findDivision);
        System.out.println(compare(20,3));
        boolean numbers =compare(9,10);
        System.out.println("numbers compare is:  " + numbers);
    }
    public static double addition(double a,double b){
      double sum= a+b;
      return sum;
    }
    public static double division(int a,int b){
     return(double) (a/b);
    }
    public static boolean compare(int a, int b){
 boolean numCompare= (a>b) ? true : false;
 return numCompare;
    }
}
