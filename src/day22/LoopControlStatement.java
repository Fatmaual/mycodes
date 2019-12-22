package day22;

public class LoopControlStatement {
    public static void main(String[] args) {
        //bu kelimenin hepsini yaz ve skip every each of the letter
        //ayrica
      //  String msg = "I struggle with Java I like Java I love Java Everything is Awesome! ";
     //   for (int i = 0; i <msg.length()-1 ; i++) {
      //    if(i%2==0){
      //        continue;
      //    }
      //      System.out.print(i+",");
     //   }

           // System.out.print(idx + " : "+msg.substring(idx,idx+1));
       // }
        //Task2:
       // for (int idx = 0; idx <charCount ; idx++) {
        String msg = "I struggle with Java I like Java I love Java Everything is Awesome! ";
        int charNum =msg.length();
        for (int x = 0; x <charNum; x++) {
            if(x%2==0){
                continue;

            }
            System.out.print(x +",");
        }
        //Task 2:

        for (int i = 0; i <charNum ; i++) {
            String currentCharacter = msg.substring(i,i+1);
            if(currentCharacter.equalsIgnoreCase("j")){
                break;

            }
            System.out.println("currentCharacter = "+currentCharacter); //i yazsaydim bana numara verecekti oyuzden
            //current character yazdim dikkat et cunku onu stringde inayladim!
        }


        }
    }

