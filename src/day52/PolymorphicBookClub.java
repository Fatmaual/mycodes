package day52;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;

public class PolymorphicBookClub {
    public static void main(String[] args) {

        Book book1 = new PaperBooks("Java","Akbar",3);
        book1.displayBookInfo();

        KnowledgeBank knowledgeBank=book1;
        knowledgeBank.takeNotes();
        knowledgeBank.showTableOfContent();

        System.out.println("===================");
        Book book3 = new AudioBook("Agile","GulJannet",1.8);
        book3.showTableOfContent();
        book3.displayBookInfo();
        System.out.println("book3 = " + book3);

        System.out.println("======================");

        Book book2 = new PaperBooks("Selenium","Vasly",2);
      //  Book book3 = new AudioBook("Agile","GulJannet",1.8);
        Book book4 = new PaperBooks("Java","Muhtar",5);
        Book book5 = new PaperBooks("Selenium","Vasly",8);
        Book book6 = new AudioBook("Lord Of Rings","J. R. R. Tolkien",95.5);

            }
    }

