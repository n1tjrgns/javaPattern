package pattern.state.stage3;

public class Saving implements PowerState{
    @Override
    public void powerPush() {
        System.out.println("전원 on");
    }
}
