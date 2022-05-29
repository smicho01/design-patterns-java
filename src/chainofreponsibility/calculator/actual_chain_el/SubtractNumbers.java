package chainofreponsibility.calculator.actual_chain_el;

import chainofreponsibility.calculator.Chain;
import chainofreponsibility.calculator.Numbers;

public class SubtractNumbers implements Chain {
    private Chain nextInChain;

    @Override
    public void setNextChain(Chain nextChain) {
        this.nextInChain = nextChain;
    }

    @Override
    public void calculate(Numbers request) {
        if ("sub".equals(request.getCalculationWanted())) {
            System.out.println(request.getNum1() + " - " + request.getNum2() + " = " + (request.getNum1() - request.getNum2()));
        } else {
            System.out.println("\tSubtractNumbers::Can't handle request, passing it to the next in chain ...");
            nextInChain.calculate(request);
        }
    }
}
