package rooms;

public class Bedroom extends Room {

    private RoomType roomType;
    private Integer roomNumber;

    public Bedroom(Integer capacity, Integer roomNumber, RoomType roomType) {
        super(capacity);
        this.roomNumber = roomNumber;
        this.roomType = roomType;
    }

    public rooms.RoomType getRoomType() {
        return this.roomType;
    }

    public int getValueFromEnum() {
        return this.roomType.getValue();
    }


}
