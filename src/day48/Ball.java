package day48;

public class Ball implements Bouncible {
    /**
     * create 2 implementing classes of Bouncible
     * * 	Ball
     * * 	instance fields
     * * 		shape as String
     * * 		color as String
     * * 	create constructor to set those 2 fields
     * * 	instance methods
     * * 		implements abstract method from interface
     * * 		toString method
     */


        String shape;
        String color;
        //public static final double GRAVITY = 9.81;

        public Ball(String shape, String color) {
            this.shape = shape;
            this.color = color;
        }

        @Override
        public void bounce() {
            System.out.println("This " + shape + " and " + color +
                    " ball is bouncing if gravity is " + GRAVITY);
        }


        @Override
        public String toString() {
            return "Ball{" +
                    "shape='" + shape + '\'' +
                    ", color='" + color + '\'' +
                    '}';
        }
    }