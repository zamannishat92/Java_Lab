package Oop_Class_1;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Fs {
    public static void main(String[] args) {
        Book b1 = new Book("A Tale of Two Cities", 1859, "Charles Dickens");
        Book b2 = new Book("Harry Potter and the Deathly Hallows", 2007, "J. K. Rowling");
        try {
            PrintWriter out = new PrintWriter("out.txt");
            out.println(b1.getTitle()+" "+b1.getYear()+" "+b1.getAuthor());
            out.println(b2.getTitle()+" "+b2.getYear()+" "+b2.getAuthor());

            out.close();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}