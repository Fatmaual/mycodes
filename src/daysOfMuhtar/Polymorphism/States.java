package daysOfMuhtar.Polymorphism;

public abstract class States {
    String capitalCity;
    public void tax(){
        System.out.println("tax rate is 5%");
    }
    public final void method1(){
        System.out.println("this is method 1 from states class");
    }
}
 class Kentucky extends States{
    String capitalCity="Nashville";

    @Override
    public void tax(){

        System.out.println("tax rate is in KY 6%");
    }
    public void KFC(){
        System.out.println("KY has KFC");
    }
     public final void method1(int a){
         System.out.println("this is method 1 from KY class");
     }
 }
 class California extends States{
    String capitalCity="Sacramento";

     @Override
     public void tax() {

         System.out.println("Tax Rate in California is 9%");
     }
     public void hollywood(){
         System.out.println("there is Hollywood in CA");
     }
     public final void method1(int a){
         System.out.println("this is method 1 from CA class");
     }
 }