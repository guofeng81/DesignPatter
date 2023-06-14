package observer.pattern;

public class PatternSample {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        subject.attach(new ConcreteObserverOne());
        subject.attach(new ConcreteObserverTwo());
        subject.notifyObserver();
    }
}
