package day29;

public class AnotherwayWithString3 {
    public static void main(String[] args) {
        String hero1 = "Superman-Clark J Kent";
        String[] heroSplitted =hero1.split("-");
       String heroAdi = heroSplitted[0];//superman
       String fullName= heroSplitted[1];//clark j kent
        String stars =" ";
        for (int i = 0; i < heroSplitted[1].length(); i++) {
            stars =stars +"*";
        }
        System.out.println(stars);
       String heroX = hero1.replace(heroSplitted[1],stars); //superman- **********
       // System.out.println(hero1);--> Superman-Clark J kent
       // System.out.println(heroX);
       // System.out.println("hero 1 "+hero1);
       // System.out.println("herox : "+ heroX);
    }
}
