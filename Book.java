package oop_book;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public abstract class Book implements IBook {

    private String id;
    private String title;
    private double basePrice;
    Scanner sc = new Scanner(System.in);

    public Book() {
    }

    public Book(String id, String title, double basePrice) {
        this.id = id;
        this.title = title;
        this.basePrice = basePrice;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public void addBook() {
        System.out.println("Enter id book : ");
        setId(sc.nextLine());
        System.out.println("Enter title book : ");
        setTitle(sc.nextLine());
        System.out.println("Enter base price : ");
        setBasePrice(sc.nextDouble());
    }

    public void updateBookById() {
        System.out.println("Enter new title : ");
        setTitle(sc.nextLine());
        System.out.println("Enter new base cost : ");
        setBasePrice(sc.nextDouble());
        sc.nextLine();
    }

    public void displayDetails() {
        System.out.println("ID: " + getId());
        System.out.println("Title: " + getTitle());
        System.out.println("Base Price: " + getBasePrice());
    }

    public abstract double calculatePrice();

}
