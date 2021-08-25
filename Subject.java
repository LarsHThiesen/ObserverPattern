import java.util.ArrayList;
import java.util.List;

// observable
public abstract class Subject {

    private final List<Observer> m_ObserverList = new ArrayList<Observer>();

    public void Add(Observer theObserver) {
        m_ObserverList.add(theObserver);
    }

    public void Remove(Observer theObserver) {
        m_ObserverList.remove(theObserver);
    }

    // Push-Update notification: send data directly with changed state
    // Push notiication: notify about changes and let observer pull data
    protected void notify(Object theState) {
        for (Observer observer : m_ObserverList) {
            observer.Update(theState);
        }
    }

    public abstract void SetState(Object theState, Boolean theIsPush);

    public abstract Object GetState();
}
