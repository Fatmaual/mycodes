package daysOfMuhtar;

public class MethodCalls {
    public static void main(String[] args) {
        //write 3 methods
        method1();
        method2();
        method3();
        int max1=max(23,45);
        System.out.println(max1);
        int max2=max(3,-2,10);
        System.out.println(max2);
    }
    public static void method1(){
        System.out.print("A");
        System.out.println();
    }
    public static void method2(){
        method1();
        System.out.print("B");
        System.out.println();
    }
    public static void method3(){
        method1();
        method2();
        System.out.println("C");

    }
    public static int max(int a,int b){
        return ( a>b ) ? a:b;
    }
    public static int max(int a, int b, int c){
        //int largestNum = max(a,b);
        return ( max(a,b) > c) ? max(a,b):c;
    }
    public static void maximum(int a, int b, int c){
        System.out.println(max(a,b,c));
    }
    public static int max(int a,int b,int c, int d){
        int result=max(a,b,c);
        return (result>d) ? result:d;
    }
}
