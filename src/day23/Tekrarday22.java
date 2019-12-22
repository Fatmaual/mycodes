package day23;

public class Tekrarday22 {
    public static void main(String[] args) {
       String[] friends = {"esra","cigdem","tuba","fehime","hafize"};
       int countOfFriends = friends.length;
        System.out.println(countOfFriends);
        for (int x = 0; x <countOfFriends ; x++) {
            String eachOfFriend = friends[x];
            System.out.println(eachOfFriend+ " has character count : "+eachOfFriend.length());
        }
        for(String eachOffriends: friends){
            System.out.println("eachOffriends = " + eachOffriends);
        }
    }
}
