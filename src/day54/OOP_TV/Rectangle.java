package day54.OOP_TV;

public class Rectangle extends Shape {
    int height, width;

    public Rectangle(String color,int width,int height) {
        super(color);
        this.width=width;
        this.height=height;
    }
public void draw(){
    System.out.println("extends shape method");
}
    @Override
    public void calculatePerimeter() {
        System.out.println("perimeter is: "+( 2*height+2*height));

    }

    @Override
    public double calculateArea() {
        return width*height;
    }

    @Override
    public String toString() {
        return "Rectangle [width :"+ width+ " , height: "+height+
                " , color :"+color+ calculateArea() +" ] ";
    }
}
