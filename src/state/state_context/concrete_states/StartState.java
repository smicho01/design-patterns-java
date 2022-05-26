package state.state_context.concrete_states;

import state.state_context.Context;
import state.state_context.State;

public class StartState implements State  {
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    public String toString() {
        return "Start State";
    }
}
