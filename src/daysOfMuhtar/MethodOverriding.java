package daysOfMuhtar;

class student{
    public void printName(){
        System.out.println("Hakan");
    }
}

  public class MethodOverriding extends student{
//             sub                       super
      public void print(String str){

      }
   public void print(double a){

   }
   public void printName(){
       System.out.println("Sukran");
   }

      public static void main(String[] args) {

          MethodOverriding obj= new MethodOverriding();
          obj.printName();
          obj.print("Ayse");
          obj.print(4.5);

          student obj2=new student();
          obj2.printName();

      }
  }


