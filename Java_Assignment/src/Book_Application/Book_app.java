package Book_Application;

import java.util.Scanner;

public class Book_app {
    private String book;


    Book_app(String book_address){
        this.book=book;
    }

    public String getBook() {

        return this.book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    void update(String book_address) {
        this.book=book;
        System.out.println("Updated successfully");
    }

    void print(){
        System.out.println("Record: "+book);
    }


}





