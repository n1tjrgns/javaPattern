package pattern.command.stage1;

/**
 *  구글 미니로 OK 구글 히터 틀어줘 라고 하는 서비스 예제
 *  OK Google은 히터를 켜기 위해서 Heater 객체를 참조해야 한다. (의존성이 발생한다)
 */
public class Client {
    public static void main(String[] args) {
        Heater heater = new Heater();
        OKGoogle okGoogle = new OKGoogle(heater);

        okGoogle.talk();
    }
}
