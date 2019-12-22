package day27;

public class ArraysTask {
    public static void main(String[] args) {
        //find minimum number with array
        int[]scores ={100,-99,-10000,2000,5000,0,1,2000};
        int min=99999999;
        for (int i = 0; i <scores.length; i++) {
            if(min>scores[i]){
                min=scores[i];
            }
        }
        System.out.println("minimum number is : "+min);
        int secondMin= scores[0];
        for (int i = 0; i <scores.length ; i++) {
            if(scores[i]==min){
                continue;
            }
            if(secondMin>scores[i] &&scores[i]!=min){
                secondMin=scores[i];
            }
        }
        System.out.println("second minimum number is :"+secondMin);
        int thirdMin =scores[0];
        for (int i = 0; i < scores.length; i++) {
            if(scores[i]==min || scores[i]==secondMin){
                continue;

            }
            if(thirdMin>scores[i] && scores[i]!=min  && scores[i]!=secondMin){
                thirdMin=scores[i];
            }
        }
        System.out.println("third minimum number is : "+thirdMin);

    }
}
