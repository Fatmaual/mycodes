package day15;

public class LoopExamples {
    public static void main(String[] args) {
/**
 * int x = 0;
 * while(x<5){
 * sout("happy new year");
 * ++X;
 * }   // x deki sayiyi yakalayana kadar tekrar ediyor bu formulle!!!
 * */


      int word = 0;
      while(word<5){
          System.out.println("hello world");
          ++word;
      }
      int count = 1;
        System.out.println("hello world");
        ++count;
        System.out.println("hello world");
        ++count;
        System.out.println("hello world");
        ++count;
        System.out.println("hello world");
        ++count;
        System.out.println("count is "+count);
        System.out.println("__________________");
        int cnt =1;
        while(cnt<=5){
            System.out.println("hello dunya");
            System.out.println(" cnt value is "+cnt);
            ++cnt;// eger ++cnt yapmazsan bilg beynini yakarsin cunku nonstop copy yapar!!!
        }




  }

}
