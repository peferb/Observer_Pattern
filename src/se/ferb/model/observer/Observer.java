package se.ferb.model.observer;

import se.ferb.model.Subject;

public abstract class Observer {
    protected Subject subject;
    public final String ID;

    public Observer(String uniqueId) {
        ID = uniqueId;
    }

    public Observer(String uniqueId, Subject subject) {
        ID = uniqueId;
        this.subject = subject;
        this.subject.attachObserver(this);
    }

    public abstract void update();

    public void stopObserve() {
        subject.removeObserverWithId(ID);
    }

    public void resumeObserve() {
        this.subject.attachObserver(this);
    }
}