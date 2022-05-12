package proxy.my_battlefield;

public class Main {

    public static void main(String[] args) {
        ProxyDoer proxy = new ProxyDoer();
        proxy.doSomething(2, 9000);

        // now shoudl be ok
        proxy.doSomething(2, 30);
    }
}
