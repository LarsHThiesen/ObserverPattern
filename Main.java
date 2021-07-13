
public class Main {
    public static void main(String[] theArgs) {

        Leser Max = new Leser("Max");
        Leser Lars = new Leser("Lars");
        NewsPaper anAllgemeineZeitung = new NewsPaper();

        // add observer
        anAllgemeineZeitung.AddNewsFeed(Max);
        anAllgemeineZeitung.AddNewsFeed(Lars);

        // etwas passiert
        anAllgemeineZeitung.SetNews("Weltkrieg");

        // notify observer
        anAllgemeineZeitung.NotifyNewsfeeds();
    }
}
