package pattern.observer.stage2;

import java.util.ArrayList;
import java.util.List;

public class User {

    private List<Room> room;

    public void setRoom(List<Room> room) {
        this.room = room;
    }

    public void talk(String msg){
        for (Room r : room) {
            r.receive(msg);
        }
    }
}
