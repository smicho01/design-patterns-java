package state.soda;

public class SodaMachine {
    // States
    final static int SOLD_OUT = 0;
    final static int NO_MONEY = 1;
    final static int HAS_MONEY = 2;
    final static int SOLD = 3;

    int state = SOLD_OUT;
    int count = 0;

    public SodaMachine(int count) {
        this.count = count;
        if(count > 0) {
            state = NO_MONEY;
        }
    }

    // Actions
    public void insertMoney() {
        if(state == HAS_MONEY) {
            System.out.println("You can't insert more money.");
        } else if (state == NO_MONEY) {
            state = HAS_MONEY;
            System.out.println("You inserted money.");
        } else if (state == SOLD_OUT) {
            System.out.println("The machine is empty. No soda. Sorry.");
        } else if (state == SOLD) {
            System.out.println("Please wait. We soda is one the way.");
        }
    }

    public void ejectMoney() {

    }

    public void selectSoda() {

    }

    public void dispense() {

    }
}
