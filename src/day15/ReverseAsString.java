package day15;

public class ReverseAsString {
    public static void main(String []args ){
        String name = "Akbar";
        System.out.println(name.charAt(0)+""+ name.charAt(1)+""+ name.charAt(2)+""+name.charAt(3)+""+name.charAt(4)  );
        System.out.println(name.charAt(4)+""+ name.charAt(3)+""+ name.charAt(2)+""+name.charAt(1)+""+name.charAt(0)  );

        int characterCount =name.length();// nameLength equal to = name.Length
        int lastCharIndex = characterCount-1 ; //karakter index start with 0 count start with 1 !!!!!!!!!!!!!
        char lastChar = name.charAt(lastCharIndex);
        System.out.println("lastChar is " + lastChar);
        System.out.println("lastChar in on shot " + name.charAt(name.length() -1));

    }
}
