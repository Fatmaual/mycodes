package day41;

public class TV {
    /**
     * TV
     * attributes :
     * brand , isOn , currentChannel
     * String , boolean , int   (range from 1-50)
     * String , boolean , int   (range from 0-50)
     * behaviours :
     * turnOn
     * turnOff
     * getCurrentChannel
     * setCurrentChannel (newChannelNumber)
     * moveForward
     * moveBackward
     */

    String brand;
    boolean isOn;
    int currentChannel;
    /**
     * A method to return the value of current channel for the TV
     *
     * @return the value of current channel for the TV
     */

    public int getCurrentChannel(){

        return currentChannel; ///easy and simple just get currently channel

    }
    //how can I set the channel?How do I know to set?I need to know it from what do I use it.I need current channel and
    //where the current channel comes from? -->int-> currentChannel -> newChannel
    //new channel methodumda onaylamak icin (parameteri) currentChannel=newChannel
    public void  setTheChannel(int newChannel){
        if(isOn==true){
            currentChannel=newChannel;
        }else{
            System.out.println("turn on the tv first");
        }

    }
    //we can not set a channel if the tv is off!!
    //valid channel is from 0-50
    //if my channel is out of the range I want to exit form method
public void setCurrentChannel(int newChannel){
   if(newChannel<0 || newChannel>50){ //get out olmak icin sacma bir rakam verdik
       System.out.println("invalid channel,getting out");
       return;//early exit from the method without doing else is else ...
       //else return is not just a method this is good example for that
   }

}
public void turningOn(){

    if(isOn==false){ //if boolean (isOn) is false then turn on the TV(make  boolean is true) -->isOn=true;
        System.out.println("turning on the TV");
        isOn=true;
    }
}
public void turningOff(){

    if(isOn==true){
        System.out.println("turning off the TV");
        isOn=false;

    }
}

    public String toString() {
        return "TV{" +
                "brand='" + brand + '\'' +
                ", isOn=" + isOn +
                ", currentChannel=" + currentChannel +
                '}';
    }

}
