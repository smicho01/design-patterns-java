package state.atm_pl.states;

import state.atm_pl.ATM;

public abstract class State {

    ATM atm;

    public State(ATM atm) {
        this.atm = atm;
    }

    public abstract void insertCard();
    public  abstract void insertPin(int pin);
    public  abstract void takeCash(int cash);
}
