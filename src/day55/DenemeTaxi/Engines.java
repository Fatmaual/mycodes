package day55.DenemeTaxi;

public class Engines {
    String type;
    int enginePower;

    public Engines(String type, int enginePower){
        this.type=type;
        this.enginePower=enginePower;

    }
    public String toString(){
        return "Engines { "+" type: "+ type+'\''+" ,enginePower: "+enginePower+'}';
    }

}
class Drivers{
    String name;
    int driverID;

   public Drivers(String name, int driverID){
       this.name=name;
       this.driverID=driverID;
   }

    @Override
    public String toString() {
        return "Drivers{" +
                "name='" + name + '\'' +
                ", driverID=" + driverID +
                '}';
    }
}