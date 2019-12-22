package day20;

public class WorkingMoreCharacter {
    public static void main(String[] args) {
        //string ismi ver even number character count
        //print 2 charachter in one line
       // for example gokyuzum
       int lastcharIndex;
       String name = "Gokyuzum";

       int charCount = name.length();// i ||||  x=charCount-2 or x<=lastCharIndex
        System.out.println(name.substring(0,2));
        System.out.println(name.substring(4,6));
        System.out.println(name.substring(6,8));
        //int x = 0;
        //System.out.println(name.substring(x,x+2));
        //x= x +2;
        //System.out.println(name.substring(x,x+2));
        //x=x+2;
        //System.out.println(name.substring(x,x+2));
        //x=x+2;
        //System.out.println(name.substring(x,x+2));
        for (int x = 0;  x<=charCount-2 ; x+=2) {
            System.out.println(name.substring(x, x+2));;

            //stringde olan bir harfin var olup olmadigini bulmak icin oncelikle dusun
            //sonra herbir karaktere bak equal upper case or lower case if so print index ile!!
            //bunu yaparken ingilizce dusun cunku else iff olarak yazacaksin!!
            //mesela a yada A icin ne yapacagiz equal.ignoreCase!!
            //if there is then print it will print the index if not move on
            //each karakter icin substring (0,1) olarak yaziyorsun sonra FOR LOOP geciyorsun!!!
            // last character index gelince stop!


        }
    }
}
