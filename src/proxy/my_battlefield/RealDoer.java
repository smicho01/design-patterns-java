package proxy.my_battlefield;

public class RealDoer extends DoitAbs {
    @Override
    public int doSomething(int a, int b) {
        System.out.println("I'm read life doer class with params a:" + a + " and b:" + b );
        return a + b;
    }
}
