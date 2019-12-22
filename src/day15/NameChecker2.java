package day15;

public class NameChecker2 {
    public static void main(String[] args) {
        String name = "Arya Stark";
        System.out.println( "name.contains( \"st\") resut is: "+name.contains("st")  ); //it gives false bc of sensitive for every  character
        String uppercaseName = name.toUpperCase(); //name is contains acilimi ile dusunrsen more make sense
        System.out.println("Uppercase name contains ST or no? "+uppercaseName.contains("ST"));
        String lowercaseName =name.toLowerCase();
        System.out.println("lowercase name contains or not? "+lowercaseName.contains("st"));
        System.out.println(name.toLowerCase().contains("st")); ////primitive does not has any action!!!!
        //yukari enson ornek olur cunku hepsi string ama name.length olsaydi int olurdu olmazdi!!

    }
}
