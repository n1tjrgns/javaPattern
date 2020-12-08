package pattern.state.stage2;

/**
 * 노트북 전원이 켜져 있는 상태에서 전원 버튼을 누르면, 전원을 끌 수 있다.
 * 노트북 전원이 꺼져 있는 상태에서 전원 버튼을 누르면, 절전모드가 된다.
 * 노트북 절전모드 상태에서 전원 버튼을 누르면, 전원을 켤 수 있다.
 *
 * 조건이 하나 늘어남에 따라 분기 코드가 상당히 길어지고, 상태에 따라 하고자 하는 행위를 파악하기 쉽지 않다.
 */
public class Client {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.powerPush();
        laptop.setPowerState(Laptop.ON);
        laptop.powerPush();
        laptop.setPowerState(Laptop.SAVING);
        laptop.powerPush();
        laptop.setPowerState(Laptop.OFF);
        laptop.powerPush();
        laptop.setPowerState(Laptop.ON);
        laptop.powerPush();
    }
}
