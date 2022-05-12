package proxy.example1.proxyclasses;

import proxy.example1.originalclasses.ConcreteSubject;
import proxy.example1.originalclasses.Subject;

public class Proxy extends Subject  {

    ConcreteSubject concreteSubject;

    @Override
    public void doSomeWork() {
        System.out.println("Proxy call here ...");
        if(concreteSubject == null) {
            concreteSubject = new ConcreteSubject();
        }
        concreteSubject.doSomeWork();
    }
}
