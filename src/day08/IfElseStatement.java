package day08;

public class IfElseStatement {
    public static void main(String[] args) {
        int speedLimit = 60;
        int yourCurrentSpeed = 100;

        boolean IamSpeeding = yourCurrentSpeed > speedLimit;
        if (yourCurrentSpeed > speedLimit){
            System.out.println("pulled over by the police");
        } else{
            System.out.println("go shopping!!");
        }
        System.out.println("the end");

    }
}
