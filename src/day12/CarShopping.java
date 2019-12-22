package day12;

public class CarShopping {
    public static void main(String[] args) {
        // buy corolla or tesla (only if it's in the budget)
        // ilk if de dikkat et carbrand tesla ve && ayni parantezin icinde!

      //  if(carBrand.equals("corolla") || carBrand.equals("tesla") && carPrice <= budget){
            //System.out.println("car aquired!!");
      //  }else{
           // System.out.println("not what I am Looking for");
       //}
        //
        String carBrand = "tesla";
        int carPrice = 60000;
        int budget = 60000;

        if(carBrand.equals("corolla")){
            System.out.println("corolla  aquired!!");
        }else if(carBrand.equals("tesla") && carPrice <= budget){
            System.out.println("tesla car aquired");
        }else{
            System.out.println("not what I am Looking for");
        }


    }
}
//don't repeat yourself (DRY ) yukarida oldugu gibi