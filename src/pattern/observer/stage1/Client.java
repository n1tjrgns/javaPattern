package pattern.observer.stage1;

// 사용자가 채팅룸에 대화를 전달하는 가장 기본적인 예제
public class Client {
    public static void main(String args[]){
        User user = new User();
        Room room = new Room();

        user.setRoom(room);

        String msg = "하이";
        user.talk(msg);
    }
}