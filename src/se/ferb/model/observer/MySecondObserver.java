package se.ferb.model.observer;

import se.ferb.model.Subject;

public class MySecondObserver extends Observer{

    public MySecondObserver(String myName, Subject subject){
        super(myName);
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println(ID + " got told about new state. New state is: " + subject.getState());
    }
}