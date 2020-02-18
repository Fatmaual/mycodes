package InterfaceMuhtar.Abstraction;

import InterfaceMuhtar.GasVehicle;

public class Jeep_Wragler implements Car, GasVehicle {

    public void start(){
        System.out.println("Jeep is started");
    }
    public void pumpGas(){
        System.out.println("Jeep is pumping some gas");
    }

    @Override
    public void selfParking() {

    }

}
