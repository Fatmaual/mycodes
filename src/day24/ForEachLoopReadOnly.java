package day24;

public class ForEachLoopReadOnly {
    public static void main(String[] args) {
        int yourFavNumber =300;
        int  myFavNumber = yourFavNumber;
        //then I changec my mind
        myFavNumber=299; //does it affect your fav num?
        System.out.println(yourFavNumber);
        System.out.println("======");//senin fav ile alakali hicbirsey  degismedi benimki action oldu
        long[] nums={10,40,20};
        //arraydeki ilk item nasil degistiririm
   //     nums[0]=nums[0]*2;
        //System.out.println(nums[0]);
        for (int x = 0; x <3 ; x++) {
         nums[x]=nums[x]*2;
        }
        for (int x = 0; x <3 ; x++) {
            System.out.println(nums[x]);
        }

    }
}
