package day43;

public class Coffee {
    private String type;
    private int caffeineLevel;
    private double price;


    public Coffee(){
        System.out.println("no arg constructor has being called with this method");
    }

    public Coffee(String type,int caffeineLevel){
        this.type=type;
        this.caffeineLevel=caffeineLevel;
        System.out.println("2 args constructors has been called with this method");
    }

    public String getType(){
        return type;
    }
   public void setType(String type){
        this.type=type;
   }
   public int getCaffeineLevel(){
        return caffeineLevel;
   }
   public void setCaffeineLevel(int caffeineLevel){
        this.caffeineLevel=caffeineLevel;
   }
   public double getPrice(){
        return price;
   }
   public void setPrice(double price){
       this.price=price;
       if(price>0){
          this.price=price;
        }else{
           this.price=1;
        }
   }
   public Coffee (String type, int caffeineLevel,double price){
        this.type=type;
        //only set the value if the price is valid
        this.caffeineLevel=caffeineLevel;
       // if(price>0){
         //   this.price=price;

      //  }else{
        //    this.price=1;
      //  }
       setPrice(price);
   }

    public String toString() {
        return "Coffee{" +
                "type='" + type + '\'' +
                ", caffeineLevel=" + caffeineLevel +
                ", price=" + price +
                '}';
    }

}
