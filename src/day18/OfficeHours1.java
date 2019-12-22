package day18;

public class OfficeHours1 {
    public static void main(String[] args) {
            // 012345678901234567890123456
String item = "Echo Dot (3rd Gen) Charcoal";
// plain English think logic -- once index of dusun use them for substring to get the text
 //kacinci generation oldugunu bulacagim simdi ;
        System.out.println(item.substring(9,18));
        System.out.println(item.substring(10,17));//eger sadece parenthesis icindekini gormek istiyorsam
        int indexOfOpeningParenthesis = item.indexOf("(");
        int indexOfEndingParenthesis = item.indexOf(")");
        String wordInsideParenthesis =
                item.substring(indexOfOpeningParenthesis+1,indexOfEndingParenthesis);
        System.out.println("wordInsideParenthesis = " + wordInsideParenthesis);// +1 dedik cunku demeseydik parenthesis verecekti
String letters = "J%a^V*******$a";
        System.out.println("letters  before = " + letters);
//ne yapmak istiyorsan buraya yaz  like--> remove %^*$
letters = letters.replace("%%","")
          .replace("^","")
          .replace("*","")
          .replace("$","").toUpperCase() ;
          System.out.println("letters = " + letters);

    }
}
