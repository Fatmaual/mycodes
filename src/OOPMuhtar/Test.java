package OOPMuhtar;

  abstract class ThisIsAbstract{

    public static void ByLinkText(){
      System.out.println("link text is super class");
    }
    public void get(){
      System.out.println("chrome");
    }
  }



public class Test extends ThisIsAbstract{

    public void get(){

        System.out.println("firefox");
    }

    public static void ByLinkTest(int a){
      System.out.println("link test is sub class");
    }

    public static void Test(){
  

    }

  public static void main(String[] args) {

      ThisIsAbstract obj1= new Test();
      obj1.ByLinkText();
      obj1.get();
      Test obj3= new Test ();
      obj3.ByLinkTest(10);
      Test.ByLinkTest(7);

  }
}
