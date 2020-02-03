package day49;

public final class Tesla extends Vehicle implements Autonomous, Chargable {
    /**
     * Task :
     * Create an Interface called Autonomous
     * it has a single abstract method
     * selfDrive()
     * Create an abstract class called Vehicle
     * it has 1 fields
     * year
     * add a constructor to set the field
     * abstract method start() ;
     * non-abstract instance method
     * goForward
     * Create a concrete class called Tesla
     * add instance field horsePower as int
     * Tesla extends Vehicle and implements Autonomous
     * add constructor to set all fields
     * implement all abstract methods
     * add toString methods
     * create main method to test your code
     */
    int horsePower;
    String model;

    public Tesla(String model,int year, int horsePower) {
        super(year);
        this.horsePower=horsePower;
        this.model=model;
    }

    @Override
    public void start() {
        System.out.println("tesla model "+model+"self drivind ");
    }

    @Override
    public String toString() {
        return "Tesla{" +
                "horsePower=" + horsePower +
                ", year=" + year +
                '}';
    }
public void selfDrive(){
    System.out.println("tesla self driving"+model+"driving itself");
}

    public static void main(String[] args) {

        Tesla tt= new Tesla("Tesla X",2020,500);
        tt.selfDrive();
        tt.start();
   tt.charge();

    }

    @Override
    public void charge() {

    }
}