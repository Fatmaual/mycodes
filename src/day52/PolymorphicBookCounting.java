package day52;

import java.util.Arrays;
import java.util.List;

public class PolymorphicBookCounting {
    public static void main(String[] args) {


        Book book1 = new PaperBooks("Java", "Akbar", 3);
        book1.displayBookInfo();
        // this is the very similar idea as putting the small coffee cup into grande cup
        KnowledgeBank knowledgeBank = book1;
        knowledgeBank.takeNotes();
        knowledgeBank.showTableOfContent();
        Book book2 = new PaperBooks("Selenium","Vasly",2);
        Book book3 = new AudioBook("Agile","GulJannet",1.8);
        Book book4 = new PaperBooks("Java","Muhtar",5);
        Book book5 = new PaperBooks("Selenium","Vasly",8);
        Book book6 = new AudioBook("Lord Of Rings","J. R. R. Tolkien",95.5);

        List<Book> bookList = Arrays.asList(book1,book2,book3,book4,book5,book6);


        int bookCount=0;
        for(Book eachBook:bookList){
            //  eachBook.displayBookInfo();
            //   System.out.println(eachBook.getClass().getSimpleName().equals("PaperBook"));
            //  bookCount++;
            String className= eachBook.getClass().getSimpleName();
            System.out.println(className);
            if(className.equals("AudioBook"));
            bookCount++;
        }
        System.out.println("book count: "+bookCount);
    }
}

