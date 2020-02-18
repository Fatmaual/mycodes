package day55.AllCasting;

public class TaxiAction {
    //        Engine en = new Engine("V6", 400);
//        Driver d = new Driver("Pedro", 12345);
//        // print out first character of this driver
////        System.out.println(d.name.charAt(0) );
//
//
//        Taxi t1 = new Taxi(101, en, d);
//
//        System.out.println("t1 = " + t1.toString());

    public static void main(String[] args) {
        Engine en= new Engine("V6",400);
        Driver drv= new Driver("Sadiye Sari",2345678);


        Taxi tx= new Taxi(101,en,drv);
        System.out.println("tx = " + tx.toString());

 Taxi tx2= new Taxi(23456,new Engine("V8",100),
         new Driver("Bekir Sari",56789));

        System.out.println("tx2 = " + tx2);
        // print out driver name and car horse power
        // driver <name> is driving the taxi with horsepower <> on the highway
        //System.out.println( t2.dr.name    );

//        // how do I store the t2 plate number in a variable x ;
//        int x = t2.plateNumber ;
//        // how do I store the t2 Driver field in a variable y ;
//        Driver y = t2.dr ;
//        // how do I store the t2 Engine field in a variable z ;
//        Engine z = t2.eng ;

        // how do I get the name of the driver using t2
//        System.out.println("Driver name " + y.name );


        //i don't wanna all info about driver i just wanna get name;
        System.out.println(tx2.drv.name);
        //get the Bekir Sari
       String driverTx2= tx2.drv.name;
        System.out.println("driverTx2 = " + driverTx2);
        //get the plate number
        int x= tx2.plateNumber;
        System.out.println("x = " + x);
        //OR!!!!
        Driver driver2=tx2.drv;
        Engine engine= tx2.eng;

        System.out.println("Driver name: "+driver2.name);
        System.out.println("Driver name: "+tx.drv.name);

        //get the horsePower tx2   // How do i get the horse power of this Taxi t2
        System.out.println("Engine horsePower is: "+ tx2.eng.horsePower);

        //get the first character of driver name from tx2;
        System.out.println("Driver 2 name' first character is: "+ tx2.drv.name.charAt(0));

         

    }
}
