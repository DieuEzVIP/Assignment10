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
public class TextBook extends Book {

    private String subject;
    Scanner sc = new Scanner(System.in);

    public TextBook() {
    }

    public TextBook(String subject, String id, String title, double basePrice) {
        super(id, title, basePrice);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void addBook() {
        super.addBook();
        System.out.println("Enter subject : ");
        setSubject(sc.nextLine());
    }

    public void updateBookById() {
        super.updateBookById();
        System.out.println("Enter new title : ");
        setTitle(sc.nextLine());
        System.out.println("Enter new base price : ");
        setBasePrice(sc.nextDouble());
        System.out.println("Enter new subject : ");
        setSubject(sc.nextLine());
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Subject : " + getSubject());
        System.out.println("Final price : " + calculatePrice());
    }

    public double calculatePrice() {
        return getBasePrice() * 1.1;
    }

    @Override
    public double caculatePrice() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void addBook(Book book) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void updateBookById(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


}
