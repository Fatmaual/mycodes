package day55.DenemeTaxi;


public class Taxis {
    int plateNumber;
    Engines engine;
    Drivers driver;
    public Taxis(int plateNumber, Engines engine,Drivers driver){
        this.engine=engine;
        this.plateNumber=plateNumber;
        this.driver=driver;
    }

    @Override
    public String toString() {
        return "Taxis{" +
                "plateNumber=" + plateNumber +
                ", engine=" + engine +
                ", driver=" + driver +
                '}';
    }
}
