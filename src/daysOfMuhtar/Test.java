package daysOfMuhtar;

public class Test {
    public Test(){
        System.out.println("test class in constructor");
    }

    public static void main(String[] args) {
        Tarah tarahninobj= new Tarah();

        Franco frnc= new Franco();

    }

}
 class Franco extends Test{
    public Franco(){
        System.out.println("franco nun constructor");
    }

 }
 class Tarah extends Franco{
    public void print(){
        System.out.println("Tarah nin constructor");
    }

 }
 class Bi{
    int bi=5;

     public static void main(String[] args) {
         Bi bic= new Bi();
         System.out.println("bic 8 degeri vermeden once: "+bic.bi);
         bic.bi=8;
         System.out.println("bic : "+bic.bi);
         Bi ci=new Bi();
         System.out.println("ci : "+ci.bi);

     }
 }