/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package opp_room;

import java.util.ArrayList;

/**
 *
 * @author ACER
 */
public class RoomList {

    private ArrayList<Room> roomList = new ArrayList<>();

    public void addRoom(Room room) {
        roomList.add(room);
    }

    public boolean updateRoomById(String id) {
        for (Room r : roomList) {
            if (r.getId().equals(id)) {
                r.updateRoom();
                return true;
            }
        }
        return false;
    }

    public boolean deleteRoomById(String id) {
        return roomList.removeIf(r -> r.getId().equals(id));
    }

    public Room findRoomById(String id) {
        for (Room r : roomList) {
            if (r.getId().equals(id)) {
                r.displayDetails();
            }
        }
        return null;
    }

    public void displayAllRooms() {
        for (Room r : roomList) {
            r.displayDetails();
        }
    }

    public Room findMostExpensiveRoom() {
        Room max = roomList.get(0);
        for (Room r : roomList) {
            if (r.calculateCost() > max.calculateCost()) {
                max = r;
            }
        }
        return max;
    }

    public void countRooms() {
        int meetingCount = 0 , bedCount = 0 ;
        for (Room r : roomList) {
        if(r instanceof MeetingRoom) meetingCount++ ; 
        else if (r instanceof BedRoom) bedCount++ ; 
        }
        System.out.println("Meeting Rooms : " + meetingCount );
        System.out.println("Bed Rooms : " + bedCount);
    }
}
