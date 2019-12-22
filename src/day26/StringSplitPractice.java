package day26;

public class StringSplitPractice {
    public static void main(String[] args) {
        String students = "Abbos,Zulyar,Zhibek,Hasan,Muge,Orhan,Susan" ;
        //spell the names in this format-->A-b-o-s
        String[] namesArray = students.split(" ");
        for (int x = 0; x <students.length() ; x++) {
            String allnames= namesArray[x];
            char[] allNameChars = allnames.toCharArray();
            for (int i = 0; i <allNameChars.length ; i++) {
                System.out.println(allNameChars[i]+ "-");

            }


        }

    }
}
