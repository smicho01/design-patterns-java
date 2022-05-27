package state.atm_pl.states;

import state.atm_pl.ATM;

public class NoCashState extends State {
    public NoCashState(ATM atm) {
        super(atm);
    }

    @Override
    public void insertCard() {
        System.out.println("Rejected: No money in ATM.");
    }

    @Override
    public void insertPin(int pin) {
        System.out.println("Rejected: No money in ATM.");
    }

    @Override
    public void takeCash(int cash) {
        System.out.println("Rejected: No money in ATM.");
    }
}
