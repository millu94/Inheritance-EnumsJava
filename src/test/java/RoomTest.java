import org.junit.Before;
import org.junit.Test;
import rooms.Room;
import rooms.RoomType;
import rooms.Bedroom;
import rooms.ConferenceRoom;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Bedroom bedroom;
    ConferenceRoom conferenceRoom;

    @Before
    public void before(){
        bedroom = new Bedroom(RoomType.DOUBLE.getValue(), 1, RoomType.DOUBLE);
        conferenceRoom = new ConferenceRoom("Big Dick's Presentation Room", 50);
    }

    @Test
    public void canGetRoomType(){
        assertEquals(RoomType.DOUBLE, bedroom.getRoomType());
    }

    @Test
    public void doubleHasValue2(){
        assertEquals(2, bedroom.getValueFromEnum());
    }

    @Test
    public void roomHasCapacity(){
        assertEquals(2, bedroom.checkCapacity());
    }

}
