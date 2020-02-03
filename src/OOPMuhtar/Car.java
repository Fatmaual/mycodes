package OOPMuhtar;

import day47.ElectricCar;

public abstract class Car {

    public abstract void start();

}
  class Toyota extends Car{

    @Override
      public void start(){
        System.out.println("for Toyota: push the button ");
        System.out.println("for Toyota: start the engine");

      }
  }

  class Jeep extends Car{

    public void start(){
        
        System.out.println("for Jeep: call the mechanic");
        System.out.println("for Jeep: oil change");
        System.out.println("for Jeep: start engine");

    }

  }
    abstract class ElectricCars extends Car{

    public abstract void HasBattery();
    //there are 2 methods one of them invisible start!!
    }

    class Tesla extends ElectricCar{

    @Override
    public void start(){
        System.out.println("for Tesla: say start");
        System.out.println("for Tesla: start engine");

    }

    public void HasBattery(){
        System.out.println("Tesla has battery");
    }
    }
  class Testing{
      public static void main(String[] args) {
          Jeep jeep=new Jeep();
          jeep.start();

          Toyota toyota =new Toyota();
          toyota.start();

       Tesla tesla = new Tesla();
       tesla.HasBattery();
       tesla.start();


      }
  }