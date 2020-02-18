package day56;

public class ProductTest {
    public static void main(String[] args) {
        Product product1= new Product("Apple Macbook",2999);
        System.out.println(product1.toString());
        Product product2= new Product("Sony TV",499);
        Product product3=new Product("Sony TV",499);

    //    System.out.println("is product 1 == product 2? "+(product1==product2));
     //   System.out.println("is product 2 == product 3? "+(product2==product3));
  //equal method is coming from Object class
  //Product extends Object so Product has equals method inherited
        System.out.println("how about using equal methods for product1 and product 2? "+ product1.equals(product2));
        System.out.println("how about using equal methods for product2 and product 3? "+product2.equals(product3));
        System.out.println("how about using equal methods for product2 and product 2? "+product2.equals(product2));
        // Derya Hocanin notu: //here we are overriding equals method from the Object class.
//we want to override because equals method checks if we are pointing to the same object.
//but we just want to check if they have same name and price
// and return true even if they are different objects
        //  public boolean equals(Object obj){
        //how to compare this name and price to whatever user has.
        //We cannot change Object to Product as param because in order to overrride
        //the method signature must be the same. So here we need to do downcasting
        //in order to access name and price.
        //   Product otherProduct = (Product) obj; //down-casting
        //how to compare this name and price to whatever passed?
        //    return this.name.equals(otherProduct.name) && this.price== otherProduct.price;
        //   }

        Product product4=product3;
        System.out.println("product4.equals(product3) : " + product4.equals(product3));

        System.out.println("ABC".equals(new String ("ABC")));

    }
}
