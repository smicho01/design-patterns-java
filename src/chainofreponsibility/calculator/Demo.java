package chainofreponsibility.calculator;

import chainofreponsibility.calculator.actual_chain_el.AddNumbers;
import chainofreponsibility.calculator.actual_chain_el.DivNumbers;
import chainofreponsibility.calculator.actual_chain_el.MulNumbers;
import chainofreponsibility.calculator.actual_chain_el.SubtractNumbers;

public class Demo {
    public static void main(String[] args) {
        Chain addCalc = new AddNumbers();
        Chain subCalc = new SubtractNumbers();
        Chain multCalc = new MulNumbers();
        Chain divCalc = new DivNumbers();

        addCalc.setNextChain(subCalc);
        subCalc.setNextChain(multCalc);
        multCalc.setNextChain(divCalc);

        Numbers request = new Numbers(4,2,"add");
        addCalc.calculate(request);

        request = new Numbers(7,8, "mul");
        addCalc.calculate(request);
    }
}
