package day54.InterfaceOOPClothes;

public class Utility {
    public static void main(String[] args) {

   Wearable w1= new Clothes();
   Wearable w2=new Watch();
   Wearable w3=new MakeUps();
   Wearable w4 =new Perfume();
  wearMy(w1);
  wearMy(w2);
  wearMy(w3);
  wearMy(w4);

  wearMy(new Watch());

  Wearable result= getMyWearable();
        System.out.println("result = " + result);//hashcodeee
        System.out.println(result.getClass().getSimpleName());



    }
    public static void wearMy(Wearable any){
   any.wear();

    }
    public static Wearable getMyWearable(){
    //    Wearable w =new Clothes();
      //  return w;
       // return new Clothes();
        //return new Perfume();
        //return new Watch();
        return new MakeUps();
    }
}
