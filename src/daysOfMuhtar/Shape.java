package daysOfMuhtar;


public class Shape {

    protected void Area(){
        System.out.println("Area is 0 ");
    }
    protected void perimeter(){
        System.out.println("perimeter is 0 ");
    }
    protected void capacity(){
        System.out.println("volume is 0 ");
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10,20);
        rectangle.Area();
        rectangle.capacity();
       // rectangle.length=10;
        //rectangle.width=20;
        rectangle.Area();// I need to override area in the sub class-->expecting 200

        Rectangle rectangle1=new Rectangle(30,40);
        rectangle1.Area();
        rectangle1.perimeter();
        rectangle1.capacity();

        Square square=new Square(10);
        square.Area();// -->the result is 0 bc we haven't new funcionality to the new method -->100
        square.perimeter();//40
        square.capacity();//0

        Circle circle=new Circle(5);
        circle.Area(); //78.5
        circle.perimeter();//0

        Cylinder cylinder= new Cylinder(2,5);
        cylinder.Area();//0
        cylinder.perimeter();



    }
}
