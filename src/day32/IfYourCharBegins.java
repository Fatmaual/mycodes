package day32;

public class IfYourCharBegins {
    public static void printAlphabetInRange(char beginning,char ending) {
        //so I need 2 char beginning and ending
        if (beginning < ending) {
            System.out.print("we need to increment from " + beginning + " till " + ending);
            for (int x = beginning; x <= ending; x++) {
                System.out.print(x+" ");
            }
        } else if (ending > beginning) {
            System.out.print("We need to decrement from " + ending + " till " + beginning);
            for (int i = beginning; i >= ending; i--) {
                System.out.print(i+" ");

            }
            System.out.println();
        } else {
            System.out.println("the characters are equal each other");

        }

    }
    public static void main(String[] args) {
        printAlphabetInRange('a','f');
        printAlphabetInRange('G','B');
        printAlphabetInRange('A','A');
        printAlphabetInRange('d','R');

    }
}
