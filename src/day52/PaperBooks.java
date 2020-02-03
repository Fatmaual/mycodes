package day52;
 /** PaperBook
         * 	int weight
         * 	-- add constructor to set all the fields
         * 	implement abstract method
        * 	instance method
        * 		read()
        * 		toString()
*/
public class PaperBooks extends Book implements Readable {

    int weight;

    public PaperBooks(String name, String author,int weight){
        super(name,author);
        this.weight=weight;

    }

    @Override
    public void displayBookInfo() {
        System.out.println("Book's name is: "+name+", and the author is: "+author
                +" this is a paper book"
        );

    }
     public void read(){
         System.out.println("Reading the "+name+" written by "+author);
     }

    @Override
    public String toString() {
        return "PaperBook{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

     @Override
     public void takeNotes() {
         System.out.println("taking from this book "+name);
         System.out.println("take note where you need it highlight them");

     }

 }
/**
 * -- abstract
 * Book
 * 	String name
 * 	String author
 * -- add constructors to set the fields
 * -- abstract void method
 * 	displayBookInfo()
 * --- concreate

 * AudioBook
 * 	double duration
 * 	implement abstract method
 * 	instance method
 * 		listen()
 * 		toString()
 * create an interface KnowledgeBank
 * 	abstract method takeNote();
 * 	default method showTableOfContent(){
 *        }
 * create anothe interface Readable
 * 	 abstract method read()
 * Book implements KnowledgeBank
 * AudioBook , Paperbook extends Book
 * Paperbook implements Readable
 * Create List<Book> add all your books
 * 	displayInfo on all of them
 * 	find out how many paperbook is there
 */