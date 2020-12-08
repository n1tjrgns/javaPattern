package pattern.state.stage3;

/**
 * 노트북 전원이 켜져 있는 상태에서 전원 버튼을 누르면, 전원을 끌 수 있다.
 * 노트북 전원이 꺼져 있는 상태에서 전원 버튼을 누르면, 절전모드가 된다.
 * 노트북 절전모드 상태에서 전원 버튼을 누르면, 전원을 켤 수 있다.
 */
public class Laptop {

    private PowerState powerState;

    public Laptop(){
        this.powerState = new Off();
    }

    public void setPowerState(PowerState powerState) {
        this.powerState = powerState;
    }

    public void powerPush(){
        powerState.powerPush();
    }
}
