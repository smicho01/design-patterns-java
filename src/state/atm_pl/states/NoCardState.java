package state.atm_pl.states;

import state.atm_pl.ATM;

public class NoCardState extends State {

    public NoCardState(ATM atm) {
        super(atm);
    }

    @Override
    public void insertCard() {
        System.out.println("Success. Card accepted. Changing state to: no pin state");
        atm.setState(new NoPinState(atm));
    }

    @Override
    public void insertPin(int pin) {
        System.out.println("Rejected: Can't insert PIN. Give card first.");
    }

    @Override
    public void takeCash(int cash) {
        System.out.println("Rejected: First give card, then request money. No freebies here, sorry !");
    }
}
