/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_book;

/**
 *
 * @author ACER
 */
public interface IBook {
    void addBook (Book book );
    public void updateBookById(String id );
    void displayDetails( );
    double caculatePrice ();
    
}
