package proxy.my_battlefield;

public class ProxyDoer extends DoitAbs {

    private RealDoer realDoer;

    @Override
    public int doSomething(int a, int b) {
        System.out.println("Calling proxy");
        if (realDoer == null)
            realDoer = new RealDoer();

        System.out.println("Doing proxy tasks ...");
        if(a < 10 && b > 1000) {
            System.out.println("a or/and b are incorrect. Can't do the real job now");
            return 0;
        }
        return realDoer.doSomething(a, b);
    }
}
