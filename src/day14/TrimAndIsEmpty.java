package day14;

import jdk.swing.interop.SwingInterOpUtils;

public class TrimAndIsEmpty {
    public static void main(String[] args) {
        String message = "     REPL IS COMING   !  ";
        System.out.println(message);
        System.out.println("message character count is "+message.length() );

        message = message.trim();
        //System.out.println( message.trim() );
        System.out.println("message character count is "+ message.length() );// trim is cok kullanisli cunku butun fazla
                                                                     //karakterleri ama kesinlikle metinin icinde olanlari
                                                                  //degil basinda ve sonundakileri atiyor garbage storage!!
        System.out.println(message.isEmpty()  );
        
    }
}
