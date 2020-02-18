package day56;

public class Singleton {
    /**
     * sometime we want to make a class that only generate single object
     * throughout the entire application
     */
    private static Singleton instance;

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        } else {
            System.out.println("we already have this object");
        }
        return instance;
    }

    private Singleton() {
        System.out.println("no arg being  called!!!");
    }
}