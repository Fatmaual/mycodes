package daysOfMuhtar;

public class MethodsCalls10_7 {
    public static void main(String[] args) {
        /**
         * JAVA EXECUTE THE METHODS FROM TOP TO BOTTOM
         * void method does not return any value!!!!!!!
         */
        method1();
        System.out.println();
        methos2();
        System.out.println();
        method3();
        System.out.println();
       int max2= max(2,4);
        System.out.println(max2);
      int max3=  max(1,3,0);
        System.out.println(max3);
        maximum(90,5,23); //void method does not return any value!!!!!!!
        String str= print(10,30,50);
        System.out.println(str);
        int hangisi=  max(3,8,1,5);
        System.out.println(hangisi);
        int max4=max(3,7,5,1,8);
        System.out.println("max 4 is: "+max4);

    }
    public static void method1(){
        System.out.print("A");
    }
    public static void methos2(){
        method1();
        System.out.print("B");
    }
    public static void method3(){
        methos2();
        System.out.print("C");

    }
    public static int max(int a, int b){
        return (a>b)? a:b;
    }
    public static int max(int a, int b, int c){
        return (max(a,b)>c)? max (a,b):c;
    }
    public static void maximum (int a,int b,int c){
        System.out.println(max(a,b,c));
    }
    public static int max(int a, int b, int c, int d) {
   // int result= max(a,b)>max(c,d) ? max(a,b):max(c,d);
    //return result;
        return max(max(a,b),max(c,d));

    }
    public static String print(int a, int b, int c){

        return "*"; // try with return "900";
    }
    public static int max(int a, int b, int c, int d,int e){
        //int result= max(a,b,c,d)>e ? max(a,b,c,d) : e;
        //return result;
        // or return max(max(a,b,c,d) , e);
        return max(max(a,b,c),max(d,e));
    }

}
