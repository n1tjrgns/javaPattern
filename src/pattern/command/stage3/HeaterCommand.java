package pattern.command.stage3;

public class HeaterCommand implements Command {

    private Heater heater;

    public HeaterCommand(Heater heater){
        this.heater = heater;
    }

    @Override
    public void run() {
        heater.powerOn();
    }
}
