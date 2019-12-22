package day31;

public class ReviewOldClass {
    public static void main(String[] args) {
        String[][] pizza = {{"mushroom", "black olive", "green pepper"},
                {"spinach", "green pepper", "mushroom"},
                {"black olive", "black olive", "spinach"},
                {"mushroom", "mushroom", "red pepper"},
                {"banana pepper", "spinach", "red pepper"},
                {"mushroom", "green pepper", "green pepper"},
                {"spinach", "green pepper", "mushroom",}};
// print all of them for each loop;
        for (String[] slice : pizza) {
            for (String topping : slice) {
                //print all the value inside using for loop;
                System.out.println(topping + "\t");
            }
            System.out.println();
 //skip 3.slice of pizza what I am gonna do?I will use I need index I can't use for each loop I will
            //use for loop
            System.out.println("=============================");
            for (int x = 0; x < pizza.length; x++) {
                System.out.println("slice number :" + (x + 1));
                if (x == 2)
                    continue;
                for (int i = 0; i < pizza[x].length; i++) {
                    System.out.print(pizza[x][i] + " | ");
                }
// print all the value but stop at banana pepper
spartan:
                for (int y = 0; y < pizza.length; y++) {
                    System.out.println("slice number :" + (y + 1));

                    for (int i = 0; i < pizza[y].length; i++) {
                        if(pizza[y][i].equals("banana pepper")){
                      break spartan ;
                        }
                        System.out.print(pizza[y][i] + " | ");
                    }
                    System.out.println();
                }

            }
        }
    }
}