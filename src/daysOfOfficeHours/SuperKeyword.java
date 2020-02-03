package daysOfOfficeHours;

  class TestData{

      public TestData(){
          System.out.println("A");
      }
      int a =100;
      public void  method1(){
          System.out.println("super class instance methods");
      }
  }
 public class SuperKeyword extends TestData{

      public SuperKeyword(){
          System.out.println("B");
      }
      public void method1(){
          System.out.println("sub class instance methods");
      }

    public static void main(String[] args) {
     //   super.a=300;
       // super.method1();

      SuperKeyword obj =new SuperKeyword();
      obj.mm();
    }
    public void mm(){
        System.out.println(super.a);
        super.method1();
    }
    public void mm2 (){
        System.out.println(super.a);
        this.mm();
    }

}
