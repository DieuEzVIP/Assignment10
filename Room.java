/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package opp_room;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public abstract class Room implements IRoom {

    private String id;
    private String name;
    private double baseCost;
 public Room (){}
    public Room(String id, String name, double baseCost) {
        this.id = id;
        this.name = name;
        this.baseCost = baseCost;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    public void addRoom() {
        System.out.println("Enter id room : ");
        Scanner sc = new Scanner(System.in);
        setId(sc.nextLine());
        System.out.println("Enter name room : ");
        setName(sc.nextLine());
        System.out.println("Enter base cost : ");
        setBaseCost(sc.nextDouble());
    }

    public void updateRoom() {
        System.out.println("Enter new name : ");
        Scanner sc = new Scanner(System.in);
        setName(sc.nextLine());
        System.out.println("Enter new base cost : ");
        setBaseCost(sc.nextDouble());
    }

    public void displayDetails() {
        System.out.println("Id : " + getId());
        System.out.println("Name : " + getName());
        System.out.println("Base cost : " + getBaseCost());
    }
     public abstract double calculateCost();
}
