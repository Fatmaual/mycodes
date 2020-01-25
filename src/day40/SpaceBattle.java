package day40;

import java.util.Arrays;

public class SpaceBattle {
    public static void main(String[] args) {
        /**
         *  // IF GIVEN WRONG DIRECTION , IT WILL NOT MOVE !!
         * //        stars.setDirection("ABC");
         * //        stars.move1Block();
         * //        System.out.println("stars " + stars);
         * //        // IF GIVEN WRONG DIRECTION , IT WILL NOT MOVE !!
         * //        stars.setDirection("ABC");
         * //        stars.move1Block();
         * //        System.out.println("stars " + stars);
         * ONEMLI NOT:x e right left komutu verdigim icin sadece right ve left de y ise up and down da calisiyor.
         */

        SpaceShips stars = new SpaceShips();
        stars.name = "Orville";
        stars.setDirection("right");
        stars.setInitialPosition(1, 5);
       // stars.move1Block();
        System.out.println("stars : " + stars);

//        stars.setDirection("down");
//        stars.move1Block();
//        System.out.println("stars " + stars);
      //  stars.setDirection("down");
       // stars.setInitialPosition(2,4);
       // stars.move1Block();
        //System.out.println("stars: " + stars);

        stars.move1Block("up");
       stars.move1Block("down");
       stars.move1Block("right");
      // stars.move1Block("left");
       stars.move1Block("home");
        System.out.println(stars);


    }

}


