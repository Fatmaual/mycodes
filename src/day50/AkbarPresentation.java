package day50;

public class AkbarPresentation {
    /**
     * if a class does not explicitly (visibly)
     * 		extends another class ,
     * 	it will implicitly (automatically ) extends Object class
     * 	public class Car { }
     * 	public class SpyCar extends Car{
     *        }
     * 	Object--Car---SpyCar
     * ---------------------
     * 2 way to achieve abstraction in java
     * 	Abstract class
     * 		can have
     * 		everything a normal class can have
     * 		+ abstract methods
     * 		- no object can be created from abstract class
     * 	Interface
     * 		can have
     * 		public static final field : CONSTANT
     * 		abstract methods
     * 		default methods { HAS BODY : DEFAULT IMPLEMENTATION}
     * 		static methods { HAS BODY : NOT INHERITED, STATIC WAY}
     *what we can have inside an interface :
     * 	 public static final field (CONSTANT)
     * 	 abstract method ( NO-BODY!!!)
     * 	 default method (MUST HAVE BODY : usually have default implementation)
     * 	 static method (MUST HAVE BODY : NOT INHERITED, use in static way)
     * public interface Edible{
     * 	public abstract void eat();
     * }
     * Edible e1 = new Edible() ; NO OBJECT !!!!!!!
     * ALL OF THEM ARE optional :
     *  is there any interface that has nothing inside ? YES
     *  its known as marker interface
     *  Examples of marker interfaces are the Serializable , Cloneable and Remote interfaces.
     *  These are used to indicate some information to compilers or JVMs
     * Where else have we seen default  :
     *  switch statement
     *  		String season = "winter";
     *  		switch(season){
     *  			case "spring":
     *  				// ski
     *  			.....
     *  			default:
     *  				// if nothing match come here !!!
     *                }
     *  access modifer for
     *  		fields , methods , constructor
     *  		if there is no visible access modifer like public protected private
     *  			it means it has default access modifier
     *  			IT IS INVISIBLE , WE DONT SEE THE WORD DEFAULT HERE
     *  interface
     *  		default method :
     *  			a method that have default keyword in method delaration
     *  			and has default implementation (body)
     *  			THIS IS THE ONLY PLACE DEFAULT METHOD CAN EXISTS !!!
     *   constructor
     *   		default cosntructor that given by compiler
     *   		when a class does not have any constructor
     *   		WE DO NOT SEE THE WORD DEFAULT HERE , Its just a way to call it
     *   default values for
     *   		array items get default values
     *   		int[] nums = new int[5] ;   [0,0,0,0,0]
     *   		double[] nums = new double[3] ;   [0.0, 0.0 , 0.0]
     *   		boolean[] bools = new boolean[2] ;  [false , false]
     *   		........
     *   		what about for reference type
     *   		String[]  names = new String[2]  [null, null]
     *   		fields : instance or static field also gets default values
     *   			for whole numbers -->> 0
     * 			for fractional numbers -->> 0.0
     * 			for boolean  -->> false
     * 			for char -->> empty char
     * 			for any non-primitive types we get null !!!
     *
     * 	Asiya's Presentation:
     * 	Topic:  Abstraction
     *             Abstract methods
     *             Abstract class
     *             abstract class VS Non-Abstract class
     * Abstraction: concentrating on importance/essential things without worrying about the details
     * We have 2 ways to achieve abstraction:
     *
     * 1-way : abstract class:
     *
     *          keyword: abstract
     *            1. we cannot create object of
     *
     *            2. it's a class that's meant to be extended
     *            3. cannot be final
     *            4. class' access modifiers can only public or default
     *
     *
     *               abstract method: 1.a method that's MEANT to be override
     *                    2.a method without body/implementation, hides the implementation details
     *                    3.cannot be static, private, final
     *                    4.Only the instance method can be override
     * ==>An abstract class has no use until unless it is extended by some other class.
     * => Concrete class MUST override all abstract methods that are inherited from abstract parent class.
     * => Can abstract class have ONLY non-abstract methods?
     * - Yes.
     * => The Child class that is extending to the abstract class is called Concrete class.
     * Ex: Cat and Dog are concrete classes.
     * => Can we instantiate abstract class(Can we create object) if we don't have any abstract method in it?
     * - NO.
     * => Can abstract class override methods?
     * - Yes. Because abstract classes can have a methods with body/implementation as well.
     * => How can we have a class that doesn't have a child?
     * - final.
     * => Can abstract classes be final?
     * - No.
     * => Can abstract method be final?
     * - No.
     * ==>Why can’t we create the object of an abstract class?
     *     Because these classes are incomplete, they have abstract methods that have no body
     *     so if java allows you to create object of this class then if someone calls the abstract method
     *     using that object then What would happen?
     * ==>Does abstract class have a constructor?
     * - Yes. Constructor of abstract is NOT used to create an object.
     *         Because it is abstract class.
     * BUT it will help us to reach full inheritance process. It helps Java to reach to Object class.
     * 2-way: Interface
     *              An interface in Java is basically a way of specifying what methods a class should have
     *          Have Abstract method ONLY
     *          After java 8, there are static and default methods are added as well.
     * ==>What we can have in Interface ?
     *     methods: Abstract methods, static methods, default method
     *     variables:  public static final ==> automatically variables are public, static and final by default
     *             EX: public static final String ZOO_NAME = "CyberZoo";
     * ==>What we cannot have in Interface?
     *     Constructor
     *     Instance methods
     *     instance variable
     *     instance block
     *     static block
     */
}
