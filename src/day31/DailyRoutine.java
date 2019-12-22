package day31;

public class DailyRoutine {
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
public  static void prepareKidsForSchool(){
    System.out.println("drop the children to the bus stop");
    System.out.println("tell that love them so much!!");
    System.out.println("wave to them");
    System.out.println("==========");
}
 public static void takeThemToSchool(){
     System.out.println("pick the kids up from the bus stop ");
     System.out.println("give their snack when arrived home");
     System.out.println("=======");
 }
 public static void studyJava(){
     System.out.println("focus on the subjects");
     System.out.println("get the reviews");
     System.out.println("practice practice practice");
     System.out.println("============");
 }
 public static void sayIlovejava300Times(){
     for (int x = 1; x < 100; x++) {
         System.out.print("I love Java!");

     }
     System.out.println();
 }

 public static void main(String[] args) {
        /**
         * Daily Routine
         * wakeuP
         * drinkCoffee
         * preparekidsforSchool
         * takeThemToSchool
         * gottoWork
         * groceyShoppping
         * cooking
         * studyJava
         * gotoSleep
         * */
        wakeUp();
        drinkCoffe();
        prepareKidsForSchool();
        takeThemToSchool();
        studyJava();
        sayIlovejava300Times();
    }

}
