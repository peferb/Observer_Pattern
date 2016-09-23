package se.ferb.model.observer;


import se.ferb.model.Subject;

public class MyFirstObserver extends Observer {

    public MyFirstObserver(String myName, Subject subject){
        super(myName);
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println(ID + " got notified. Maybe its about the: " + subject.getState());
    }
}