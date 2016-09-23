package se.ferb.model;

import se.ferb.model.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> observers = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attachObserver(Observer observer){
        observers.add(observer);
    }

    private void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public void removeObserverWithId(String id){
        for (int i = 0; i < observers.size(); i++){
            if (observers.get(i).ID.equals(id))observers.remove(i);
        }
    }
}