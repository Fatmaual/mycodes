package daysOfMuhtar;

class Yasemin{
    void methodA(){
        //the method we are going to override must be inheritable to the sub class
        System.out.println("method A");
    }
    public String methodB(){
        return "B";
    }
 protected double salary(double bonus){
        return bonus+100000;
 }

}

public class AccessModifiers extends Yasemin {
    @Override
    protected double salary(double bonus){ //I can't give any different value for anything otherwisse it will be
        // overloading
        return bonus+20000;
    }

    @Override
  public void methodA(){
        System.out.println("method A");
    }
    @Override
  public String methodB(){
        return "C";
  }


}
