package daysOfOfficeHours;

class Test{

    public Test (String str){
        System.out.println("name is: "+str);
    }

    public void method(){
        int a= 100;
        System.out.println(a);

        //Test obj1 = new Test(10); object must be creating with EXISTING class
    }
    public static void main(String[] args) {
       //  System.out.println(a);-> a is local variable
        StaticConstructor01_23.staticMethod();

        if(true){
            int b=100;
        }
      //  System.out.println(b); ->local variables can't be used outside the methods or blocks
   Test obj2= new Test("Muhammed");

    }
}

public class StaticConstructor01_23 {

    public static void staticMethod(){
        System.out.println("this is static method ");
    }

      static String name;
    static int stA=10;
    int inB;

    public static void main(String[] args) {
        System.out.println(StaticConstructor01_23.name); //if it will be static the name null bc has no value yet
        System.out.println(name);
        StaticConstructor01_23 obj1= new StaticConstructor01_23();
        obj1.stA=20;
        obj1.inB =200;

        StaticConstructor01_23 obj2= new StaticConstructor01_23();
       // obj2.stA= 20;

        System.out.println(obj1.stA);
        System.out.println(obj2.stA);

        System.out.println(obj1.inB);
        System.out.println(obj2.inB);

        System.out.println("===================");

        StaticConstructor01_23 Gunday = new StaticConstructor01_23();
        Gunday.name="Gunday";

        StaticConstructor01_23 Fatma=new StaticConstructor01_23();
        Fatma.name="Fatma";
        System.out.println(Gunday.name);
        System.out.println(Fatma.name);

     StaticConstructor01_23 obj3= new StaticConstructor01_23();



    }
    public void method1(){
        System.out.println(name);

    }
}
