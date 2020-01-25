package day42;

public class Movie {
    String name;
    double length;
    String genre;

    /**
     * what is default constructor?
     * a constructor that give by compiler only if you don't
     * have any constructor in your class it's invisible
     * and it has no parameter it has no code inside
     */
    //create a constructor fields
    public Movie(){
        System.out.println("empty movie");
    }
    //write a constructor to set all the fields value
    public Movie(String name, double length, String genre){
        this.name=name;
        this.length=length;
        this.genre=genre;
    }
public String getName(){
        return name;

}
public double getLength(){
        return length;
}
public String getGenre(){
        return genre;
}

    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", genre='" + genre + '\'' +
                '}';
    }
}
