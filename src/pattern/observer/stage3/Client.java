package pattern.observer.stage3;

public class Client {
    public static void main(String[] args) {
        User user = new User();
        ChatRoom1 chatRoom1 = new ChatRoom1("채팅방1");
        ChatRoom2 chatRoom2 = new ChatRoom2("채팅방2");
        ChatRoom3 chatRoom3 = new ChatRoom3("채팅방3");

        user.attach(chatRoom1);
        user.attach(chatRoom2);
        user.attach(chatRoom3);

        String msg = "공지사항 입니다.";
        user.notifyObservers(msg);

        user.detach(chatRoom2);
        msg = "It is Notification";
        user.notifyObservers(msg);
    }
}
