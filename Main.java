import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] theArgs) {

        // create topics
        ConcreteSubject SportNews = new ConcreteSubject();
        ConcreteSubject PoliticsNews = new ConcreteSubject();
        ConcreteSubject DailyNumber = new ConcreteSubject();
        ConcreteSubject LottoNews = new ConcreteSubject();

        // create readers
        ConcreteObserver Max = new ConcreteObserver("Max");
        ConcreteObserver Lars = new ConcreteObserver("Lars");

        // add observer to topics
        SportNews.Add(Max);
        PoliticsNews.Add(Lars);
        DailyNumber.Add(Lars);
        LottoNews.Add(Max);

        // state changes
        SportNews.SetState("GOAAL for GERMANY!!", true);
        PoliticsNews.SetState("Merkel decides: Free beer for every goal!", false);
        DailyNumber.SetState(11, false);
        LottoNews.SetState(new ArrayList<Integer>(List.of(11, 21, 31, 4, 15)), true);
    }
}
