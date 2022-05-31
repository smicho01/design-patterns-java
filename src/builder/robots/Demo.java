package builder.robots;

import builder.robots.concrete_builders.OldRobotBuilder;
import builder.robots.concrete_builders.RobotEngineer;

public class Demo {

    public static void main(String[] args) {
        RobotBuilder oldStyleRobot = new OldRobotBuilder();
        RobotEngineer engineer = new RobotEngineer(oldStyleRobot);
        engineer.makeRobot();
        Robot firstRobot = engineer.getRobot();

        System.out.println(firstRobot);
    }
}
