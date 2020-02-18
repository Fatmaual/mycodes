package daysOfOfficeHours.MuhtarAssociation;
class Rectangle{
    public double l,w;

    public Rectangle(double l, double w){
        this.l=l;
        this.w=w;

    }
    public boolean equals( Object ob){
        if(ob instanceof Rectangle){
            double Area1=l*w;
            double Area2=((Rectangle)ob).l*((Rectangle)ob).w;
            if(Area1==Area2){
                return true;
            }
        }
        return false;
    }
}
class Circle {
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public boolean equals(Object obj){
        if(obj instanceof Circle)
            if(radius==((Circle)obj).radius) //circle c =(circle) obj;
                return true;
                return false;
    }
}

 public class TestingCircle {
            public static void main(String[] args) {
                Circle c1 = new Circle(3.4);
                Circle c2 = new Circle(3.4);
                Circle c3 = new Circle(4.5);
                System.out.println(c1.equals(c2));
                System.out.println(c2.equals(c3));

                Rectangle r1=new Rectangle(3,4);
                Rectangle r2=new Rectangle(5,3);
                System.out.println(r1.equals(r2));

            }
        }

