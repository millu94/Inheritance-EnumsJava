import guest.Guest;
import org.junit.Before;
import hotel.Hotel;
import org.junit.Test;
import rooms.ConferenceRoom;
import rooms.Bedroom;
import rooms.Room;
import rooms.RoomType;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;

    Bedroom room1;
    Bedroom room2;
    Bedroom room3;
    Bedroom room4;
    Bedroom room5;
    ConferenceRoom cf;

    Guest guest1;
    Guest guest2;
    Guest guest3;

    @Before
    public void before(){
        hotel = new Hotel("Big Dick’s Halfway Inn");

        cf = new ConferenceRoom("Gaping Chasm", 50);
        room1 = new Bedroom(RoomType.SINGLE.getValue() , 1, RoomType.SINGLE);
        room2 = new Bedroom(RoomType.DOUBLE.getValue() , 2, RoomType.DOUBLE);
        room3 = new Bedroom(RoomType.TRIPLE.getValue() , 3, RoomType.TRIPLE);
        room4 = new Bedroom(RoomType.FAMILY.getValue() , 4, RoomType.FAMILY);
        room5 = new Bedroom(RoomType.SINGLE.getValue() , 5, RoomType.SINGLE);

        hotel.addBedroom(room1);
        hotel.addBedroom(room2);
        hotel.addBedroom(room3);
        hotel.addBedroom(room4);
        hotel.addBedroom(room5);
        hotel.addConferenceRoom(cf);

        guest1 = new Guest("Suzie");
        guest2 = new Guest("Jim Bob");
        guest3 = new Guest("Shwefelgeissen");
    }

    @Test
    public void hotelHasRooms(){
        assertEquals(6, hotel.getRooms());
    }

    @Test
    public void canCheckInGuest() {
        hotel.checkGuestIn(guest1, room1);
        assertEquals(true, room1.hasGuest(guest1));
    }

    @Test
    public void canCheckMultipleGuestsInRoom(){
        hotel.checkGuestIn(guest1, room3);
        hotel.checkGuestIn(guest2, room3);
        hotel.checkGuestIn(guest3, room3);
        ArrayList<String> names = new ArrayList<>();
        names.add("Suzie");
        names.add("Jim Bob");
        names.add("Shwefelgeissen");
        assertEquals(names, room3.listAllGuestsInRoom());
    }

    @Test
    public void canCheckGuestOut() {
        hotel.checkGuestIn(guest1, room1);
        hotel.checkGuestOut(guest1, room1);
        assertEquals(false, room1.hasGuest(guest1));
    }


}
