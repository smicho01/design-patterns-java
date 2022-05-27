package state.atm_pl.states;

import state.atm_pl.ATM;

public class ReadyState extends State {

    public ReadyState(ATM atm) {
        super(atm);
    }

    @Override
    public void insertCard() {
        System.out.println("Rejected: Card already in ATM. Can't accept another card now.");
    }

    @Override
    public void insertPin(int pin) {
        System.out.println("Rejected: PIN was provided. You can take cash now.");
    }

    @Override
    public void takeCash(int cash) {
        if(atm.getCash() >= cash) {
            System.out.println("Success. ATM is ready to dispense cash = $ " + cash);
            atm.setCash(atm.getCash() - cash);
            atm.setState(new NoCardState(atm));
            System.out.println("Card ejected. Have nice day ! Thanks for you provision ! Get rich od die trying ! Bank");
        } else if (cash <= 0 ){
            System.out.println("Rejected: Withdraw amount must be positive integer value. " + cash + "  was requested. Shame on you!");
            return;
        } else {
            System.out.println("Rejected: Not enough money in ATM. Max amount to withdraw: " + atm.getCash());
            return;
        }
    }
}
