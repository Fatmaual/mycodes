package daysOfOfficeHours;

class muhendis extends Insan{
    int maas;

 public  muhendis(){
    this(7000);
 }
 public muhendis(int maas){
     if(maas>1000){
         this.maas=maas;
     }else{
         this.maas=7000;
     }

 }
 public muhendis(int maas, int boy, int kilo){
     super(boy, kilo);
 }

    int zam(){
        maas++;
        return maas;
    }

    int zam(int zamMiktari){
        maas+=zamMiktari;
        return maas;
    }
    int zam(double zamOrani){
        maas*=zamOrani;
        return maas;
    }
    @Override
    void yemek(){
        kilo=kilo+2;
    }
    void yemek(int kilo ){
        this.kilo+=kilo;
    }
}

  public class Insan {
    int kilo,boy;

public  Insan(){

}

public Insan(int boy, int kilo){
    if(boy>0 && kilo>0){
        this.boy=boy;
        this.kilo=kilo;
    }
    System.out.println("yeni bir insan olusturuldu");
}
    void yemek(){
        kilo++;
    }
    public static void main(String[] args) {
  Insan ali= new Insan();
        muhendis ayse=new muhendis(20000,180,60);
  ayse.boy=170;
  System.out.println("muhendis classdaki aysenin boyu: "+ayse.boy);

  ayse.kilo=69;
  ayse.yemek();
   System.out.println("muhendis classdaki aysenin kilosu: "+ayse.kilo);

   //ayse.maas=10000;
  // ayse.zam(2000);
   System.out.println("muhendis classdaki aysenin maasi: "+ayse.maas);
   ayse.zam(1.5);
        System.out.println(ayse.maas);







    }
}

