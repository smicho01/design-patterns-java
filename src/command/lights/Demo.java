package command.lights;

import command.lights.commands.DimCommand;
import command.lights.commands.TurnOffCommand;
import command.lights.commands.TurnOnCommand;

public class Demo {
    public static void main(String[] args) {
        SmartHomeSiri smartHomeSiri = new SmartHomeSiri();

        Light livingRoomLight = new Light("Living Room Light");
        Command turnOnLight = new TurnOnCommand(livingRoomLight);
        Command turnOffLight = new TurnOffCommand(livingRoomLight);
        Command dimLight = new DimCommand(livingRoomLight);

        smartHomeSiri.addCommand(turnOffLight);
        smartHomeSiri.executeCommands();
        smartHomeSiri.addCommand(turnOnLight);
        smartHomeSiri.addCommand(dimLight);
        smartHomeSiri.addCommand(turnOffLight);
        smartHomeSiri.executeCommands();

        smartHomeSiri.executeCommands();
    }
}
