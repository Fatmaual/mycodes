package day27;

public class demen {
    public static void main(String[] args) {

        int[]arr1D={20,222,113};
        for(int each :arr1D){
            System.out.print(each+" ");

        }
        System.out.println("\n -------");
        int[][]arr2D={{10,20,30},{40,50,60,70,80,90,100}};
        for(int[]ach1DArray :arr2D){
            for(int eachelement:ach1DArray){
                System.out.print(eachelement+" ");
            }


        }
    }
}
