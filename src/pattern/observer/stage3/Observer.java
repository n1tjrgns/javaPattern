package pattern.observer.stage3;

public class Observer {
    public String roomName;

    public void receive(String msg){
        System.out.println(this.roomName + "방 메시지 : " + msg);
    }
}
