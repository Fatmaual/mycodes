package day56;

public class Product extends Object{

    private String name;
    private int price;
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
    //this is equal method!objectden extend yaptigi icin kesinlikle oyni signature"object"olmasi lazim.eger boolean
    // equals deseydim(Product otherProduct) deseydim override yapmazdim sadece baska bir method olustururdum.

    public boolean equals(Object obj){

        Product otherProduct=(Product)obj; //how to compare this name and price to whatever user passed
       return this.name.equals(otherProduct.name)
               && this.price==otherProduct.price;
    }

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}