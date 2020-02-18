package day58;
public class RunTimeErrorDemo {
    public static void main(String[] args) throws Exception {
        System.out.println("checked exception in next line");
          try {
              Thread.sleep(5000);
          } catch(Exception e){
                  System.out.println("Exception was caught");
              }
            System.out.println("After Thread.sleep");

    }
    }

