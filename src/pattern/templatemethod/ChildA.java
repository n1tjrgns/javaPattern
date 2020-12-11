package pattern.templatemethod;

public class ChildA extends Parent {

    @Override
    public void hook(){
        System.out.println("ChildA hook");
    }
}
