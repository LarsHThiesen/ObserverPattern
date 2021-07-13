import java.util.ArrayList;
import java.util.List;

public class NewsPaper {

    List<Newsfeed> NewsFeedList = new ArrayList<Newsfeed>();

    private String m_News;

    public void SetNews(String theString) {
        m_News = theString;
    }

    public void AddNewsFeed(Newsfeed nf) {
        NewsFeedList.add(nf);
    }

    public void RemoveNewsFeed(Newsfeed nf) {
        NewsFeedList.remove(nf);
    }

    public void NotifyNewsfeeds() {
        for (Newsfeed newsfeed : NewsFeedList) {
            newsfeed.onNotify(this, m_News);
        }
    }
}
