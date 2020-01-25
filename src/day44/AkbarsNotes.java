package day44;

public class AkbarsNotes {
    /**
     * class can have:
     * attributes of object
     * instance fields
     * behaviour of object
     * instance methods
     * constructor:
     * a special block of code that run while object is being created.it has same as class name not return type.
     * it can be overloaded(different param list)
     * static members: it should be accessed in static way!!!!  dont't out object name beginning of the method out class
     * name on it. exp:coffee1.getCoffee --> unlikely Coffee.getCoffee() it is ok.!
     * static method:
     * a method with static keyword
     * can be called in static way
     * call directly in main (if in same class)
     * ClassName.staticMethodName(...)
     * Arrays.toString
     * static field
     * ------------
     * once you create a class , it can a type for:
     * reference variable Pet myPet;
     * it can show up in couple places
     * local variable: variable inside your method
     * method parameter data type:
     * field: outside method, unedr the class
     * it can also be a return type for your method
     * ----Constructor VS Setters-----------
     * constructor:
     * good when you want to create object with initial state(attribute values given)
     * setter:
     * if you wanna change your mind ,good when you want to change the value of existing object fields.
     * why we don't the change the value directly?bc of private.
     * getter and setter:
     * how to create a class that only immutable objects :
     * create a class with private instance field. add a constructor to set the value while object is being created
     * only provide getters for private fields but do not provide setters for private fields
     * public class Person{
     *     private String name;
     *     private int age;
     * }
     * public Person(String name, int age){
     *     this.name=name;
     *     this.age=age;
     * }
     * public String getName(){
     *     return name;
     * }
     *public int getAge(){
     *     return age;
     *}
     * Person p1= new Person("Jon Snow",27);
     * any data type that not primitive type  its called reference type, any reference variable store: reference to the
     * object in the heap, pointer to the object int the heap address of the object in the heap
     * just like leash of the dog just like remote of the TV
     * by it is type primitive | reference variable
     * by its location local variable method parameter field
     *
     * ------------------
     */
}
