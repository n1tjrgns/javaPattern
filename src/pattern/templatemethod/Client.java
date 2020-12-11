package pattern.templatemethod;

/**
 *  템플릿 메소드 패턴
 *  여러 클래스에서 공통으로 사용하는 메소드를 상위 클래스에서 정의
 *  하위 클래스마다 다르게 구현해야하는 세부 사항은 하위 클래스에서 구현
 *
 *  주로 코드의 중복 제거를 위해 흔히 사용 하는 리팩토링 기법
 */
public class Client {
    public static void main(String[] args) {
        ChildA childA = new ChildA();
        childA.someMethod();

        System.out.println("-----------");

        ChildB childB = new ChildB();
        childB.someMethod();
    }
}
