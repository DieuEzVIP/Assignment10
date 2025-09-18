package oop_book;

import java.util.ArrayList;
import java.util.Scanner;

public class BookList {

    public ArrayList<Book> bookList = new ArrayList<>();

    public void addBook(Book book) {
        bookList.add(book);
        System.out.println("Add book successful !!!");
    }

    public boolean updateBookById(String id) {
        for (Book b : bookList) {
            if (b.getId().equals(id)) {
                Scanner keyboard = new Scanner(System.in);
                System.out.println("Enter new name : ");
                b.setTitle(keyboard.nextLine());
                System.out.println("Enter new price : ");
                b.setBasePrice(keyboard.nextDouble());
                return true;
            }
        }
        System.out.println("Id not found ");
        return false;
    }

    public boolean deleteBookById(String id) {
        for (Book b : bookList) {
            if (b.getId().equals(id)) {
                bookList.remove(b);
                return true;
            }
        }
        System.out.println("Id not found !!!");
        return false;
    }

    public Book findBookById(String id) {
        for (Book b : bookList) {
            if (b.getId().equals(id)) {
                System.out.println("Yes");
                b.displayDetails();
            } else {
                System.out.println("No");
            }
        }
        return null;
    }

    public void displayAllBooks() {
        if (bookList.isEmpty()) {
            System.out.println("Array empty");
        } else {
            for (Book b : bookList) {
                System.out.println("----------");
                b.displayDetails();
            }
        }
    }

    public Book findMostExpensiveBook() {
        Book max = bookList.get(0);
        for (Book b : bookList) {
            if (b.calculatePrice() > max.calculatePrice()) {
                max = b;
            }
        }
        return max;

    }

    public void countBooks() {
        int textCount = 0, refCount = 0;
        for (Book b : bookList) {
            if (b instanceof TextBook) {
                textCount++;
            }
            if (b instanceof ReferenceBook) {
                refCount++;
            }
        }
        System.out.println("Total TextBook = " + textCount);
        System.out.println("Total ReferenceBook = " + refCount);

    }

}
