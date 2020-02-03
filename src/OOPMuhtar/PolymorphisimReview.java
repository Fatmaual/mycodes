package OOPMuhtar;

class A{
   protected void methodA(){
        System.out.println("method A from A class ");
    }
  public void  methodC(){
      System.out.println("method c from a class");
  }
}
  class B  extends A {

    public void methodB(){
        System.out.println("method B");
    }

      public void methodA(){    //public void methodA(int a ){  ->overload
          System.out.println("method a FROM b CLASS");
    }

  }


public class PolymorphisimReview {
    public static void main(String[] args) {
        A obj=new A();
        A obj2 = new B();
        obj2.methodA();
      //  obj2.methodB();

       C obj4= new D();
       E obj5= new D();
     //  D obj6 = new E();

        C obj7= new D();
        A obj11= new B();
        obj11.methodA();
        obj11.methodC();

    }

}
 abstract class C{

 }
 class D extends C implements E{

 }
 interface E {

 }
  abstract class F implements E{

  }