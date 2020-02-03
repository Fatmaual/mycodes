package daysOfOfficeHours;

 class Test1{}

public class ThisKeyword {

   public ThisKeyword(){

   }

   public ThisKeyword(int a){
       this();
   }

    int a =100;
    public void method(){
        System.out.println(this.a);
    }
    public void method2(){
        this.method();
    }

    public static void main(String[] args) {

    }
}
