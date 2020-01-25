package day41;

public class ProductDemo {
    public static void main(String[] args) {
        Product person1 =new Product();
        person1.setName("iPhone");
       // person1.setPrice(699);
        System.out.println("person1.getName() = "+person1.getName());
        //I want to store the price
        double myPrice=person1.getPrice();
        System.out.println("myPrice = " + myPrice);


    }
}
