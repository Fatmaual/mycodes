package day28;


import java.util.Scanner;

public class Reply88 {
    public static void main(String[] args) {
//indexof da bir string belirli bir indexden sonra search edebilirsiniz hello l,2 l,3 dersen nasil return
//yapacak ortada olan karakteri nasil bulacagiz index of ile olabilir, verilen linkde birseyi kesip cikarmak
//icin substring.
     Scanner scan =new Scanner(System.in);
     int countOfCats =0;
     int countOfDogs=0;
     String word =scan.next();
        String wordForDogs = word;
        while(word.contains("cat")){
            word=word.substring(word.indexOf("cat")+3);
            countOfCats++;
        }
        while(wordForDogs.contains("dog")){
            wordForDogs=wordForDogs.substring(wordForDogs.indexOf("dog")+3);
            countOfDogs++;
        }
        if(countOfCats==countOfDogs){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
      }
    }

