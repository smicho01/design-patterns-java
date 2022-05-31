package command.lights;

public class Light {
    private String name;
    private boolean isOn;

    public Light(String name) {
        this.name = name;
        isOn = false;
    }

    public void turnOn(){
        if(!isOn) {
            isOn = true;
            System.out.println("Light: " + name + " turned on");
        } else {
            System.out.println("Light " + name + " is already on");
        }
    }

    public void turnOff(){
        if(isOn) {
            isOn = false;
            System.out.println("Light: " + name + " turned off");
        } else {
            System.out.println("Light " + name + " is already off");
        }
    }

    public void dimLight(){
        if(isOn) {
            System.out.println("Dimming the light a bit ... done !");
        }
    }
}
