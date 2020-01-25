package InheritanceMuhtar;


class TestBase{

    static String chromeDriver= "Fire Fox"; //default

public static void TakeScreenShot(){ //method olusturdu so anything from nonstatic it is also inherited
    System.out.println("took screenshot");
}
private static void closeBrowser(){  //-->this one is not invisible so it is not inheritable
    System.out.println("browser closed");
}
   }

public class Inheritance extends TestBase{
             //sub              //super
    //sub class is gonna inherit all the visible or protected features from the super class
  public static void main(String[] args) {

     System.out.println(chromeDriver);
     TakeScreenShot();

  }

}
