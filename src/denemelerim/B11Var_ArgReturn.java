package denemelerim;

public class B11Var_ArgReturn {
    public static void main(String[] args) {
        getTheSum(new int []{1,3,2,6,7,8});

    }
   public static void getTheSum(int [] nums){
        int sum=0;
        for(int eachNum: nums){
            sum+=eachNum;
        }
       System.out.println("sum is : "+sum);
   }
}
