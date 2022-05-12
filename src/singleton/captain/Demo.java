package singleton.captain;

public class Demo {

    public static void main(String[] args) {
        MakeACaptain c1 = MakeACaptain.getInstance();
        MakeACaptain c2 = MakeACaptain.getInstance();
        System.out.println("Comparing both instaces ...");

        if(c1 == c2) {
            System.out.println("Both instances are the same");
        } else {
            System.out.println("Instances are different.");
        }
    }
}
