package day26;

import java.util.Arrays;

public class AkbarinYaptigi {
    public static void main(String[] args) {
        String students = "Abbos,Zulyar, Zhibek,Hasan,Muge,Orhan, Susan" ;
        students = students.replace(" ","");
        String[] nameArrays =students.split(",");
        System.out.println(Arrays.toString(nameArrays));
        System.out.println("length of students are : " + nameArrays.length);
        int studentCount = nameArrays.length;
        for (int x = 0; x <studentCount ; x++) {
            String name = nameArrays[x];
            System.out.println("spelling "+name+" is:");
            for (int y = 0; y <name.length() ; y++) {
                System.out.print(name.charAt(y)+"-");
            }
            System.out.println();
        }
        System.out.println();
        String name0 =nameArrays[0];
        for (int i = 0; i <name0.length() ; i++) {
            System.out.print(name0.charAt(i)+"-");
        }
        System.out.println();
        String name1 =nameArrays[1];
        for (int i = 0; i <name1.length() ; i++){
            System.out.print(name1.charAt(i)+"-");
        }
        System.out.println();
        String name2 =nameArrays[2];
        for (int i = 0; i <name2.length() ; i++){
            System.out.print(name2.charAt(i)+"-");
        }
    }
}
