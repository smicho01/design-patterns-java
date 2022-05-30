package command.lights;

import java.util.ArrayList;
import java.util.List;

public class SmartHomeSiri {

    private List<Command> commands = new ArrayList<>();

    public void addCommand(Command command) {
        this.commands.add(command);
    }

    public void executeCommands() {
        if(commands.size() == 0) {
            System.out.println("No commands to execute Sir");
            return;
        }
        System.out.println("\nNew bunch of commands to digest. Cheers!");
        for(Command command: commands) {
            command.execute();
        }
        System.out.println("All commands executed. Over ...\n");
        commands.clear();
    }
}
