package day41;

public class TVStore {
    public static void main(String[] args) {
        TV tv1=new TV();
        tv1.brand="Samsung";
        tv1.currentChannel=2000;

        System.out.println("tv1 : "+tv1.toString());//With toString!!!!
        tv1.turningOn();
       tv1.setTheChannel(12);
       tv1.setTheChannel(121);

        System.out.println(tv1.getCurrentChannel());
        tv1.turningOff();

        System.out.println("tv1 : "+tv1.toString());

    }
}
