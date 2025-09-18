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
public class MeetingRoom extends Room {

    private int capacity;

    MeetingRoom() {
    }

    public MeetingRoom(int capacity, String id, String name, double baseCost) {
        super(id, name, baseCost);
        this.capacity = capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    /**
     *
     * @return
     */
    public void addRoom() {
        super.addRoom();
        System.out.println("Enter capacity : ");
        Scanner sc = new Scanner(System.in);
        setCapacity(sc.nextInt());
    }

    public void updateRoom() {
        super.updateRoom();
        System.out.println("New capacity : ");
        Scanner sc = new Scanner(System.in);
        setCapacity(sc.nextInt());
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Capacity : " + getCapacity());
    }

    public double calculateCost() {
        if (capacity > 50) {
            return getBaseCost() * 1.2;
        }
        return getBaseCost();
    }
}
