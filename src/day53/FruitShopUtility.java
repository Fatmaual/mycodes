package day53;

public class FruitShopUtility {
    public static void main(String[] args) {
        Fruit fruit1= new Apple("crispy","dark red","gala");
        Fruit fruit2=new Orange("sour","orange",12);

        displayFruit(fruit1);
        displayFruit(fruit2);
        displayFruit(new Apple("tasteless","red","golden"));

        System.out.println("-------------------");
        digestBetter(new Orange("sweet","yellowish",1));
        digestBetter(fruit2);
    //    myFavoriteFruit();
        System.out.println("----get my favorite fruit call ----");
      Fruit x=getMyFavoriteFruit();
       x.getDigest();
        System.out.println("B15 favorite fruit "+ x);

        System.out.println("====get favorite by type====");
        System.out.println("getFavoriteByType: "+getFavoriteByType(1));
        System.out.println("getFavoriteByType: "+getFavoriteByType(2));
        System.out.println("getFavoriteByType: "+getFavoriteByType(3));



    }
     public static void digestBetter(Fruit anyFruit){
        anyFruit.getDigest();
        anyFruit.getDigest();
        anyFruit.getDigest();
        anyFruit.getDigest();
        System.out.println("anyFruit = " + anyFruit);

     }
    public static void displayFruit(Fruit herhangimeyve){
      System.out.println("displaying my super fruit \n" + herhangimeyve.toString());
    }

  public static Fruit getMyFavoriteFruit(){
      //  Fruit fruit=new Orange("crispy","green",100);
        Fruit fruit=new Apple("yummy","blue","Ginger");
        //return fruit;
      //new Orange("crispy","green",100);
      return new Apple("yummy","blue","Ginger");
  }
   public static Fruit getFavoriteByType(int type){
        if(type==1){
            return new Apple("crispy","dark red","gala");
        }else if(type==2){
            return new Orange("sour","orange",12);
        }else{
            return null;
        }
   }
}
//public static void digestBetter(Fruit sindirim){
//   System.out.println("I have no idea yet how it will affect the result the static method");
//}
//public static void myFavoriteFruit(){
//      System.out.println("galiba anlamaya basladim bu ornekde what the instructor wanna show us");
//}