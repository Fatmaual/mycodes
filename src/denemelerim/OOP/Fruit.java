package denemelerim.OOP;
class Orange extends Fruit{
    int vitaminC;
    public Orange(String taste, String color,  int vitaminC){
 super(taste, color);
 this.vitaminC=vitaminC;
    }
    public void digested(){
        System.out.println("if you an orange the taste is "+taste+" the color is: "+color+" , and the vitamin level is: "+vitaminC);

    }

    @Override
    public String toString() {
        return "Orange{" +
                "vitaminC=" + vitaminC +
                ", taste='" + taste + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
 class Apple extends Fruit{
     String type;

     public Apple(String taste, String color,String type){
         super(taste,color);
         this.type=type;

     }
    public void digested(){
        System.out.println("eating this "+type+" "+color+" apple, the taste is "+taste);
    }
       public String toString(){
         return "Apple { "+ "type: '"+type +'\''+" , taste: '"+taste+'\''+" , color: "+color+'\''+'}';
       }
}
public abstract class Fruit {
    String taste,color;
    public Fruit(String taste, String color){
        this.taste=taste;
        this.color=color;
    }
    public abstract void digested();
}
class Main{
    public static void main(String[] args) {
        Apple apple1= new Apple("sweet","red","fuji");
        Fruit fruit= apple1;
        Fruit fruit1= new Apple("little sour","green","golden");
        Fruit fruit2=new Orange("sour but sweet","orange",100);
        Fruit fruit3=new Orange ("sweetish","blue",190);
        Fruit fruit4=new Apple("sweet","yellow","kutur");

        fruit.digested();
        fruit=new Orange("sour","green",12);
        fruit.digested();
        fruit=new Apple("sweet","blabla","kuturkutur");
        fruit.digested();
        System.out.println(fruit.toString());

        digestbetter(fruit2);
        digestbetter(new Orange("sour but sweet","orange",100));
        System.out.println("-------get my fav-----");
        Fruit herhangifruit= getmyfuit();
        System.out.println(herhangifruit);



    }
    public static void display(Fruit anyFruit ){
        System.out.println("Displaying fruit \n"+anyFruit.toString());

    }
    public static void digestbetter(Fruit anyFuit){
        anyFuit.digested();
        anyFuit.digested();
        anyFuit.digested();
        anyFuit.digested();
        System.out.println("anyFuit = " + anyFuit);
    }
    public static Fruit getmyfuit(){
        Fruit f= new Apple("little sour","green","golden");
        return f;
    }

}
