package daysOfMuhtar;

class B{

    public B(int a){
        System.out.println("default constructor from super class");
    }

}

   public class DefaultConstructor extends B{
    //        sub                super

   public DefaultConstructor(){
       super(10);
       System.out.println("default constructor of sub class");
   }

       public static void main(String[] args) {
           DefaultConstructor obj = new DefaultConstructor();


       }

}
