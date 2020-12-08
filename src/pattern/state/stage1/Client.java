package pattern.state.stage1;

/**
 * 노트북 전원이 켜져 있는 상태에서 전원 버튼을 누르면, 전원을 끌 수 있다.
 * 노트북 전원이 꺼져 있는 상태에서 전원 버튼을 누르면, 전원을 켤 수 있다.
 */
public class Client {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.powerPush();
        laptop.setPowerState(Laptop.ON);
        laptop.powerPush();
    }
}
