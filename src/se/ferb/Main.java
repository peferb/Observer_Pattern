package se.ferb;

import se.ferb.model.Subject;
import se.ferb.model.observer.MyFirstObserver;
import se.ferb.model.observer.MyThirdObserver;
import se.ferb.model.observer.Observer;
import se.ferb.model.observer.MySecondObserver;

public class Main {

    public static void main(String[] args) {
        Subject subject = new Subject();

        new MyThirdObserver("The third Observer", subject);
        new MySecondObserver("The second Observer", subject);
        MyFirstObserver myFirstObserver = new MyFirstObserver("myFirstObserver", subject);

        new Observer("On the fly Observer", subject) {
            @Override
            public void update() {
                int state = subject.getState();
                System.out.println("Hey! Subject state is: " + state + ". Oh and almost forgot, they call me: \"" + ID + "\"");
            }
        };

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
        myFirstObserver.stopObserve();
        System.out.println("Third state change: 11");
        subject.setState(11);
        myFirstObserver.resumeObserve();
        System.out.println("Forth state change: 100");
        subject.setState(100);
    }
}
