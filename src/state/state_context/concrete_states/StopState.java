package state.state_context.concrete_states;

import state.state_context.Context;
import state.state_context.State;

public class StopState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "StopS tate";
    }
}
