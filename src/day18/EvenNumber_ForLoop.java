package day18;

public class EvenNumber_ForLoop {
    public static void main(String[] args) {

        for (int i =0; i<100; i +=2 ){  //or x= x+2
            System.out.print(i+ " ");
        }
        for (int i = 0; i < 100; i+=3) {
            System.out.println(i + " ");
        }
        System.out.println("--------");

        for (int i =0; i < 100; i++) {
            if(i%5==0 && i %3==0){
                System.out.println(i+ " is fizz buzz number");
            }
        }

    }
}
