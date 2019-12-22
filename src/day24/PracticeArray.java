package day24;

public class PracticeArray {
    public static void main(String[] args) {
       //first way;
        int[] numbers = new int[7];
        numbers[0]=23;
        numbers[1]=34;
        numbers[2]=30;
        numbers[3]=42;
        numbers[4]=12;
        numbers[5]=124;
        numbers[6]=450;
        //second way;
        int[]numbers2 = new int[]{23,34,30,42,12,124,450};
        int number2uz = numbers2.length;
        int lastItemIndex = number2uz-1;
        int lastItemValue = numbers2[lastItemIndex];
        System.out.println("Number2 nun son degeri : " + lastItemValue);

        //third way;
int[] numbers3 = {23,34,30,42,12,124,450};
int uzOfNum = numbers.length-1;
        for (int x = numbers.length; x>=0 ; x--) {
            System.out.println("numaralarin uzunlugu  "+x+" : "+numbers[x]);


        }




    }
}
