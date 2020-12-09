package pattern.command.stage2;

/**
 *  OK 구글에 램프 켜는 기능이 추가되었다.
 *  하지만 기능이 추가 될 수록 OKGoogle이 참조해야하는 객체는 늘어나고,
 *  talk 메소드에서 switch 문의 분기도 계속 늘어날 것이다.
 *  OCP에도 위배된다.
 */
public class Client {
    public static void main(String[] args) {
        Heater heater = new Heater();
        Lamp lamp = new Lamp();
        OKGoogle okGoogle = new OKGoogle(heater, lamp);

        //히터 켜짐
        okGoogle.setMode(0);
        okGoogle.talk();

        //램프 켜짐
        okGoogle.setMode(1);
        okGoogle.talk();
    }
}
