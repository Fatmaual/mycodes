package day49;

public interface Autonomous {

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


    void selfDrive();
}
