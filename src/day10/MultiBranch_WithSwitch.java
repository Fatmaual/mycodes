package day10;

import org.w3c.dom.ls.LSOutput;

public class MultiBranch_WithSwitch {
    public static void main(String[] args) {
      String order ="";
      int itemNumber = 11;
      switch(itemNumber) {
          case 11:
              System.out.println("you have selected 11 ");
              order = "burger";
              break;
          case 5:
              System.out.println("you have selected 5 ");
              order = "french fry";
              break;
          case 8:
              System.out.println("you have selected 8");
              order = "nuggets";
              break;
          case 35:
              System.out.println("you have selected 35");
              System.out.println("yum yum!!!");
              System.out.println("enjoy it!!!");
              order = "ice cream";
              break;
          default:
              System.out.println("you have selected unknown item");
              order = "unknown";
              break;
      }
        System.out.println("your order is "+order);




    }
}
