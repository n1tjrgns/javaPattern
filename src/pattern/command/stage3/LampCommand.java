package pattern.command.stage3;

public class LampCommand implements Command {

    private Lamp lamp;

    public LampCommand(Lamp lamp){
        this.lamp = lamp;
    }

    @Override
    public void run() {
        lamp.turnOn();
    }
}
