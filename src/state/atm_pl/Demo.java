package state.atm_pl;

public class Demo {

    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.insertCard();
        atm.insertPin(1234);
        atm.takeCash(1000);

        System.out.println("\nSecond attempt");
        atm.takeCash(1000);
    }
}
