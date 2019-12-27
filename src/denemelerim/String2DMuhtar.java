package denemelerim;

import java.util.Arrays;

public class String2DMuhtar {
    public static void main(String[] args) {
  String[] sarilar={"bekir","sadiye","gunday","mustafa","yasemin","Fatma"};
  String[] doganlar={"Tarik","yasemin","ahmed burak","mert"};
  String[]ulusallar={"hikmet kerem","esad","cevdet","fatma","nimet"};
  String[][]ailem={sarilar,doganlar,ulusallar};
String shortes = ailem[0][0];
  int minimum =ailem[0][0].length();
        for (int i = 0; i <ailem.length ; i++) {
            for (int j = 0; j < ailem[i].length; j++) {
                if (minimum > ailem[i][j].length()) {
                    minimum = ailem[i][j].length();
                    shortes = ailem[i][j];
                }

            }
        }
        System.out.println("minimum = " + minimum);
        System.out.println(shortes);
        int[][][] arr3d={{{1,2,3},{4,5,6}},{{7,8,9},{10,11,12}}};
        System.out.println(Arrays.deepToString(arr3d));
    }
}