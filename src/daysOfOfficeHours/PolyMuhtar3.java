package daysOfOfficeHours;
class Circle{
    public double radius;

    public Circle(double radius){
        this.radius=radius;
    }
   public boolean equals(boolean obj){
      //  Object obj1= new Circle(3.2);
      //  Object obj2=new String();
      // if(obj instanceof Circle){
           return true;
       }

    //    return false;
  // }
}


public class PolyMuhtar3 {
    public static void main(String[] args) {

        Circle crc1=new Circle(3.5);
        Circle crc2=new Circle(4.1);
        Object crc3=new String();

        System.out.println(crc1.equals(crc2));
        System.out.println("crc2.equals(crc3) = " + crc2.equals(crc3));

    }
}
