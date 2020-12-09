package pattern.decorator.stage2;

/**
 *  토핑 객체를 생성할 때, 생성자로 다시 데커레이터를 생성하고, 최종적으로 Bread를 생성함으로써
 *  샌드위치를 만들 수 있다.
 */
public class Client {
    public static void main(String[] args) {
        //계란 샌드위치
        Sandwich sandWichWithEgg = new EggDecorator(new Bread());
        sandWichWithEgg.make();

        System.out.println("----------------");

        //계란 햄 샌드위치
        Sandwich sandWichWithEggHam = new HamDecorator(new EggDecorator(new Bread()));
        sandWichWithEggHam.make();
    }
}
