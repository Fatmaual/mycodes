package daysOfMuhtar;

public class Cylinder extends Shape{
  double radius,diameter;
  double height;
  final double PI=3.14;

  public Cylinder(double radius, double height){
      this.radius=radius;
      this.height=height;
      diameter= radius*2;
  }
  protected void Area(){
      double Area = (PI*diameter *radius)+(height*PI*diameter);
      System.out.println("Area of the cylinder: "+Area);
  }
  @Override
  protected void perimeter(){
      //2 (pi*D+h)
      double perimeter =2*(PI*diameter+height);
      System.out.println("perimeter of the cylinder is: "+perimeter);

  }
}
