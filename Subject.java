import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

    private final List<Observer> m_ObserverList = new ArrayList<Observer>();

    public void Add(Observer theObserver) {
        m_ObserverList.add(theObserver);
    }

    public void Remove(Observer theObserver) {
        m_ObserverList.remove(theObserver);
    }

    // PUSH: send state directly with notification
    protected void notify(String theState) {
        for (Observer observer : m_ObserverList) {
            observer.Update(theState);
        }
    }

    // PULL: notify with concreteSubject and let observer pull state
    protected void notify(ConcreteSubject theConcreteSubject) {
        for (Observer observer : m_ObserverList) {
            observer.Update(theConcreteSubject);
        }
    }

    public abstract void SetState(String theState, Boolean theIsPush);

    public abstract String GetState();
}
