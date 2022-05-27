package state.atm_pl.states;

import state.atm_pl.ATM;

public class NoPinState extends State {
    public NoPinState(ATM atm) {
        super(atm);
    }

    @Override
    public void insertCard() {
        System.out.println("Rejected: Can't accept another card. Insert PIN.");
    }

    @Override
    public void insertPin(int pin) {
        if(pin == 1234) {
            System.out.println("Success. PIN taken. Changing state to: awaiting withdraw [ready state]");
            atm.setState(new ReadyState(atm));
        } else {
            System.out.println("Rejected: Incorrect PIN");
        }
    }

    @Override
    public void takeCash(int cash) {
        System.out.println("Rejected: First insert PIN, then we can talk about money.");
    }
}
