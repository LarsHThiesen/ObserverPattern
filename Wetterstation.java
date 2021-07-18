import java.util.ArrayList;

public class Wetterstation implements Observable {

    private int temperatur;
    private ArrayList<Observer> observers;

    public Wetterstation(int temperatur) {
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

    @Override
    public void notifyObserver() {
        for(Observer obs : observers){
            obs.update();
        }
    }

    public int getTemperatur(){
        return temperatur;
    }

    public void setTemperatur(int temperatur) {
        this.temperatur = temperatur;
    }
    
}   
