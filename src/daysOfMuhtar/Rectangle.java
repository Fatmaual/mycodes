package daysOfMuhtar;

public class Rectangle extends Shape {

    double length, width;

public Rectangle(double length, double width){
   this.length=length;
   this.width=width;

}
    @Override
    protected void Area(){

        double Area= length*width;
        System.out.println("Area of the rectangle: "+Area);
    }
    @Override
    protected void perimeter(){
    double perimeter=(length+width)*2;
        System.out.println("perimeter of the rectangle: "+perimeter);
    }
}
