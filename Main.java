
public class Main {
    public static void main(String[] theArgs) {

        // create topics
        ConcreteSubject SportNews = new ConcreteSubject();
        ConcreteSubject PoliticsNews = new ConcreteSubject();

        // create readers
        ConcreteObserver Max = new ConcreteObserver("Max");
        ConcreteObserver Lars = new ConcreteObserver("Lars");

        // add observer to topics
        SportNews.Add(Max);
        PoliticsNews.Add(Lars);

        // state changes
        SportNews.SetState("GOAAL for GERMANY!!", true);
        PoliticsNews.SetState("Merkel decides: Free beer for every goal!", false);
    }
}
