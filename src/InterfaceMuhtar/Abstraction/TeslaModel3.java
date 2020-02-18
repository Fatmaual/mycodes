package InterfaceMuhtar.Abstraction;

public class TeslaModel3 implements Car,ElectricVehicle{
    public void start(){
        System.out.println("voice control of Tesla");
    }
    //for interface the methods must be more visible check the electricvehicle method
    public void Charge(){
        System.out.println("Tesla is charging with interface method");
    }
    public void SelfDrive(){
        System.out.println("Tesla is selfDrivinf with interface");

    }
}
