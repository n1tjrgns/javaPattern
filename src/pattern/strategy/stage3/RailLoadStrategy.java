package pattern.strategy.stage3;

public class RailLoadStrategy implements MovableStrategy{
    @Override
    public void move() {
        System.out.println("선로로 이동");
    }
}
