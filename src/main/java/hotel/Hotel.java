package hotel;

import rooms.Room;
import guest.Guest;
import rooms.Bedroom;
import rooms.ConferenceRoom;

import java.util.ArrayList;

public class Hotel {

    private ArrayList<Room> rooms;
    private String name;


    public Hotel(String name){
        this.rooms = new ArrayList<>();
        this.name = name;
    }

    public int getRooms(){
        return rooms.size();
    }

    public void checkGuestIn(Guest guest, Room room){
        int roomIdx = this.rooms.indexOf(room);
        this.rooms.get(roomIdx).addGuestToRoom(guest);
    }

    public void checkGuestOut(Guest guest, Room room){
        int roomIdx = this.rooms.indexOf(room);
        this.rooms.get(roomIdx).removeGuestToRoom(guest);
    }

    public void addBedroom(Bedroom bedroom) {
        this.rooms.add(bedroom);
    }

    public void addConferenceRoom(ConferenceRoom conferenceRoom) {
        this.rooms.add(conferenceRoom);
    }


}
