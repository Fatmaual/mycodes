package denemelerim;

  class Muhendis extends Insan{
  int maas;
  int  zam(){
      maas++;
      return maas;
  }
  void yemek(){
     kilo=kilo+2;
      }


}

public class Insan {
   int boy;
    int kilo;

    void yemek(){
        kilo++;
    }

    public static void main(String[] args) {
        Insan ali =new Insan();
         Muhendis veli= new Muhendis();
         veli.boy=180;
         veli.kilo=67;
         ali.kilo=100;
        System.out.println("muhendis velinin boyu "+veli.boy);
        System.out.println("insan olan alinin kilosu "+ali.kilo);
        veli.yemek();
        System.out.println(veli.kilo);
        veli.maas=10000;
        veli.zam();
        System.out.println(veli.maas);



    }
}
