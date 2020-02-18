package day56;

import java.util.Arrays;
import java.util.List;

public class StoreTest2 {
    public static void main(String[] args) {
        List<Product> denisList= Arrays.asList(new Product("cookie",3),
                new Product("tea",3),
                new Product("coffee",7),
                new Product("muffins",4));
        Store store2= new Store("Denis Store ",denisList);
        System.out.println("store2 = " + store2);

        Product product1=new Product("cheeseCake",10);
        store2.addProduct(product1);
        System.out.println("store2 = " + store2);
        store2.addProduct("Latte",5);
        System.out.println("store2 = " + store2);

        System.out.println("store2.getProductCount(): "+store2.getProductCount());

        store2.displayProducts();

        System.out.println("do we have cheesecake with price 10$: "+store2.checkIfProductExists(product1));

        System.out.println("where is cheesecake with price "+store2.indexOfProduct(product1) );

        store2.removeProduct(product1);


    }
}
