package day54.OOP_TV;

public class Circle extends Shape {
    double radius;
    public Circle(String color,double radius){
        super(color);
        this.radius=radius;

    }

    @Override
    public void calculatePerimeter() {
        double c =2 *Math.PI*radius;
        System.out.println("calculated perimeter of circle is "+c);
    }

    @Override
    public double calculateArea() {
        double area = Math.PI*(radius*radius);
        return area;
    }
    @Override
    public void draw(){
        System.out.println("extends shape method");
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
    public static void main(String[] args) {
        Rectangle rectangle= new Rectangle("red",7,10);
        rectangle.calculatePerimeter();
        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle);


        Circle circle=new Circle("blue",10);
        System.out.println(circle);
        circle.calculatePerimeter();
        System.out.println(circle.calculateArea());

    }
}

