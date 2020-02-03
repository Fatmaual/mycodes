package day50;

public class Circle extends Shape {

    int radius;

    public Circle(String name, int radius ) {
        super(name);
        this.radius=radius;
    }

    @Override
    public void calculateArea() {
        this.area= Math.PI*radius;

    }

    @Override
    public void draw() {
        System.out.println("make a point and start making circle");

    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }
}
