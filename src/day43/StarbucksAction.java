package day43;

public class StarbucksAction {
    public static void main(String[] args) {


    //    Coffee c = new Coffee("Blonde",5,1.6);
      //  printCoffeeInfo(c);
        String myString = new String ("hello");
        printStringInfo(myString);
        printStringInfo("abc");


        StarbucksAction action =new StarbucksAction();
        action.printStringInfo(myString);//give me a string object give me a copy of the object



    }
    /**
     * create a static method to accept a coffee object and
     *  print it's information like this : This is: name ,
     *  price is<price> , caffeine level <level>
     * @param co  coffee object caller pass
     */
    public static void printCoffeeInfo(Coffee co){

        System.out.println("this coffee is: "+co.getType());
        System.out.println("price is : "+co.getPrice());
        System.out.println("caffeine level is: "+co.getCaffeineLevel());

    }
    /**
     * a static method to print out first and last character of a string
     * @param str
     */

    public static void printStringInfo(String str){
        System.out.println("first character is: "+str.charAt(0));
        System.out.println("last character is: "+str.charAt(str.length()-1));

    }
}
