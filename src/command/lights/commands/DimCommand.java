package command.lights.commands;

import command.lights.Command;
import command.lights.Light;

public class DimCommand implements Command {

    private Light light;

    public DimCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.dimLight();
    }
}
