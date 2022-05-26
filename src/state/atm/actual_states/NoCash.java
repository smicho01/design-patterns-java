package state.atm.actual_states;

import state.atm.ATMMachine;
import state.atm.ATMState;

public class NoCash implements ATMState {

    ATMMachine atmMachine;

    public NoCash(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("ATM have no money");
    }

    @Override
    public void ejectCard() {
        System.out.println("ATM have no money. You didn't enter the card");
    }

    @Override
    public void insertPin(int pinEntered) {
        System.out.println("ATM have no money");
    }

    @Override
    public void requestCash(int cashWithdraw) {
        System.out.println("ATM have no money");
    }
}
