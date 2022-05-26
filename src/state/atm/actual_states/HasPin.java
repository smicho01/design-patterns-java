package state.atm.actual_states;

import state.atm.ATMMachine;
import state.atm.ATMState;

public class HasPin implements ATMState {

    ATMMachine atmMachine;

    public HasPin(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("Can't insert anther card.");
    }

    @Override
    public void ejectCard() {
        System.out.println("Card ejected");
        atmMachine.setAtmState(atmMachine.getNoCardState());
    }

    @Override
    public void insertPin(int pinEntered) {
        System.out.println("PIN already entered.");
    }

    @Override
    public void requestCash(int cashWithdraw) {
        if(cashWithdraw > atmMachine.getCashInMachine()) {
            System.out.println("Not enough money in ATM");
            System.out.println("Card Ejected");
            atmMachine.setAtmState(atmMachine.getNoCardState());
        } else {
            System.out.println(cashWithdraw + " is provided by the ATM.");
            atmMachine.setCashInMachine(atmMachine.getCashInMachine() - cashWithdraw);
            System.out.println("Card Ejected");
            atmMachine.setAtmState(atmMachine.getNoCardState());

            if(atmMachine.getCashInMachine() <= 0) {
                atmMachine.setAtmState(atmMachine.getNoCashState());
            }
        }
    }
}
