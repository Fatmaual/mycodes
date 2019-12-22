package day11;

public class WakeUpWithSwitch {
    public static void main(String[] args) {

        //KURAL: ONCE VARIABLE NE ONA KARAR veiyorsun. int mi string mi! 2- switch yaziyorsun belirledigin varibale
        // case neydi string ozaman case ""koyman lazim kurala dikkat et, bR cunku string eger int olsaydi case 1 :
        //case "br" : sout ne yazmakmistiyorsan yaz (olusturmak istedigin metin) ne yapmak istedigini
        // sonunda break unutma her statement sonunda ve default ile bitir!
        //

        String targetOption = "lR" ;

        switch(targetOption) {
            case "bR":
                System.out.println("you have turned on bed room light");
                break;
            case "lR" :
                System.out.println("you have turned on living room light");
                break;
            case "kI":
                System.out.println("you have turned on kitchen light");
                break;
            default:
                System.out.println(" wrong option");
                break;



        }
    }
}
