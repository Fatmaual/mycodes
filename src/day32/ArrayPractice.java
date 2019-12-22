package day32;

public class ArrayPractice {
    public static void compare2arraySize(String[] arr1, String[] arr2){
        if(arr1.length>arr2.length){
            System.out.println("array 1 has more item");
        }else if(arr1.length<arr2.length){
            System.out.println("array 2 has more item ");
        }
    }
    public static void main(String[] args) {
        compare2arraySize(new String[] {"sezgin","senay","astrit"},new String[]{"araz"});
        String[] names1 = {"Superman", "Batman", "Flash"};
        String[] names2 = {"Wonder Woman", "Cyborg", "Aquaman"};
        compare2arraySize(names1,names2);
    }
}
