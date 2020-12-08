package pattern.observer.stage2;

public class Room {

    public String roomName;

    public void receive(String msg){
        System.out.println(" 방 이름 : " + this.roomName + " 메세지 : " + msg);
    }
}
