package day22;

public class ReverseOrder {
    public static void main(String[] args) {
        String myName = "Fatma Olivia";
        String reversed= "";
        for (int i = myName.length()-1; i >=0; i--) {
            reversed +=myName.substring(i,i+1);
            System.out.println(reversed);

        }
    }
}
