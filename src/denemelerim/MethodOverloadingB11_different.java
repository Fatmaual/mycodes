package denemelerim;

public class MethodOverloadingB11_different {
    public static void main(String[] args) {
 double d;
 d=10;
        System.out.println(d);
        d=10l;
        System.out.println(d);
        d=10F;
        System.out.println(d);
    //    release(10);
      //  release(10l);
        //release(10f);
        //release(10d);
        //release(10.5);
        //release(15/2);
        aa(10,12);
        aa(10l,(int )10l);


    }
    public static void release(double d){
        System.out.println("double "+d);
    }
    public static void release(int d){
       System.out.println("integer "+d);
    }
    public static void aa(double a, int b){
        System.out.println("double a , int b ");
    }
}
