package pattern.factorymethod.stage2;

/**
 * 조건에 따라 객체를 다르게 생성해야 할 때
 * 분기에 따른 객체의 생성(new 생성)을 직접하지 않고,
 * 팩토리 클래스에 위임하여 팩토리 클래스가 객체를 생성하도록 하는 방식
 *
 * 조건에 따른 객체 생성 부분을 자신이 직접하지 않고, 팩토리 클래스에 위임하여
 * 객체를 생성하도록 하는 방법.
 */
public class Client {

    public static void main(String[] args) {
        ClassA classA = new ClassA();
        classA.createType("A");
        classA.createType("C");
    }
}
