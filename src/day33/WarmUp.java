package day33;

public class WarmUp {
    public static void main(String[] args) {
      String getSpelledName=getSpelledName("Serra");
        System.out.println("getSpelledName = " + getSpelledName);
        System.out.println( getSpelledName("Zeynep"));
        System.out.println(getsecondWaySpelling("Mustafa"));

    }
    public static String getSpelledName(String name){
      String result ="";
        for (int x = 0;  x<name.length() ; x++) {
            result=result+name.charAt(x);
            if(x!=name.length()-1){
                result=result+"-";
            }
        }
        return result;
    }
    public static String getsecondWaySpelling(String word){
     String  result = "";
        for (int i = 0; i <word.length()-1 ; i++) {
            result+=word.charAt(i)+"-";
            }
        //your CODES GOES HERE!!
        return result+word.charAt(word.length()-1);

        }
    }


