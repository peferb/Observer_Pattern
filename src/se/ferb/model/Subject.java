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

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public void removeObserverWithId(String name){
        for (int i = 0; i < observers.size(); i++){
            if (observers.get(i).ID.equals(name))observers.remove(i);
        }
    }
}