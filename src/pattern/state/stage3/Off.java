package pattern.state.stage3;

public class Off implements PowerState {
    @Override
    public void powerPush() {
        System.out.println("절전 모드");
    }
}
