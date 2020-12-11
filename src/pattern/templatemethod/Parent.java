package pattern.templatemethod;

public class Parent {

    public void someMethod(){
        System.out.println("부모 1");

        hook();

        System.out.println("부모 2");
    }

    public void hook() {
    }
}
