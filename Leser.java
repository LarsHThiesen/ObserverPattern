public class Leser implements Newsfeed {

    private String m_Name;

    public Leser(String name) {
        m_Name = name;
    }

    @Override
    public void onNotify(NewsPaper np, Object arg) {

        if (arg instanceof String) {
            System.out.println(np + ": " + (String) arg);
        }

    }

    @Override
    public String toString() {
        return m_Name;
    }

}
