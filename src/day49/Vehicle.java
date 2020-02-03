package day49;

public abstract class Vehicle implements Autonomous {
    /**
     * Task :
     * 	Create an Interface called Autonomous
     * 		it has a single abstract method
     * 			selfDrive()
     * 	Create an abstract class called Vehicle
     * 		it has 1 fields
     * 			year
     * 		add a constructor to set the field
     * 		abstract method start() ;
     * 		non-abstract instance method
     * 			goForward
     * 	Create a concrete class called Tesla
     * 		 add instance field horsePower as int
     * 	Tesla extends Vehicle and implements Autonomous
     * 		add constructor to set all fields
     * 		implement all abstract methods
     * 		add toString methods
     * 	create main method to test your code
     */
   int year;

   public Vehicle(int year){
       this.year=year;
    }

    @Override
    public void selfDrive() {
        System.out.println("let drive the car by itself");
    }

    public abstract void start();

}
