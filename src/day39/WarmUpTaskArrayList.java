package day39;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Arrays;

public class WarmUpTaskArrayList {
    public static void main(String[] args) {

        /**
         * Create an ArrayList of String to store 12 elements.
         * Each element should contains product information separated by comma  :
         * at index 0 -->> iPhone 6s, 499 , 18.71 and so on
         * Task 1 : print only items name
         * Task 2 : print all the prices more than 500
         * Task 3 : print average price
         * Task 4 : print all the items name that has less than 20$ monthly payment.
         * Task 5 : Print the monthly payments of all the iPhone no matter what model.
         * Task 6 : Print all information about most expensive items.
         * Task 7 : Update Dyson price to 80% off (Monthly payment should also be calculated accordingly)
         * Task 8 : Count the items prices more than average price.
         * OPTIONALLY :
         * Task 9 : Remove all the items has more than average price.
         * ------------------------
         * Create 3 more ArrayList objects to separately store
         * itemNames(String), prices(Double) , monthlyPayments(Double)  :
          */
        ArrayList<String> productLst = new ArrayList<>(Arrays.asList("iPone 6S, 499 , 18.71 ",
                "iPhone 6s Plus, 549 ,22.88", "iPhone X,1149,56.16", "MacBookPro, 1499.99, 79.49",
                "ThumbDrive, 39.99, 2.68", "Beats HeadPhones, 349.99, 15.12",
                "Mouse, 79.99, 8.98", "Charger, 39.99, 4.56", "iPad, 429, 18.31", "Dyson Vacuum, 399, 16.25",
                "TV, 2199, 89.49", "Apple Watch, 559, 21.18"));

        System.out.println("product items are: " + productLst);
        System.out.println("product elements count: " + productLst.size());

        //task1:
        //print the items name:
        String itemsDetails = "iPone 6S, 499 , 18.71 ";

        String[] itemSplitArr = itemsDetails.split(",");
        String name = itemSplitArr[0];
        System.out.println("name = " + name);
        double price = Double.parseDouble(itemSplitArr[1]);
        double monthly = Double.parseDouble(itemSplitArr[2]);


        //   System.out.println("price = " + price);
        //   System.out.println("item name: "+itemsDetails.split(",")[0]);
        //   System.out.println("item price: "+itemsDetails.split(",")[1]);
        //   System.out.println("item monthly: "+itemsDetails.split(",")[2]);

        /**
         * so how do I parse the whole thing?
         * I will use for each loop or fori loop there are two ways with the same result;
         * Task 1 : print only items name
         */

        System.out.println("item name: " + itemsDetails.split(",")[0]);
        System.out.println("item price: " + Double.parseDouble(itemsDetails.split(",")[1]));
        System.out.println("item monthly: " + Double.parseDouble(itemsDetails.split(",")[2]));
        System.out.println("=====Task 1====");
        for (String eachProduct : productLst) {
            //we get each product then we split by comma to split into 3 part
            //and get the first part of 3---> NAME!!!!
            String namePart = eachProduct.split(",")[0];
            System.out.println("namePart = " + namePart);
        }
        for (int x = 0; x < productLst.size(); x++) {
            //WE GET EACH PRODUCT BY USING GET METHOD ARRAYLIST IN FOR LOOP
            // and then we split by comma to split into part 3
            // and get first part of 3
            String namePart = productLst.get(x).split(",")[0];
            System.out.println("namePart = " + namePart);

        }
        /**
         * task 2 :
         * print all the prices more than 500
         *   String itemsDetails="iPone 6S, 499 , 18.71 ";
         */
        System.out.println("=====Task 2===");
        for (String eachProduct : productLst) {
            double price2 = Double.parseDouble(eachProduct.split(",")[1]);
            if (price2 > 500) {
                System.out.println("price is: " + price2);
            }
        }
        /**
         * Task 3:
         * print average price
         * we need to reuse for loop right of the above for sum
         */
        System.out.println("===Task 3====");
        double sum = 0;
        double average = 0;
        for (String eachProduct : productLst) {
            double price2 = Double.parseDouble(eachProduct.split(",")[2]);
           sum=sum+price2; //sum+=price;

        }
        average=sum/productLst.size();   //sum/12
        System.out.println("sum is: "+sum);
        System.out.println("average = " + average);

        /**
         *  Task 4 :
         *  print all the items name that has less than 20$ monthly payment.
         */
        System.out.println("====TASK 4====");
        for(String eachProduct:productLst){
         String name1 =eachProduct.split(",")[0];
         double monthly1=Double.parseDouble(eachProduct.split(",")[2]);
         if(monthly<20){
             System.out.println(name1+" : "+monthly1);
         }
     }
        /**Task 5 :
         * Print the monthly payments of all the iPhone no matter what model.
         */
        System.out.println("===TASK 5===");
        for(String eachProduct:productLst) {
            String name1 = eachProduct.split(",")[0];
            double monthly1 = Double.parseDouble(eachProduct.split(",")[2]);
            if (name.contains("iPhone")) {
                System.out.println("print all iPhone " + name1 + " : " + monthly1);
            }
        }
            /**
             * Task 6 :
             * Print all information about most expensive items.
             */
        // above solution will not work
        // because we need the location of max price not the price itself
        //        double maxPrice = Double.parseDouble(productLst.get(0).split(",")[1]);
        //        int maxPriceIndex = 0;
        //
        //        for (int i = 0; i < productLst.size(); i++) {
        //
        //            // this is how we get each price part of items details
        //            String priceStr = productLst.get(i).split(",")[1];
        //            // this is how we turn the priceString into double data type
        //            double price = Double.parseDouble(priceStr);
        //            if (price > maxPrice) {
        //                maxPrice = price;
        //                maxPriceIndex = i;
        //            }
        //        }
        //        System.out.println("maxPriceIndex = " + maxPriceIndex);
        //        System.out.println("maxPrice = " + maxPrice);
        //        System.out.println("expensive item detail = "
        //                + productLst.get(maxPriceIndex));


        System.out.println("\n-----------Task 7 ----------");
        //         * Task 7 : Update Dyson price to 80% off
        //         *          (Monthly payment (24 month) should also be calculated accordingly)
        System.out.println(productLst.contains("Dyson")); // false
        System.out.println(productLst.indexOf("Dyson")); // -1
        //    System.out.println(productLst.startWith("Dyson")); // COMPILER ERROR
        int dysonIndex = 0; // there is only one Dyson
        for (int i = 0; i < productLst.size(); i++) {

            if (productLst.get(i).startsWith("Dyson")) {
                dysonIndex = i;
            }
        }

        System.out.println("dysonIndex = " + dysonIndex);
        String dysonDetails = productLst.get(dysonIndex);
         name = dysonDetails.split(",")[0];
         price = Double.parseDouble(dysonDetails.split(",")[1]);
        monthly = Double.parseDouble(dysonDetails.split(",")[2]);
        dysonDetails = name + "," + price * 0.2 + "," + monthly * 0.2;

        System.out.println("dysonDetails = " + dysonDetails);
        productLst.set(dysonIndex, dysonDetails);
        System.out.println("productLst = " + productLst);


        System.out.println("\n-----------Task 8 ----------");
        //         * Task 8 : Count the items prices more than average price.
        //         * Task 8 : Count the items prices more than average price.
        //         * Task 8 : Count all the items with prices more than average price.
        int cnt = 0;
        for (String eachProduct : productLst) {
          price = Double.parseDouble(eachProduct.split(",")[1]);
            if (price > average) {
                ++cnt;
            }
        }
        System.out.println("all the items with prices more than average price  = " + cnt);

        System.out.println("\n-----------Task 9 ----------");
//       * OPTIONALLY :
//         * Task 9 : Remove all the items has more than average price.
        //         * OPTIONALLY :
        //         * Task 9 : Remove all the items has more than average price.
        //         * Task 9 : Remove all the items with prices more than average price.
        for (int i = 0; i < productLst.size(); i++) {

            price = Double.parseDouble(productLst.get(i).split(",")[1]);
            if (price > average) {

                productLst.remove(i);
                --i;
            }

        }
        System.out.println("productLst count  after removing = " + productLst.size());
        // You may also store all the items with more than average into another list
        // then use remove all method :  productLst.removeAll( newListHere)

        System.out.println("\n-----------Task 3 ArrayList Objects ----------");
//         * ------------------------
//         * Create 3 more ArrayList objects to separately store
//         *  itemNames(String), prices(Double) , monthlyPayments(Double)  :
        ArrayList<String> itemNames=new ArrayList<>();
        ArrayList<Double> prices=new ArrayList<>();
        ArrayList<Double>monthlyPayments= new ArrayList<>();
        String  eachProduct="iPhone 6s, 449,18.71";
        for(String eachProd: productLst){
            //store the name part into ItemName list
            itemNames.add(eachProd.split(",")[0]);
            itemNames.add(name);
            //store the name price into price list
            double pricePart= Double.parseDouble(eachProduct.split(",")[1]);
            prices.add(pricePart);
            //store the name monthly part into monthly payments
            double monthlyPart=Double.parseDouble(eachProd.split(",")[2]);
            monthlyPayments.add(monthlyPart);
        }
        System.out.println("item names "+itemNames);
        System.out.println("prices are: "+prices);
        System.out.println("monthly payment is: "+monthlyPayments);

    }
}