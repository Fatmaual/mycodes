package denemelerim;

 class Mains{
     public static void main(String[] args) {
         Square square= new Square("my square",10);
         System.out.println("square without calculating "+square);
         square.calculateArea();
         System.out.println("square after calculating "+square);
     }

 }

public abstract class Shape implements Drawable{
    String name;
    double area;

    public Shape(String name){
        this.name=name;

    }
    public abstract void calculateArea();
    //public abstract void draw(); we don't see it but we inherited

}
   interface Drawable{

   public abstract void draw();


  }

  class Square extends Shape{

    //String name
      //double area
    int length;

      public Square(String name, int length) {
          super(name);
      }

      @Override
      public void calculateArea() {
         area = length * length;
      }

      @Override
      public void draw() {
          System.out.println("draw 4 equal line with length "+length);

      }

      @Override
      public String toString() {
          return "Square{" +
                  "name='" + name + '\'' +
                  ", area=" + area +
                  ", length=" + length +
                  '}';
      }
  }