package day11;

public class LogicalOperator_2 {
    public static void main(String[] args) {
        int score = 5;
        //System.out.println( score< 0 || score >100); OR diye bir soru olursa || koyuyorsun!
        // between nasil yazarim score 70 den buyukse AND (&&) 100 den kucukse
        if(score < 0 || score> 100){
            System.out.println("invalid score");
        }else if ( score == 100){
            System.out.println("perfect score");
        }else if (70<score && score <100){
            System.out.println("you have passed");
        }else if(score>20 ){
            System.out.println("come to my office");
        }else if( score<30 && score>40){
            System.out.println("attend additional classes");
        }else if(score<40 && score>70){
            System.out.println("little bit more study will let you pass");
        }else{
            System.out.println("you have failed!!!");
        }

    }
}
