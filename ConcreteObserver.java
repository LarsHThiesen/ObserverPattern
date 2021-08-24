import java.util.List;

public class ConcreteObserver implements Observer {

    // Name to keep observers apart in output
    private String m_Name;
    public ConcreteObserver(String theName) {
        m_Name = theName;
    }

    @Override
    public void Update(Object theState) {

        Object aState;
        String aNewsAnnouncer;

        // state gets PULLed
        if (theState instanceof ConcreteSubject) {
            ConcreteSubject subjectState = (ConcreteSubject) theState;
            aState = subjectState.GetState();
            aNewsAnnouncer = "Pulled news for " + m_Name + ": ";
        }
        // state is PUSHed
        else {
            aState = theState;
            aNewsAnnouncer = "Pushed news for " + m_Name + ": ";
        }

        // progress different state datatypes
        if (aState instanceof String) {
            String stringState = (String) aState;
            System.out.println(aNewsAnnouncer + stringState);
        } else if (aState instanceof Integer) {
            int intState = (int) aState;
            System.out.println(aNewsAnnouncer + "Your lucky number is " + intState);
        } else if (aState instanceof List<?>) {
            List<Integer> listState = (List<Integer>) aState;
            System.out.println(aNewsAnnouncer + "Your lotto numbers are");
            for (Integer integer : listState) {
                System.out.print(integer + " ");
            }
            System.out.println();
        } else {
            System.out.println("Wrong datatype.");
        }
    }
}
