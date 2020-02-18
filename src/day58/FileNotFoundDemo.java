package day58;

//import java.io.IOException;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Paths;


public class FileNotFoundDemo {
    public static void main(String[] args) {
  try {
      Files.readAllLines(Paths.get("file.txt"));
  }catch(Exception e){
      System.out.println("Exception caught");
  }
        }
}
