package denemelerim;

public class Car {
   private String color;
    private String model;
   private double engine;
    private int doors;

    public Car(){

    }

    public Car(String color, String model, double engine, int doors){
this.color=color;
this.model=model;
this.engine=engine;
this.doors=doors;

    }

    public void setColor(String color){
        this.color=color;

    }

    public String getColor(){
        return this.color;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngine() {
        return this.engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public int getDoors() {
        return this.doors;
    }

    public void setDoors(int doors) {
        if(doors==2 || doors==4){
            this.doors = doors;
        }else{
            System.out.println("kapi sayisi sadece 2 veya 4 olabilir");
        }

    }

    public void start(){
        System.out.println( "arabaya strat verildi");
    }
    public void stop(){
        System.out.println("araba durdu");
    }
    public void showInfo(){
        System.out.println("arabanin rengi: "+this.color);
        System.out.println("arabanin modeli: "+this.model);
        System.out.println("arabanin engine: "+this.engine);
        System.out.println("arabanin doors: "+this.doors);
    }

    public static void main(String[] args) {
       Car car1=new Car("silver","toyota",4.5,8);
       car1.showInfo();
    Car car2=new Car("blue","bmw",6.7,9);
    car2.showInfo();

     /**  car1.setDoors(3);
       car1.setColor("silver");
       car1.setEngine(4.5);
       car1.setModel("toyota");

        System.out.println(car1.getColor());
        System.out.println(car1.getDoors());
        System.out.println(car1.getEngine());
        System.out.println(car1.getModel()); */


    }
    }