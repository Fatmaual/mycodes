package day56;

import java.util.Arrays;
import java.util.List;

public class StoreTest {
    public static void main(String[] args) {
        Store store1=new Store();
        System.out.println(store1.name);
        System.out.println(store1.allProducts); // the result   will be []
        
        store1.allProducts.add(new Product("iMac",39999));
        System.out.println(store1.allProducts);
        System.out.println("store1 = " + store1);

        List<Product> denisList= Arrays.asList(new Product("cookie",3),
                new Product("tea",3),
                new Product("coffee",7),
                new Product("muffins",4));
        Store store2= new Store("Denis Store ",denisList);

        System.out.println("store2 = " + store2);
        
    }
}
