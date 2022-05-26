package adapter.speed_units;

import adapter.speed_units.concrete_cars.BugattiVeyron;

public class Demo {
    public static void main(String[] args) {
        Movable bugatti = new BugattiVeyron();
        MovableADAPTER adapter = new MovableAdapterImpl(bugatti);
        double expected = bugatti.getSpeed() *  1.60934;
        System.out.println("Bugatti speed in MPH: " + bugatti.getSpeed() + " conversion to Km/h: " + adapter.getSpeed() );
        System.out.println("Correct conversion: " + (expected == adapter.getSpeed()));
    }
}
