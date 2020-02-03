package daysOfOfficeHours;

   class data{
      private final String passWord="123456";

      public String getPassword(){
          return passWord;
      }
    //  public void setPassword(String passWord){
      //    this.passWord=passWord;

      //}
      public final void printName(){
          System.out.println("hassan");
      }
      public final int printName(int a){
          return 10;
      }
  }



public class FinalKeyword extends data{

    //  @Override
      //public void printName(){
        //  System.out.println("Mohammed");
      //}


  int a;
  static double b;

    public final static void main(String[] args) {
     final int num=100;  //you can just read it you can't change the value of the variable!!

    }
}
