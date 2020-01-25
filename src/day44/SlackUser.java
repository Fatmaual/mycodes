package day44;

public class SlackUser {
    /**
     * Create a class called SlackUser
     * attributes :
     * 	 name  ,  status (make it protected)
     * behaviours :
     * 	 sendMessage
     * 	 callSomeone
     * 	 addEmoji
     * Creare 1 subClass SlackAdminUser
     * attribute :
     * 	adminId
     * behaviour :
     * 	 sendAtChannelMessage
     * 	 deleteMessage
     * 	 addChannel
     * 	 toString method
     * constructor :
     * 	 3 argument constructor to set all fields value
     */

   protected String name,status;

   //3 tasks

public SlackUser(){

}
    public void sendMassage(){
        System.out.println("SlackUser "+name+" typing");
    }
    public void callSomeone(){
        System.out.println("SlackUser "+name+" typing");

    }
    public void addEmoji(){
        System.out.println("SlackUser "+name+" addiding emoji :) ");

    }
}
