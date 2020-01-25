package daysOfOfficeHours;

public class AkbarPresentationAboutClasses {
    /**
     * java.lang.package already automatically given it to you.everything .
     * everything we learned was about instance method. we stated the idea of protecting the data
     * if you wanna change the data; changing th eobject by pergorming with action getting and setter and ....
     * Class and Object
     * attribute:--->instance variable |field
     * behaviour:-->instance methods
     * class that I created.which is coming from JDK
     * Class is a template for Object
     * it can define what kind of attribute and behaviours an object should have.Object is the actual thing created out
     * of this template and any object created out of same template will have the attribute and behaviours defined
     * in the template
     * protecting the data |attribute of the object we can capsulate the instance field by making it private and provide
     * public getting and setters
     * we have 4 access modifier; public, protected, default, and private
     * public-->accesible anywhere
     * default-->no access modifier -->only within the package, also known as package private
     * private-->only accessible within the same class
     * outside of the class when we create object we can give a object any name we wnat, like person1, person2...
     * if we want to refer the object inside of the template itself, we can use the keyword-->this-->the current object
     * we are working on.the template does not know what are you gonna call the object outside of the class.
     *
     * so outside the template it would look like this:
     * Person p1 = new Person()
     * p1.age=18;
     * p1.eat();
     * INSIDE YOUR TEMPLATE IT WOULD LIKE :
     * this.age-->to point tothe instance field age -->if it makes you confuise just make a code newAge.
     * this.name -->to point to the instance field name
     * this.eat();-->optional usually it will just work without
     * what is difference between access the instance variable directly or using setters and getters?at the end we
     * can changing the values of variables in both way
     * public class Person{
     *  private int age;
     *  private String name;
     *
     *  public int getAge(){
     *      return age;
     *  }
     *   public void setAge (int age){
     *       this.age=age;
     *   }
     *   public String getName(){
     *       return name; // --> return this.name
     *   }
     *   public void setName(String name)
     *   this.name = name ;
     * public void eat(){
     *     print (name+"eating")
     * }
     *
     *
     * Scanner scan= new Scanner (System.in);
     * String str= new String("abc");
     *
     */
}
