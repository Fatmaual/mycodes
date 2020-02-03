package denemelerim;

public class MethodlarYoutube {
    /**
     * Methodlar ve fieldlar
     * Fields:
     * Attributes -> features
     * methods:
     */
  private  String color;
  private  String model;
   private double engine;
  private int doors;



  public MethodlarYoutube(){

  }
  public MethodlarYoutube(String color, String model,double engine,int doors){
      this.color=color;
      this.model=model;
      this.engine=engine;
      this.doors=doors;
  }

    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color=color;
    }
    public double getEngine(){
        return this.engine;
    }
    public void setEngine(double engine){
        this.engine=engine;
    }
    public String getModel(){
        return this.model;
    }
    public void setModel(String model){
        this.model=model;
    }
    public int getDoors(){
        return this.doors;
    }
    public void setDoors(int doors){
        if(doors==2 || doors==4){
            this.doors=doors;
        }else{
            System.out.println("kapi sayisi sadece 2 veya 4 olabilir");
        }

    }

    @Override
    public String toString() {
        return "MethodlarYoutube { " +
                "color:'" + color + '\'' +
                ", model:'" + model + '\'' +
                ", engine:" + engine +
                ", doors:" + doors +
                '}';
    }
    public void start(){
        System.out.println("araba calisti");
    }
    public void stop(){
        System.out.println("araba durdu");
    }
   public void showInfo(){
       System.out.println("Arabanin rengi:  "+color+'\''+"  arabanin markasi " +model+'\''+"   arabanin engine "+engine+
               '\''+"  arabanin kapi sayisi "+doors);
   }
    public static void main(String[] args) {
        MethodlarYoutube car1= new MethodlarYoutube("green","bmw",3.6,4);
        car1.model="Toyota";
        car1.color="silver";
        car1.engine=4.5;
        car1.doors=4;

        System.out.println("arabanin rengi "+car1.color);
        System.out.println("arabanin modeli "+car1.model);
        System.out.println("arabanin engine "+car1.engine);
        System.out.println("arabanin kapi sayisi "+car1.doors);

        car1.setColor("gumus");
        System.out.println(car1.getColor());
        System.out.println(car1.toString());
        car1.start();
        car1.stop();


    }


}
