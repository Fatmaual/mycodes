package day45;

public class Earth extends Planet {

    int population;



    public Earth(double gravity, int radius, boolean hasLife, int population) {
        super(gravity, radius, hasLife);
    //    this.gravity = gravity;
      //  this.radius = radius;
        //this.hasLife = hasLife;
        this.population = population;

        // PRACTICAL USAGE OF Super() keyword to call super class constructor is
        // to reuse the functionality of super class constructor in sub class constructor
    }

    public static void main(String[] args) {
        Earth planet1= new Earth(9.81,5000,true,100000);
        System.out.println("planet 1: "+planet1);
    }
    // ADDING toString method so we can print out object

    public String toString() {
        return "Earth{" +
                "population=" + population +
                ", gravity=" + gravity +
                ", radius=" + radius +
                ", hasLife=" + hasLife +
                '}';
    }
}
