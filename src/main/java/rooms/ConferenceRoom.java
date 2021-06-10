package rooms;

public class ConferenceRoom extends Room {

    private String name;

    public ConferenceRoom(String name, Integer capacity){
        super(capacity);
        this.name = name;
    }

}
