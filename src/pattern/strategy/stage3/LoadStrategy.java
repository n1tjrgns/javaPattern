package pattern.strategy.stage3;

public class  LoadStrategy implements MovableStrategy{
    @Override
    public void move() {
        System.out.println("도로 이동");
    }
}
