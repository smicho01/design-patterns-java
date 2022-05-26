package state.atm.actual_states;

import state.atm.ATMMachine;
import state.atm.ATMState;

public class NoCard implements ATMState {

    ATMMachine atmMachine;

    public NoCard(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("Please Enter PIN");
        atmMachine.setAtmState(atmMachine.getYesCardState());
    }

    @Override
    public void ejectCard() {
        System.out.println("Please insert card first.");
    }

    @Override
    public void insertPin(int pinEntered) {
        System.out.println("Please insert card first.");
    }

    @Override
    public void requestCash(int cashWithdraw) {
        System.out.println("Please insert card first.");
    }
}
