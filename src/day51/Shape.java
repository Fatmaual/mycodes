package day51;

public abstract class Shape {

    public abstract void draw();

}


class Triangle extends Shape {

    @Override
    public void draw() {
        System.out.println(" this is sub triangle and method DRAWING TRIANGLE");
    }
}


class Rectangle extends Shape {

    @Override
    public void draw() {
        System.out.println("this is sub rectangle and method DRAWING RECTANGLE");
    }
}

class Circle extends Shape {

    @Override
    public void draw() {
        System.out.println("this is sub circle and method DRAWING CIRCLE");
    }
}
