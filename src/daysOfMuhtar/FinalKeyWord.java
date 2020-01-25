package daysOfMuhtar;

 class Credentials{
     private final String UserName="cybertek";
     private final String PassWord="Batch12";

     public String getUserName(){
         return UserName;
     }

    // public void setUserName(String UserName){
     //this.UserName=UserName;    //final variables can't be re-assigned
     //}
 }

  class Holly{
   final   public void printName(){
          System.out.println("Asli");
      }
  }

public class FinalKeyWord extends Holly{

   // public void printName(){     ->final methods can't be override
        //  System.out.println("Madina");
    //  }
    final int age=100;

    public static void main(String[] args) {
        final String SSN="123456";
        //final variables are constant and cannot be reassigned
        System.out.println(SSN);
        final String DateOfBirth;
        //System.out.println(DateOfBirth);

        FinalKeyWord obj=new FinalKeyWord();
        System.out.println(obj.age);


    }
    public final static void add(int a, int b){
        System.out.println(a+b);
    }
    public static double add(double x, double y){
        return x+y;
    }

}
