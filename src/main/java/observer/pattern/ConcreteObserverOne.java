package observer.pattern;

public class ConcreteObserverOne implements Observer{
    @Override
    public void update() {
        System.out.println("Observer One receive the message.");
    }
}
