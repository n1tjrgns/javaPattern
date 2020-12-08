package pattern.observer.stage2;

import java.util.ArrayList;
import java.util.List;

/**
 *  Stage2
 *  여러 방에 동시에 공지사항을 전달 할 경우
 */
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
