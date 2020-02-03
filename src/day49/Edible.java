package day49;

public interface Edible {
    /**
     * interface is like a contract , once someone sign a contract he/she will provide all the details that
     * she/he must do
     * public static final=constant
     * evet biz bunu interfacelerde yapmak zorundayiz. make field public static final
     *
     * Does Interface has constructor??
     * BIG NOOOOO
     * CLASS CANNOT HAVE MORE THAN ONE CLASS LIKE IMPLEMENT
     *that means sub must have just 1 super class but super can have more than one
     */

    public static final boolean IS_HUMAN_FOOD=true;

    public abstract void eat();
    public abstract void drink();
    public default void digest(){
        System.out.println("default method ile icecream and burger compile error olmadi");
    }

}
