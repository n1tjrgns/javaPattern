package pattern.state.stage2;

/**
 * 노트북 전원이 켜져 있는 상태에서 전원 버튼을 누르면, 전원을 끌 수 있다.
 * 노트북 전원이 꺼져 있는 상태에서 전원 버튼을 누르면, 절전모드가 된다.
 * 노트북 절전모드 상태에서 전원 버튼을 누르면, 전원을 켤 수 있다.
 */
public class Laptop {

    public static String ON = "on";
    public static String OFF = "off";
    public static String SAVING = "saving";
    private String powerState = "";

    public Laptop(){
        setPowerState(Laptop.OFF);
    }

    public void setPowerState(String powerState) {
        this.powerState = powerState;
    }

    public void powerPush(){
        if ("on".equals(this.powerState)){
            System.out.println("전원 OFF");
        }else if("saving".equals(this.powerState)){
            System.out.println("전원 ON");
        }else{
            System.out.println("절전모드");
        }
    }
}
