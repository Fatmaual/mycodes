package day39;

public class CarCreation {
    public static void main(String[] args) {
        Car car1=new Car();
        car1.carColor="Silver";
        car1.carMilage=0;
        car1.carModel="Toyota";
        car1.carYear=2020;
        car1.carType='C';
        System.out.println("car1 model: "+car1.carModel);
        System.out.println("car1 milage and type: "+car1.carMilage+" "+car1.carType);

        System.out.println("-------------");

        Car car2 =new Car();
        car2.carModel="Mercedes";
        car2.carColor="Navy Blue";
        car2.carYear=2020;
        car2.carMilage=0;
        car2.carType='M';
        // I wan to change the color
        car2.carColor=car1.carColor;
        car2.goForward();
        System.out.println("car 2' yeni rengi: " + car2.carColor);

        car2.goForward();
        car2.printCarAge();
        car2.changeColor("Navy Blue");
        System.out.println("car 2 new color is: "+car2.carColor);
        car1.goForward();
        car1.printCarAge();

        System.out.println("END ");



    }
}
