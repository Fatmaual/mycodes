package day60;

import java.io.FileNotFoundException;

public class DangerZoneAgain {

    public static void main(String[] args) throws  InterruptedException {
        // Handle or Declare are the way to deal with checked exception
        // if you are sure the method will never actually throw the exception
        // it's good to just declare it to go through compiler to make it happy
        // if there is actually a chance for the exception might left unhandled
        // it's good to wrap up under try catch
        //FileNotFoundException
  //calling a method that declare to throws checked exception->handle or declare it!!!
      //  try {
       //     readMyFile();
       // }catch(FileNotFoundException e){

       // }

     //   readMyFile();
       // Thread.sleep(3000);
        //System.out.println("The End");

        System.out.println("The Start");
        try{
         //  calling a method that declare to throws checked exception
            readMyFile();
        }catch(FileNotFoundException e){
            System.out.println("Ok in the readMyFile no-one handle it I did that with try catch!!");
        }
        // Thread class is coming from java.lang package
        // it has a method called sleep and it will let your program pause for x milliseconds
        Thread.sleep(3000);
        System.out.println("The End");
    }
    // document this method to tell the caller , the file you are about to read might not exists
    // and handle the consequences yourself
    // the exception type already exists for this type of situation is called
    // FileNotFoundException from java.util package

    public static void readMyFile() throws FileNotFoundException {
        //why it is static we can call directly! no need to object to call it not related object
        System.out.println("reading the file in my computer");
        throw new FileNotFoundException("File is not here!I am not gonna take care of this I just declare it is not my problem");
    }
}
/**
 * import java.io.FileNotFoundException;
 *
 * public class DangerZoneAgain2 {
 *
 *     public static void main(String[] args) throws InterruptedException {
 *
 *
 *         System.out.println("THE START");
 *
 *         readMyFile();
 *
 *         Thread.sleep(3000);
 *         System.out.println("The end ");
 *
 *     }
 *     // document this method to tell the caller , the file you are about to read might not exists
 *     // and handle the consequences yourself
 *     // the exception type already exists for this type of situation is called
 *     // FileNotFoundException from java.util package
 *
 *     // FileNotFoundException extends IOException
 *     public static void readMyFile() {
 *
 *         System.out.println("Reading the file in my computer");
 *
 *         try {
 *             // we are throwing a checked exception
 *             // so IT MUST BE HANDLED OR DECLARED , Here we chose to handle it with try catch
 *             throw new FileNotFoundException("Kaboom ! file is not here!!! ");
 * //            List<String> allLines = Files.readAllLines(Paths.get("hero.txt") ) ;
 * //            System.out.println("allLines = " + allLines);
 *         } catch (FileNotFoundException e) {
 * //        }catch (IOException e){
 *             System.out.println("AHA !! CAUGHT YOU IN readMyFile !!!");
 *         }
 *     }
 * }
 */
