package day15;

public class SubString2 {
    public static void main(String[] args) {
        String message = "I love Pumpkin , Pumpkin IS FUN!";
        message.replace("Pumpkin","Java");
        message= message.replace("Pumpkin","JAVA");
        System.out.println(message);
        String message2 = "Happy Thanks Giving to All!!";
        message2 = message2.replace("Thanks Giving", "Thanksgiving");
        System.out.println( message2);
        message2 = message2.replace("!!","!");
        System.out.println("message2 = " +message2);
        //remove all the space
        message2 = message2.replace(" ","");
        String name3 = "Tomorrow is off no!"; // hpw we can remove no
        name3 = name3.replace("no","");
        System.out.println(name3);

    }
}
