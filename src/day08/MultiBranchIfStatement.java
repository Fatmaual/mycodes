package day08;

import java.sql.SQLOutput;

public class MultiBranchIfStatement {
    public static void main(String[] args) {
        //pseudo code
        //given your currentSpeed, SpeedLimit
        //check the current speed is
        //more than 90 -->> jail
        //more than 80 and 90 -->> reckless driving

        //more than 70 and less than 80 -->> point taken
        // more than 60 and less than 70 -->> warning
        //else
        //if not speeding keep driving
        // start to code with 70 line


        int currentSpeed = 80;
        if(currentSpeed > 70) {
            System.out.println("you are speeding more than 70 ---Points taken!!");
        } else if (currentSpeed > 60 ){
            System.out.println("your speed is less than or equal 70 but more than 60");
        }else {
            System.out.println("keep driving you are good!!");
        }
       int nowSpeed = 45;
        if (nowSpeed> 60){
            System.out.println("keep driving");
        }else if (nowSpeed > 65){
            System.out.println("keep driving");
        }

    }

}
