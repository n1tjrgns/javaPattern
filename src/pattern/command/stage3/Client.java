package pattern.command.stage3;

/**
 *  기존에는 OKGoogle 객체를 통해서만 히터나, 램프의 메소드를 제어할 수 있었다.
 *  하지만 커맨드 패턴을 적용함으로써
 *  A 객체에서 다른 객체 B의 메소드를 의존성 없이 실행 할 수 있고
 *  의존성이 없기 때문에 확장성을 가지고 유연해진다.
 */
public class Client {
    public static void main(String[] args) {
        Heater heater = new Heater();
        Lamp lamp = new Lamp();

        Command heaterOnCommand = new HeaterCommand(heater);
        Command lampOnCommand = new LampCommand(lamp);
        OKGoogle okGoogle = new OKGoogle();

        okGoogle.setCommand(heaterOnCommand);
        okGoogle.talk();

        okGoogle.setCommand(lampOnCommand);
        okGoogle.talk();
    }
}
