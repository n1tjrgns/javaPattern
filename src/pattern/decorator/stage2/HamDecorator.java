package pattern.decorator.stage2;

public class HamDecorator extends ToppingDecorator{

    public HamDecorator(Sandwich sandwich) {
        super(sandwich);
    }

    public void make(){
        super.make();
        addHam();
    }

    private void addHam() {
        System.out.println(" + 햄 추가");
    }
}
