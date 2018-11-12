package behavioral.observer.concreteObserver;

import java.util.Observable;
import java.util.Observer;

public class Screen02 implements Observer {

    public void update(Observable o, Object arg) {
        //act on the update
        System.out.println("atualizou screen 02");
    }
}
