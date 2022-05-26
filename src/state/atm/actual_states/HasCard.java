package state.atm.actual_states;

import state.atm.ATMMachine;
import state.atm.ATMState;

public class HasCard implements ATMState {

    ATMMachine atmMachine;

    public HasCard(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("You can't enter more than 1 card.");
    }

    @Override
    public void ejectCard() {
        System.out.println("Card Ejected");
        atmMachine.setAtmState(atmMachine.getNoCardState());
    }

    @Override
    public void insertPin(int pinEntered) {
        if(pinEntered == 1234) {
            System.out.println("Correct PIN");
            atmMachine.setCorrectPinEntered(true);
            atmMachine.setAtmState(atmMachine.getHasCorrectPin());
        } else {
            System.out.println("Wrong PIN");
            atmMachine.setCorrectPinEntered(false);
            System.out.println("Card Rejected");
            atmMachine.setAtmState(atmMachine.getNoCardState());
        }
    }

    @Override
    public void requestCash(int cashWithdraw) {
        System.out.println("Enter PIN first !");
    }
}
