package pattern.decorator.stage1;

public class SandwichWithEgg extends Sandwich{
    public void make(){
        super.make();
        addEgg();
    }

    private void addEgg() {
        System.out.println(" + 계란 추가");
    }
}
