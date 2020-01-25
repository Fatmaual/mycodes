package daysOfMuhtar;

public class Deneme {
    static int a;
    int b;
    long total = 100;

    public Deneme(){
        total -= 50;
    }
    public Deneme(int total){
        this();
        this.total +=total;

    }
    {
        total *=2;
    }
    static{
        int total =200;
        total/=2;
    }

    public static void main(String[] args) {
        Deneme obj=new Deneme(25);
        System.out.println(obj.total);
    }
}
