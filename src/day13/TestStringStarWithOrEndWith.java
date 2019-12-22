package day13;

public class TestStringStarWithOrEndWith {
    public static void main(String[] args) {
        String name = "Muge";
        System.out.println(name.startsWith("Mu"));
        System.out.println(name.startsWith("mu"));
        System.out.println(name.startsWith("Mac"));
        System.out.println(name.endsWith("e"));
        System.out.println(name.endsWith("g"));
        System.out.println(name.endsWith("ge"));
        System.out.println(name.endsWith("E"));


    }
}
