package day28;

public class MuhtarOrnegi {
    public static void main(String[] args) {
        String[] names = {"John", "Kevin", "Scott"};
        System.out.println("First name: " + names[0]);

        for (String name : names) {
            System.out.println(name);
        }
        //let's say we need to store some table
        //where we have rows and columns

        String[][] students = {
                {"1", "John", "35", "USA"},
                {"2", "Kevin", "40", "Brazil"},
                {"3", "Scott", "20", "Canada"}
        };
        //to format your code
        //click option + command + L
        System.out.println("How many arrays inside students 2d array? " + students.length);
        System.out.println("How many values in second row (inner array)? " + students[1].length);

        for(String[] arr: students){
            for(String value: arr){
                System.out.print(value+" ");
            }
            System.out.println();
        }


    }
}
