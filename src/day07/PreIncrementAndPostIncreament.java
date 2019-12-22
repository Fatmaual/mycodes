package day07;

public class PreIncrementAndPostIncreament {
    public static void main(String[] args) {
        int apple = 8;
        apple++ ;
        System.out.println(apple);
        System.out.println(apple++); // 9 but and ready to be 10 for next time it shows up!!!!!
        System.out.println(apple+ 20);

        int score = 10;
        System.out.println( ++score);
        System.out.println(score++);
        System.out.println(score);
        System.out.println(--score);
        System.out.println(score--);
        System.out.println(++score);
    }
}
