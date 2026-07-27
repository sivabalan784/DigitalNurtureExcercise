interface Command {
    void execute();
}
class Light {
    public void turnOn() {
        System.out.println("Light is ON");
    }
    public void turnOff() {
        System.out.println("Light is OFF");
    }
}
class LightOnCommand implements Command {
    private Light light;
    public LightOnCommand(Light light) {
        this.light = light;
    }
    @Override
    public void execute() {
        light.turnOn();
    }
}
class LightOffCommand implements Command {
    private Light light;
    public LightOffCommand(Light light) {
        this.light = light;
    }
    @Override
    public void execute() {
        light.turnOff();
    }
}
class RemoteControl {
    private Command command;
    public RemoteControl(Command command) {
        this.command = command;
    }
    public void pressButton() {
        command.execute();
    }
}
public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);
        RemoteControl remote;
        remote = new RemoteControl(lightOn);
        remote.pressButton();

        remote = new RemoteControl(lightOff);
        remote.pressButton();
    }
}