package InterviewQuestions;

public class FindUnique {
    public static void main(String[] args) {
        //find the unique characters
        //use the return method
  String unique= findUnique("ccgvvvussneeedjjjay");
        System.out.println(unique);

    }
    public static String findUnique(String word){
        String[] arr=word.split("");
        String unique="";
        for (int x = 0; x <arr.length ; x++) {
          int num=0;
            for (int i = 0; i <arr.length ; i++) {
                if(arr[i].equals(arr[x]))
                    num++;
                }
            if(num==1)
                unique+=arr[x] ;

                }
                 return unique;
            }

        }



