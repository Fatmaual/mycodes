package InterfaceMuhtar.Abstraction;

public class Toyota_Hybird implements Car,ElectricVehicle,GasVehicles {
    @Override
    public void start() {
        System.out.println("toyota class start method");
    }

    @Override
    public void Charge() {
        System.out.println("toyota class charge method");
    }

    @Override
    public void SelfDrive() {
        System.out.println("toyota class selfdrive method");
    }

    @Override
    public void pumpGas() {
        System.out.println("toyota class pumpGas method");
    }
    public void fly(){
        System.out.println("toyota is flying ");
    }
}
