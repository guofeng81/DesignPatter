package observer.pattern;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ConcreteSubject implements Subject {
    private List<Observer> observers;

    @Override
    public void attach(Observer observer) {
        if (observers == null) {
            observers = new ArrayList<>();
        }
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        if(observer != null){
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
