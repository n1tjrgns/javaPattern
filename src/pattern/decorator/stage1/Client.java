package pattern.decorator.stage1;

/**
 * 샌드위치에 재료를 추가하는 예제
 * 재료를 추가할 때마다 그에 맞는 재료들을 위한 클래스를 계속 생성해줘야한다.
 * 그것도 모든 경우의 수로
 */
public class Client {
    public static void main(String[] args) {
        Sandwich sandwich = new Sandwich();
        sandwich.make();

        System.out.println("-------------");

        SandwichWithEgg sandwichWithEgg = new SandwichWithEgg();
        sandwichWithEgg.make();

        System.out.println("-------------");

        SandwichWithHam sandwichWithHam = new SandwichWithHam();
        sandwichWithHam.make();
    }
}
