package InterfaceMuhtar;

import day47.ElectricCar;

public class ToyotaHybrid implements Car, ElectricVehicles,GasVehicle {


    @Override
    public void start() {
        System.out.println("pumpking gas");
    }

    @Override
    public void charge() {
        System.out.println("charging");

    }

    @Override
    public void selfDrive() {
        System.out.println("self driving model");

    }

    @Override
    public void pumpGas() {
        System.out.println("push start the button");

    }
    @Override
    public void fly(){
        System.out.println("Toyota is flying");
    }
    @Override
    public void selfParking(){
        System.out.println("toyota can self parking");
    }
}
