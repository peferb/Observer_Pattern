package se.ferb.model.observer;

import se.ferb.model.Subject;

public class MyThirdObserver extends Observer{

    public MyThirdObserver(String observerId, Subject subject){
        super(observerId, subject);
    }

    @Override
    public void update() {
        System.out.println(ID + " got the update");
    }
}