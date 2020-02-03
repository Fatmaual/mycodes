package InterfaceMuhtar;
 interface B{
     void method3();
 }

public interface extence_vs_implemets extends B{
     //          subtype                      supertype

    void method(); //access modifier public
    void method2(); //access modifier public
}
   abstract class A implements extence_vs_implemets{

    public void method1(){

    }
    public void method2(){

    }
    public void method3(){

    }
}