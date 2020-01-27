package day47;

public class AbstractClass {

    /**
     * Abstract class : hiding the implementation details
     *
     *
     * 1.   how to create one?
     *      use the word abstract in class definition
     *
     * 2.   what does it do?
     *      * it will prevent object being created out of this class also
     *        known as - can not be instantiated
     *      * it can have abstract method
     *      it does not have body
     *
     *      who need to provide body?
     *      concrete subclass MUST provide body for the methods
     *      also known as implementing abstract methods
     *
     * 3.   what is the difference between
     *      a normal class(non abstract)    and abstract class?
     *
     *      a normal class
     *          can not have abstract method
     *          it can have everything else
     *
     *      an abstract class
     *          can have
     *              fields :
     *                      instance field
     *                      static  field
     *
     *              methods :
     *                      abstract methods
     *                      non-abstract instance methods
     *                      static methods
     *                      (there is not abstract static method)
     *
     *              constructor
     *                      --OF COURSE IT CAN!
     *                      BUT WHY???? WE ARE NOT CREATING OBJECT
     *                      yes we are not creating object here.
     *                      but we can provide reusable
     *                      code for sub class in abstract class constructor
     *                      --most of the time initializing the fields by using
     *                      super(arguments..)
     *
     * SO THE BOTTOM LINE IS :
     * ABSTRACT CLASS CAN NOT BE INSTANTIATED(NO OBJECT CREATE OUT OF IT)
     * IT CAN HAVE EVERYTHING A NORMAL CLASS CAN HAVE
     * PLUS
     * IT CAN HAVE ABSTRACT METHODS
     *
     */


}
