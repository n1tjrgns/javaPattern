package pattern.decorator.stage2;

// 빵은 무조건 있어야 하기 때문에 데커레이터 패턴 적용 x
public class Bread extends Sandwich{

    @Override
    public void make() {
        System.out.println("빵 추가");
    }
}
