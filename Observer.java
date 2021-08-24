// Observer as an interface -> everyone can be an observer really easy
public interface Observer {

    // is being called from observable/subject
    public void Update(Object theState);
}
