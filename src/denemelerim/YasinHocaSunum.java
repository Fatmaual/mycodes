package denemelerim;

public class YasinHocaSunum {
    public static int YasinHoca(int c,int d){
        int resultminus=c-d;
        return resultminus;
    }
    public static int  Cigdem(double a, double b){
       double resultadd=a+b;
       int qwert=(int)resultadd;
        return qwert;
    }
    public static void main(String[] args) {
        System.out.println(Cigdem(6,7));
        System.out.println(YasinHoca(5,4));

    }
}
