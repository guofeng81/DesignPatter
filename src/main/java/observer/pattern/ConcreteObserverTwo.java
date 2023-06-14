package observer.pattern;

public class ConcreteObserverTwo implements Observer{
    @Override
    public void update() {
        System.out.println("Observer two receives the message.");
    }
}
