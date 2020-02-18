package day54.OOP_TV;
interface Drawable{

}
public abstract class Shape implements Drawable {
    String color;

    public Shape(String color) {
        this.color = color;

    }
    public abstract void calculatePerimeter();
    public abstract double calculateArea();

    public void draw() {

    }

    //the object version of to string method is not abstract method
    //you can override a non-abstract method with absrtact method if it's
    //defined in abstract method

    public abstract String toString();

}
