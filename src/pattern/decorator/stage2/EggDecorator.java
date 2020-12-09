package pattern.decorator.stage2;

public class EggDecorator extends ToppingDecorator{
    public EggDecorator(Sandwich sandwich){
        super(sandwich);
    }

    public void make(){
        super.make();
        addEgg();
    }

    private void addEgg() {
        System.out.println(" + 계란 추가");
    }
}
