package behavioral.observer;

import behavioral.observer.concreteObserver.Screen01;
import behavioral.observer.concreteObserver.Screen02;
import behavioral.observer.concreteSubject.DataStore;

public class Main {
    public static void main(String[] args) {
        Screen01 screen01 = new Screen01();
        Screen02 screen02 = new Screen02();
        DataStore dataStore = new DataStore();

        // register observer
        dataStore.addObserver(screen01);
        dataStore.addObserver(screen02);

        dataStore.notifyObservers();  // nao acontece nada pois nao houve mudancas;
        System.out.println(dataStore.hasChanged());

        dataStore.setData("Pedro");
        System.out.println(dataStore.hasChanged());

        dataStore.notifyObservers(); // executa as acoes do concrete observer pois houve mudanca;
    }
}
