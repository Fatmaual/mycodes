package daysOfMuhtar.PoliOfis;


class Circle{
    public double radius;
    public Circle(double radius){
        this.radius=radius;
    }

  @Override
    public boolean equals(Object obj){
       // Object o1= new Circle(3.5);
       // Object o2= new Circle(6.7);
       // if(obj )
        return false;
    }
}

public class TestCircle {
    public static void main(String[] args) {
        Circle c1= new Circle(3.5);
        Circle c2= new Circle(6.7);
        System.out.println(c1.equals(c2));



    }
}
