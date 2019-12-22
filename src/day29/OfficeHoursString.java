package day29;

public class OfficeHoursString {
    public static void main(String[] args) {
        String book ="learn java in 1 day, java is fun";
        //let's find j's index!!
        System.out.println("first index of j: "+book.indexOf("j"));// it will be return number of index
        System.out.println("last index of j: "+book.lastIndexOf("j"));
        //return learn uppercase
        System.out.println(book.replace("j","baya"));
        System.out.println("learn".toLowerCase().toUpperCase()+" "+book);




    }
}
