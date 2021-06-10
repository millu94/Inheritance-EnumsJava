package rooms;

import java.util.ArrayList;
import guest.Guest;

public abstract class Room {

    private ArrayList<Guest> guests;
    private Integer capacity;

    public Room(Integer capacity){
        this.guests = new ArrayList<>();
        this.capacity = capacity;
    }

    public boolean hasGuest(Guest guest) {
        return this.guests.contains(guest);
    }

    public void addGuestToRoom(Guest guest) {
        this.guests.add(guest);
    }

    public void removeGuestToRoom(Guest guest) {
        this.guests.remove(guest);
    }

    public int checkCapacity(){
        return this.capacity;
    }

    public ArrayList<String> listAllGuestsInRoom(){
        ArrayList<String> guestNames = new ArrayList<>();
        for (Guest guest : this.guests) {
            guestNames.add(guest.getName());
        }
        return guestNames;
    }
}
