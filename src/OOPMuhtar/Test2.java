package OOPMuhtar;

  interface Interface{
    abstract void get();

  }
  interface Interface2{
      abstract void frame();
  }
  abstract class AbstractClass{

  }
public class Test2 extends AbstractClass implements Interface,Interface2{


    public static void main(String[] args) {

        Interface obj= new Test2();
     obj.get();

     AbstractClass obj3=new Test2();


    }
    @Override
    public void get(){

    }
    @Override
    public void frame(){
        System.out.println("frame method");

    }
}
