package day23;

public class StringArray {
public static void main(String[] args) {
    String[] shows ={"Orville", "Gifted","Game Of Throne","Flash","Arrow","Super girl"};
    int showsCount =shows.length;
    System.out.println("shows count = " + showsCount);
    for (int x = 0; x <showsCount ; x++) {//if tum hepsini yazilimini gormek istersen string seklinde bu formul
      String currentShow = shows[x];
        System.out.println(currentShow+" has character count "+currentShow.length());

    }



    }
}
