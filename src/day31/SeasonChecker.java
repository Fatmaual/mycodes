package day31;

public class SeasonChecker {
    public static void main(String[] args) {
        // this season asagidaki bodydeki seasonla ayni action halinde degil.
        decideSeasonAction("Fall");
        decideSeasonAction("Spring");
        String Myseason = "AAAAAA";
        decideSeasonAction(Myseason);
        System.out.println("AAAAA");
        System.out.println(Myseason);
    }
//write a static method called decideSeasonAction
//it has one season parameter called season
//inside parantesis means we call parameter,inside body  or open up empty body means between curly braces
//according to what user passed it should print correct action
//eger main ve season curly bracesler bodyler birbirini tanimiyor hatirla soutlardan ama ayni
// bodydekiler birbirleri ile etkilesim halinde
public static void decideSeasonAction(String season){
    switch(season) {
        case"Spring":
            System.out.println("Hiking");
            break;
        case "Summer":
            System.out.println("Swimming");
            break;
        case"Fall":
            System.out.println("Pumpking picking");
            break;
        case"Winter":
            System.out.println("Go Snowboarding");
            break;
        default:
            System.out.println("invalid season");
    }

}

}

