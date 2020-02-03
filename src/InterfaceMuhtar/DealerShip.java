package InterfaceMuhtar;

public class DealerShip {
    public static void main(String[] args) {
        Tesla_Model3 car1= new Tesla_Model3();
        car1.start();
        System.out.println("===");
        car1.fly();
        System.out.println("---");
        ToyotaHybrid car2= new ToyotaHybrid();
        car2.start();
        System.out.println("---");
    Jeep_Wragler car3= new Jeep_Wragler();
    car3.start();
        System.out.println("====");
    car3.pumpGas();
        System.out.println("----");
    car2.start();
        System.out.println("====");
    }

}
