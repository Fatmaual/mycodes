package day11;

public class StringEquality2 {
    public static void main(String[] args) {
        String name = "Rabia"; // it's called String literal
        String name2 = new  String ( "Rabia");
        String name3 = "Rabia";
        System.out.println(name);
        System.out.println(name2);
        System.out.println(name == name2); // it has given false
        System.out.println(name == name3 );
        System.out.println("using equals methods");
        System.out.println( name.equals(name2) );
        System.out.println(name.equals(name3) );
    }
}
