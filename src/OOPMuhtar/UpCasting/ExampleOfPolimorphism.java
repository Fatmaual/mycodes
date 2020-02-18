package OOPMuhtar.UpCasting;

import daysOfMuhtar.WebDriver;

class Animals{
     public void method1(){
         System.out.println("animals class method 1");
     }

}
class Dogs extends Animals{
     public void method2(){

     }

}
public class ExampleOfPolimorphism {
    public static void main(String[] args) {
      //  System.out.println((double)10);
        Animals animal= new Animals();
        Dogs dog1= new Dogs();
        Animals animal2=new Dogs();
        Animals animal1= (Animals)dog1;
animal1.method1();

    }
}
 class RemoteDriver  {

 }

class  ChromeDriver extends RemoteDriver{

 }

