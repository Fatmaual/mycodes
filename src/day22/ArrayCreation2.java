package day22;

public class ArrayCreation2 {
    public static void main(String[] args) {
        int num;
        num = 10;

        int [] ages;
        ages = new int []{3,5,7,11,33,57,18};

        int itemCount = ages.length;
        System.out.println("itemCount = " + itemCount);
        for (int x = 0; x <itemCount ; x++) {
            System.out.print(ages[x]+" ");
        }
        int[] areaCode = {703,300,954,665}; //bu formul ancak busekil calisir baska yolla olmaz int[] areacode
                                          // alt line gecip devam edemzsin hepsi bir sirada olmasi lazim
        for (int x = 0; x <areaCode.length ; x++) {
            System.out.println(areaCode[x]+ " ");


        }

    }
}
