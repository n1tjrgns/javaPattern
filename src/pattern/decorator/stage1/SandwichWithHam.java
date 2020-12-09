package pattern.decorator.stage1;

public class SandwichWithHam extends Sandwich {
    public void make(){
        super.make();
        addHam();
    }

    private void addHam() {
        System.out.println(" + 햄 추가");
    }
}
