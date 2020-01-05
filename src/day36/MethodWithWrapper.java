package day36;

public class MethodWithWrapper {
    public static void main(String[] args) {
     /**
      * i1 is a variable with data type Integer and it can store integer Object what's the deal here
      * with12? -->> autoboxing!!*/
      Integer i1=12;
      Integer i2=20;
    sumAndPrint(i1,i2);
    sumAndPrint(23,10);//we pass directly int knowing that autoboxing can take care of
    sumAndPrint(new Integer(23), new Integer(10));
    sumAndPrint(Integer.valueOf(23),Integer.valueOf(10));
        System.out.println("==============");
        printTheDoubledValue(10);
        printTheDoubledValue(new Integer(10));
        printTheDoubledValue(Integer.valueOf(10));

    }
    public static void sumAndPrint(Integer num1, Integer num2 ){
        System.out.println(num1+num2);

    }
    public static void printTheDoubledValue(int x){
        System.out.println("after doubling x = " + (x*2) );
    }
}
