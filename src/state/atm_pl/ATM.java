package state.atm_pl;

import state.atm_pl.states.NoCardState;
import state.atm_pl.states.State;

public class ATM {

    private State state;
    private int cash;

    public ATM() {
        // initial ATM state [no card]
        this.state = new NoCardState(this);
        this.cash = 10000;
    }

    public void insertCard() {
        state.insertCard();
    }

    public void insertPin(int pin){
        state.insertPin(pin);
    }

    public void takeCash(int cash) {
        state.takeCash(cash);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }
}
