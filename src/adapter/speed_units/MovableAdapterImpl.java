package adapter.speed_units;

public class MovableAdapterImpl implements MovableADAPTER {

    private Movable someCar;

    public MovableAdapterImpl(Movable car) {
        someCar = car;
    }

    // constructors etc

    @Override
    public double getSpeed() {
        return convertMilesToKm(someCar.getSpeed());
    }

    private double convertMilesToKm(double mph) {
        return mph * 1.60934;
    }
}
