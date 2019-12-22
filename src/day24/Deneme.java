package day24;

public class Deneme {
    public static void main(String[] args) {
        String[] tvShows = {"ellen","jimmy kimmel", "jimmy falcon","beyaz"};
        int tvshowsCount = tvShows.length;
        System.out.println("tv show array count : " + tvshowsCount);
        for (int x = 0; x<tvshowsCount ; x++) {
            System.out.println("tv shows :" + tvShows[x]);
            String eachShow = tvShows[x];
System.out.println(eachShow+ " has character count :"+ eachShow.length());

        }


    }
}
