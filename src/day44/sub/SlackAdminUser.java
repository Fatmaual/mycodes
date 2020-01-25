package day44.sub;

import day44.SlackUser;

public class SlackAdminUser extends SlackUser {
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

  int adminID;

public SlackAdminUser(String name, String status, int adminID){
   this.adminID=adminID;
   this.name=name;
   this.status=status;
}

  public static void main(String[] args) {

  SlackAdminUser user1= new SlackAdminUser("Akbar","Release your horse",101);
  //inheritage methods we are calling
  user1.sendMassage();
  user1.callSomeone();
  user1.addEmoji();

  //we are calling
    user1.addChannel();
    user1.deleteMessage();
    user1.sendAtChannelMessage();

  }

  public String toString() {
    return "SlackAdminUser{" +
            "adminID=" + adminID +
            ", name='" + name + '\'' +
            ", status='" + status + '\'' +
            '}';
  }

  public void sendAtChannelMessage(){
    System.out.println(name+" sending channel message ");

  }
  public void deleteMessage(){
    System.out.println(name+ " deleting message");
  }
  public void addChannel(){
    System.out.println(name+" addiding new channels");

  }
}
