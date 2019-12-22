package day10;

public class SeasonAction {
    public static void main(String[] args) {
        //what do you do in each season
  //spring -->> hike!Easter Nawruz Blossom
  //summer-->> swim vacation BBQ holiday
  //fall -->> Black Friday Hiking Harvest Halloween Shopping
  //winter -->> snowboarding ski Christmas New Year
        String season = "FALL";
        switch(season) {
            case "spring":
                System.out.println("hike!Easter Navruz Blossom");
                break;
            case "summer":
                System.out.println("swim vacation BBQ holiday");
                break;
            case "fall":
                System.out.println("Black Friday Hiking Harvest Halloween Shopping");
                break;
            case "winter":
                System.out.println("snowboarding ski Christmas New Year");
                break;
            default:
                System.out.println("you have selected unknown item");
                season ="unknown";
                break;
        }

    }
}
