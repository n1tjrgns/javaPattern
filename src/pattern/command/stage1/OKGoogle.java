package pattern.command.stage1;

public class OKGoogle {
    private Heater heater;

    public OKGoogle(Heater heater){
        this.heater = heater;
    }

    public void talk(){
        heater.powerOn();
    }

}
