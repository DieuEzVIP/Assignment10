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
public class BedRoom extends Room {

    private int numberOfBeds;

    public BedRoom() {

    }

    public BedRoom(int numberOfBeds, String id, String name, double baseCost) {
        super(id, name, baseCost);
        this.numberOfBeds = numberOfBeds;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    Scanner sc = new Scanner(System.in);

    public void addRoom() {
        super.addRoom();
        System.out.println("Enter number of bed : ");
        setNumberOfBeds(sc.nextInt());
    }

    public void updateRoom() {
        super.updateRoom();
        System.out.println("New number of bed : ");
        setNumberOfBeds(sc.nextInt());
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Number of bed : " + getNumberOfBeds());
    }

    public double calculateCost() {
        if (getNumberOfBeds() >= 3) {
            return getNumberOfBeds() * 1.1;
        } else {
            return getNumberOfBeds();
        }
    }

}
