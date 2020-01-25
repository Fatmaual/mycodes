package day43;

import day42.Movie;

public class MovieActions {

    public static void main(String[] args) {
        Movie m1= new Movie("Joker",2.5,"drama");
        //System.out.println(m1);
        Movie m2 = new Movie("Cinderella", 1.5,"family");

     printMovieInformation(m1);
     System.out.println();
     printMovieInformation(m2);
     System.out.println();
     printShorterDurationMovieName(m1,m2);

      Movie result = getJokerMovie();
      System.out.println("name is: "+result.getName());


    }
    public static String createFamilyMovie(String name, double len){
        return null; //->do it by yourself!!!!

    }
    public static String getCombinedMovieInfo(Movie movieObj){
        String combinedResult=""; //-->do it by yourself!!!
        return combinedResult;
    }
    public static Movie getJokerMovie(){
        Movie j =new Movie("Joker",2.5,"Drama");
        return j;
    }

    public static void printMovieInformation(Movie movieObject){
        System.out.print("the movie name: "+ movieObject.getName());
        System.out.print(" is "+movieObject.getLength()+"hour long ");
        System.out.print(" and it genre is: "+movieObject.getGenre());


    }
    public static void printShorterDurationMovieName(Movie movieObj1,Movie movieObj2){
        if(movieObj1.getLength()>movieObj2.getLength()){
            System.out.println(movieObj1.getName());
        }else{

            System.out.println(movieObj2.getName());
        }
    }

}
