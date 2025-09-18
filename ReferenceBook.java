/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_book;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class ReferenceBook extends Book {

    private String publisher;
    Scanner sc = new Scanner(System.in);

    public ReferenceBook() {
    }

    public ReferenceBook(String publisher, String id, String title, double basePrice) {
        super(id, title, basePrice);
        this.publisher = publisher;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void addBook(Book book) {
        super.addBook();
        System.out.println("Enter publisher : ");
        setPublisher(sc.nextLine());
    }

    public void updateBookById(String id) {
        super.updateBookById();
        System.out.println("Enter new publisher ");
        setPublisher(sc.nextLine());
        
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Publisher : " + getPublisher());
        System.out.println("Final price : " + calculatePrice());
    }

    @Override
    public double calculatePrice() {
        return getBasePrice() * 1.2;
    }

    @Override
    public double caculatePrice() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
