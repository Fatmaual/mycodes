package day55.DenemeTaxi;

public class TaxisAction {
    public static void main(String[] args) {
        Engines engines=new Engines("B8",500);
        Drivers driver=new Drivers("Pedro",23456778);
        Taxis taxi1= new Taxis(23456,engines,driver);
        System.out.println("taxi1 = " + taxi1.toString());
        Taxis taxi2= new Taxis(556677888,new Engines("A4",450),
                new Drivers("Ayse",33445544));
        System.out.println("taxi2 = " + taxi2);
        //get first character of drivers name
        System.out.println(driver.name.charAt(0));
        System.out.println(taxi2.driver.name.charAt(0));

        //get plate number for taxi1 and execute in a variable x;
        int x=taxi1.plateNumber;
        System.out.println(x);

        //how do I store taxi2 Driver field in a variable y;
        Drivers  y=taxi2.driver;
        System.out.println("y is : "+y);
        System.out.println("just Driver name of tax2: "+y.name);
        System.out.println("just driver name of tax1: "+taxi1.driver.name);

        //just get the engine
        Engines z= taxi1.engine;
        System.out.println("just engine of taxi1: "+z.enginePower);
        System.out.println("just get the engine of taxi2: "+taxi2.engine.enginePower);

        //get plateNumberOF TAX2;
        System.out.println("get just platenumber of tax1: "+taxi1.plateNumber);








    }
}
