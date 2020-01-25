package day45;

public class Book extends Object{


    //if we don't explicitly(visibly,manually)extends another class
    //we always automatically extends Object class
    //Object class is super class of all the classes in Java

    public static void main(String[] args) {
        Book book1=new Book();
        System.out.println("book1"+book1.toString());

    }
    @Override // this is called annotation it is amking it obvious to declare we are rewriting the inherited
    // super class method
    public String toString(){
        return "my own version of toString";
    }
}
