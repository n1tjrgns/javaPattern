package pattern.observer.stage2;

import pattern.observer.stage2.User;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        User user = new User();
        List<Room> rooms = new ArrayList<>();

        rooms.add(new ChatRoom1("채팅방1"));
        rooms.add(new ChatRoom2("채팅방2"));
        rooms.add(new ChatRoom3("채팅방3"));

        user.setRoom(rooms);

        String msg = "공지사항 입니다.";
        user.talk(msg);

    }
}
