package pattern.templatemethod;

public class ChildB extends Parent {

    @Override
    public void hook(){
        System.out.println("ChildB hook");
    }
}
