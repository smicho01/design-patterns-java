package singleton.captain;

public class MakeACaptain {

    private static MakeACaptain _captain;

    private MakeACaptain () {

    }

    public static synchronized MakeACaptain getInstance() {
        if(_captain == null) {
            _captain = new MakeACaptain();
            System.out.println("New captain was selected for the team");
        } else {
            System.out.println("Captain already exists. Sending him now. ");
        }
        return _captain;
    }
}
