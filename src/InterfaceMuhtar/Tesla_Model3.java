package InterfaceMuhtar;

public class Tesla_Model3 implements Car,ElectricVehicles{


    @Override
    public void start(){
        System.out.println("Voice control \" Tesla Start \" ");
    }
    @Override
    public void charge(){
        System.out.println();
    }
    @Override
    public void selfDrive(){
        System.out.println();
    }
    @Override
    public void fly(){
        System.out.println("Tesla is flying");
    }
}
