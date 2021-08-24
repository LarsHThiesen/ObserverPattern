
// ConcreteSubject
public class ConcreteSubject extends Subject {

    // state could be int, bool, string, ...
    private Object m_State;

    public void SetState(Object theState, Boolean theIsPush) {
        m_State = theState;
        if (theIsPush) {
            // PUSH: send state
            notify(m_State);
        } else {
            // PULL: notify with changed ConcreteSubject
            notify(this);
        }
    }

    // pull current state
    public Object GetState() {
        return m_State;
    }
}
