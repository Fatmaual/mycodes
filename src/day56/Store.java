package day56;

import java.util.ArrayList;
import java.util.List;

public class Store {
    String name;
    List<Product> allProducts;// if we do private to this variable it will be blow out
    //lots of items

    /**
     * Bu ornek cokiyi oldu cunku constructor ilk once hic deger vermedi this ile tanimladi
     */
    public Store(){
        this.name="Cybertek Store";
        this.allProducts=new ArrayList<>();
        /**
         * new List<Product> that contains only Products with price more than average
         *
         * @return new List<Product> that contains only Products with price more than average
         */
    }
    public Product getMostExpensiveProduct(){
      //  int max= allProducts.get(0).getPrice();
      //  for(Product each: allProducts) {
         //   if (each.getPrice() == maxPrice) {
        //        return each;
       //     }
     //   }
    //    return null;


    //    int max=Integer.MIN_VALUE;
      //  int indexMax= -1;
       // for (int x = 0; x <allProducts.size() ; x++) {
         //   if(allProducts.get(x).getPrice()>max){
           //     max= allProducts.get(x).getPrice();
             //   indexMax=x;
           // }
      //  }
       // System.out.println("max = " + max);
        //return allProducts.get(indexMax);
        Product maxProduct =null; //assume it's null before we actually find what we are looking for
        int max=Integer.MIN_VALUE;
        for(Product each :allProducts){
            if(each.getPrice()>max){
                max=each.getPrice();
                maxProduct=each;
            }
        }
        return maxProduct;
    }
    public double getAveragePrice(){
        return findSumAllProductPrice()/allProducts.size();
    }
    public int findSumAllProductPrice(){
        int sum=0;
        for(Product each: allProducts){
            sum+=each.getPrice();
        }
        return sum;
    }
    public void removeProduct(Product p){
        if(checkIfProductExists(p)==true){
            allProducts.remove(p);
        }else{
            System.out.println("we don't have "+p);
        }

    }
    public int indexOfProduct(Product p){
        return allProducts.indexOf(p);
    }
    public boolean checkIfProductExists(Product p){
        return allProducts.contains(p);
    }
    public void displayProducts(){
        System.out.println(name+ " 's Store has below product: ");
        for(Product each: allProducts){
            System.out.println("\t each: "+each);
        }
    }
    public int getProductCount(){
        return allProducts.size();
    }
    public void addProduct(Product p){
        System.out.println("calling addProduct (Product p)");
        allProducts.add(p);
    }
    public void addProduct(String productName, int productPrice){
        Product newP=new Product(productName,productPrice);
        allProducts.add(newP);
    }
    public Store(String name, List<Product>otherList){
        this();
        this.name=name;
        allProducts.addAll(otherList);

    }

    @Override
    public String toString() {
        return "Store{" +
                "name='" + name + '\'' +
                ",\n allProducts=" + allProducts + // \n ekledi diger satira gecti
                '}';
    }
}
