package day06;

public class CompoundOperator2 {
    public static void main(String[] args) {
        int studentOnline = 263;
        //studentOnline = studentOnline + 5;
        studentOnline += 5;
        System.out.println("5 people joined the class "+ studentOnline);

         studentOnline -= 3;
         System.out.println( "3 people left the class " + studentOnline );

         studentOnline *= 265;
        System.out.println("doubled people joined the class " +studentOnline);

        studentOnline /= 3;
        System.out.println("the students(1/3) dropped  the course "+ studentOnline);






    }




}
