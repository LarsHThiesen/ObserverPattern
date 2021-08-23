import java.rmi.NotBoundException;

public class ConcreteObserver implements Observer {

    // Name to keep observers apart in output
    private String m_Name;
    public ConcreteObserver(String theName) {
        m_Name = theName;
    }

    // PUSH
    @Override
    public void Update(String theState) {
        System.out.println(m_Name + ": " + theState);

    }

    // PULL
    @Override
    public void Update(ConcreteSubject theSubject) {
        System.out.println(m_Name + ": " + theSubject.GetState());

    }

}
