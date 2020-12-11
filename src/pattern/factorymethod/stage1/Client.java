package pattern.factorymethod.stage1;

/**
 * 조건에 따라 객체를 다르게 생성해야 할 때
 * 분기에 따른 객체의 생성(new 생성)을 직접하지 않고,
 * 팩토리 클래스에 위임하여 팩토리 클래스가 객체를 생성하도록 하는 방식
 *
 * 하지만 현재의 경우 분기처리하여 사용하려는 클래스가 많다면??
 * ClassA, ClassB, ClassC ... 계속 중복 코드가 늘어난다.
 * 또한 결합도가 강해져 유지보수가 어려워진다.
 */
public class Client {

    public static void main(String[] args) {
        ClassA classA = new ClassA();
        classA.createType("A");
        classA.createType("C");
    }
}
