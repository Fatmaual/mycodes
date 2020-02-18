package OOPMuhtar.Day55_Polymorphism;

class A{
    public void methodA(){
        System.out.println("method A");
    }

 }
 class B extends A{
    public void methodB(){
        System.out.println("method B");
    }
 }

public class PolymorhismReview {
    public static void main(String[] args) {

        A a1 = new A();
        A a2 = new B();

     //   B b1 = new A(); only parent can be reference to the child class but child class can't be reference to the
        //   parent class' object

    //C c1= new C(); abstract class is not concrete so it can't be  an object

        C c1 = new D();
        E e1= new D();
        // D d1= new E(); we can't create an object from interface but interface
        // can be a reference type for a class' object
       // C c2 = new E();
        //E e2 = new C(); abstraction is not concrete!
        E e3= (E) new Dog();
       // Dog dog1 = new E();
      //  Animal animal1= new bird();
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
  class Dog extends Animal {

  }
  abstract class Animal{

  }
  interface Pittbull {

  }

   class HumingBird implements bird{

  }
  interface bird {

  }
