
// ConcreteSubject
public class ConcreteSubject extends Subject {

    // state could be int, bool, object, ...
    private String m_State;

    public void SetState(String theState, Boolean theIsPush) {
        m_State = theState;

        if (theIsPush) {
            // PUSH: notify with state
            super.notify(m_State);
        } else {
            // PULL: notify with concreteSubject
            super.notify(this);

        }
    }

    public String GetState() {
        return m_State;
    }
}
