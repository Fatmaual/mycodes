package day40;

public class SpaceShips {
    /**
     * create class called SpaceShip
     * it has 4 attributes:
     * name as String
     * currentDirection as String | up,down,right,left
     * xCoordinate as int
     * yCoordinate as int
     */
    String name;
    String currentDirection;
    int x;
    int y;

    /**
     * neden VOID METHOD ALIYORUM SADECE PRINT YAPMAK ICIN i JUST WANNA CHANGE THE ACTION
     * AND MOVE OB THAT'S THE IDEA FOR VOID METHOD
     * provide initial position of spaceship
     *
     * @param newX
     * @param newY
     */
    public void setInitialPosition(int newX, int newY) {
        //x ve y newx newy value si ile isimlendirdim.iki uzaygemisi dusun ikisi de cocuk ama simdi
        // birine nexX digerine newY dedim

        x = newX;
        y = newY;
    }

    /**
     * Accept 1 string parameter to set the direction to either up ,down,right,left
     *
     * @param newDirection
     */
    public void setDirection(String newDirection) {
        if (newDirection.equalsIgnoreCase("up") ||
                newDirection.equalsIgnoreCase("down") ||
                newDirection.equalsIgnoreCase("right") ||
                newDirection.equalsIgnoreCase("left")) {
            currentDirection = newDirection;
        } else {
            System.out.println("invalid direction");
            //we set the direction to empty value if user pass wrong direction
            currentDirection = "";
        }
    }

    /**
     * move the spaceship to 1 block according to the current direction
     */
    public void move1Block() {
        //currentDirection can not be null!!
        //or it will throw an exception
        switch (currentDirection) {
            case "right":
                x += 1; //increasing x coordinate by 1 if spaceship move right
                break;
            case "left":
                x -= 1; //decreasing x coordinate by1 if spaceship move left
                break;
            case "up": //increasing y coordinate by 1 if spaceship move up
                y += 1;
                break;
            case "down": //decreasing y coordinate by 1 if spaceship move down
                y -= 1;
            default:
                break;
        }

    }
    //add a functionality to move1Block with direction provided in one shot
    //This will take a direction and move spaceship object 1 block
    //@param newDirection
    public void move1Block(String newDirection){
        setDirection(newDirection);
        move1Block();
    }



    public String toString() {
        return "SpaceShips{" +
                "name='" + name + '\'' +
                ", currentDirection='" + currentDirection + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}