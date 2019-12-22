package day07;

public class Casting {
    public static void main(String[] args) {
    //int num = 10;

    //int 10 otomatik olarak double yani bigNum gitti
    double bigNum = 10;
    System.out.println(bigNum);

    //12.99 tam sayi olmadigi icin asagidaki gibi yazamayiz.double yazmamiz lazim.
    // int num = 12.99;
        int num =(int) 12.99;
        System.out.println();
        //create a long variable and store it
        //create an int variable and try to store above lang value
        long cup = 120044l;
        int cup2 = (int) cup;
        //int x =12.99; ayni zamanda x ciktisini alinca 12 oluyor cunku int cikisi yaptik
        int x =(int) 12.99;
        System.out.println(x);

        long earthToMoon = 100000;
        int earthToMoon_int = (int) earthToMoon;
        System.out.println(earthToMoon_int);














    }
}
