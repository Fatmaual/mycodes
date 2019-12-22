package day31;

public class CllingOneMethodInsideAnother {
    public static void main(String[] args) {
        finallyAwake();
        drinkCoffe();

    }
    public static void finallyAwake(){
        wakeUp();
        drinkCoffe();

    }
    public static void wakeUp(){
        System.out.println("turn off alarm clock");
        System.out.println("get out from the bed");
        System.out.println("smile!!!!");
        System.out.println("=============");
    }
    public static void drinkCoffe(){
        System.out.println("go to kitchen");
        System.out.println("turn on your coffee machine");
        System.out.println("get your favorite coffee");
        System.out.println("enjoy your coffee");
        System.out.println("===============");
    }

}
