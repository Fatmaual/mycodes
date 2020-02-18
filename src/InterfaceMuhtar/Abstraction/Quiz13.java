package InterfaceMuhtar.Abstraction;

abstract class A{
    abstract void method();

}
 abstract class B extends A {
     public void methodA() {
         System.out.println("B class abstract overriden oldu");
     }

     @Override
    void method() {

     }

     public abstract void methodB();
}
     final class C extends B {

         public void methodB() {
             System.out.println("belong c class");

         }

         @Override
         void method() {

         }

     }

     public class Quiz13 {
         public static void main(String[] args) {

         }
     }
