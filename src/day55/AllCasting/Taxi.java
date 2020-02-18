package day55.AllCasting;

// Taxi  Engine  -- Driver -- Passengers

// Taxi has Driver -- Driver object has 2 attribute (name ,driverID)

// Create a class called Driver -- it has has 2 attribute (name String ,driverID int)
// constructor to set the value , add toString method so we can print out
// Add a instance field called Driver dr , update your constructor to set Driver as well

// Encapsulate All the fields as homework
public class Taxi {
    int plateNumber;
    // just like String , we have class Engine
    // so I can use it as data type for my field
    Engine eng;
    // just like String , we have class Driver
    // so I can use it as data type for my field
    Driver drv;

    public Taxi(int plateNumber,Engine eng, Driver drv){
        this.plateNumber=plateNumber;
        this.eng=eng;
        this.drv=drv;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "plateNumber=" + plateNumber +
                ", eng=" + eng.toString() +
                ", drv=" + drv.toString() +
                '}';
    }
}
class Driver{
    String name;
    int driverID;
    public Driver(String name, int driverID){
        this.name=name;
        this.driverID=driverID;

    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", driverID=" + driverID +
                '}';
    }
}

  class Engine{
    String type;
    int horsePower;
     public Engine(String type, int horsePower){
         this.type=type;
         this.horsePower=horsePower;
     }

      @Override
      public String toString() {
          return "Engine{" +
                  "type='" + type + '\'' +
                  ", horsePower=" + horsePower +
                  '}';
      }
  }