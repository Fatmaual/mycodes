package InterfaceMuhtar;

public class Jeep_Wragler implements Car, GasVehicle{

    @Override
    public void pumpGas(){
        System.out.println("Jeep needs gas");
    }

    @Override
    public void selfParking() {

    }

    @Override
    public void start(){
        System.out.println("call mechanic");
        System.out.println("oil change");
        System.out.println("jump start");

    }
}
