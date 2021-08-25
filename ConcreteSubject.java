
// ConcreteObservable
public class ConcreteSubject extends Subject {

    // state could be int, bool, string, ...
    private Object m_State;

    public void SetState(Object theState, Boolean theIsPush) {
        m_State = theState;
        if (theIsPush) {
            // Push-Update notiication: send notification about changed state + updated data
            notify(m_State);
        } else {
            // Push notification: send notification about changed state withoug data
            notify(this);
        }
    }

    // pull current data
    public Object GetState() {
        return m_State;
    }
}
