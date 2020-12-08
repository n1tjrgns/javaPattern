package pattern.observer.stage1;

public class User {
    private Room room;

    public void setRoom(Room room){
        this.room = room;
    }

    public void talk(String msg){
        room.receive(msg);
    }
}