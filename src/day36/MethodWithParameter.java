package day36;

public class MethodWithParameter {
    public static void main(String[] args) {
       // addOneHundred(25);
       // addOneHundred(new Integer(100));
 //int x=num; sout(x+100); and also int x=10; when we pass num to a method it will
       //be int x=num; so if I pass num to x but x was x+100 now x=num so x=10! what is inside of num?
        //pur value inside of value
     //Array.sort doesn't you pass array objects
       int num=10;
        addOneHundred(num);

        num=addOneHundredAndReturn(num);
        System.out.println(num);

    }
    public static void addOneHundred(int x){
  //  System.out.println(x+100);
        x= x+100;
       System.out.println(x);

    }
    public static int addOneHundredAndReturn(int x){
        x=x+3;
        return x;

    }
}
