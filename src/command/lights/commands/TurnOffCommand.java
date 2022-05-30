package command.lights.commands;

import command.lights.Command;
import command.lights.Light;

public class TurnOffCommand implements Command  {

    private Light light;

    public TurnOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}
