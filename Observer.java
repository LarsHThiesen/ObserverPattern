
// Observer as an interface -> everyone can be an observer really easy
public interface Observer {

    // PUSH
    public void Update(String theState);

    // PULL
    public void Update(ConcreteSubject theSubject);

}
