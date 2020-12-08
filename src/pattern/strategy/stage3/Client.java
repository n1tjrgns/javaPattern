package pattern.strategy.stage3;

/**
 *  전략패턴을 적용하기 전에는 move()의 코드를 직접 수정해주어야했다.
 *  하지만 이는 OCP에 위배되는 행위이다.
 *  이로써 직접 move()를 수정하지 않고 변경에 유연하게 대처할 수 있다.
 */
public class Client {

    public static void main(String[] args) {
        Moving train = new Train();
        Moving bus = new Bus();

        //기존 기차와 버스의 이동 방식
        train.setMovableStrategy(new RailLoadStrategy());
        bus.setMovableStrategy(new LoadStrategy());

        train.move();
        bus.move();

        //선로위를 달리는 버스가 개발되었다고 했을때
        bus.setMovableStrategy(new RailLoadStrategy());
        bus.move();
    }
}
