import java.util.ArrayList;

public class Wetterstation extends Object implements Observable {

    private String name;
    private int temperatur;
    private ArrayList<Observer> observers;

    // constructor mit Name und Temperatur
    public Wetterstation(String name, int temperatur) {
        this.name = name;
        this.temperatur = temperatur;
        observers = new ArrayList<Observer>();
    }

    @Override
    public void addObserver(Observer obs) {
        observers.add(obs);
    }

    @Override
    public void removeObserver(Observer obs) {
        observers.remove(obs);
    }

    // pull method needs observable for the pull
    @Override
    public void notifyObserver() {
        for (Observer obs : observers) {
            obs.update(this);
        }
    }

    // getter für Temperatur
    public int getTemperatur() {
        return temperatur;
    }

    // setter für Temperatur benachrichtigt Observer
    public void setTemperatur(int temperatur) {
        // verhindert spam
        if (this.temperatur != temperatur) {
            this.temperatur = temperatur;
            notifyObserver();
        }
    }

    // getter für Name
    public String getName(){
        return name;
    }

}
