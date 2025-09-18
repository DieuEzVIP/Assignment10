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
public class Processor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RoomList roomList = new RoomList();
        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Add a new Meeting Room/Bedroom");
            System.out.println("2. Update a room by Id");
            System.out.println("3. Delete a room by Id");
            System.out.println("4. Find a room by Id");
            System.out.println("5. Display all rooms");
            System.out.println("6. Find the most expensive room");
            System.out.println("7. Count total number of rooms");
            System.out.println("0. Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("1. Meeting room  ||  2. Bed room ");
                    int type = sc.nextInt();
                    Room room;
                    if (type == 1) {
                        room = new MeetingRoom();
                    } else {
                        room = new BedRoom();
                        
                    }
                    room.addRoom();
                    roomList.addRoom(room);
                    break;
                case 2:
                    System.out.println("Enter id to update : ");
                    String idU = sc.next();
                    if (!roomList.updateRoomById(idU)) {
                        System.out.println("Room not found!");
                        break;
                    }
                case 3:
                    System.out.println("Enter id to delete : ");
                    String idD = sc.next();
                    if (!roomList.deleteRoomById(idD)) {
                        System.out.println("Room not found!");
                        break;
                    }
                case 4:
                    System.out.println("Enter id to find : ");
                    String idF = sc.next();
                    Room found = roomList.findRoomById(idF);
                    if (found != null) {
                        found.displayDetails();
                    } else {
                        System.out.println("Room not found");
                    }
                    break;
                case 5:
                    roomList.displayAllRooms();
                    break;
                case 6:
                    Room max = roomList.findMostExpensiveRoom();
                    if (max != null) {
                        System.out.println("Most expensive room : ");
                        max.displayDetails();
                    }
                    break; 
                case 7:
                    roomList.countRooms();
                    break; 
                case 0:
                    System.exit(0);

            }
        }
    }
}

