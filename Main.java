public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Wetterstation station1 = new Wetterstation(11);
        Wetterstation station2 = new Wetterstation(22);
        Wetterstation station3 = new Wetterstation(33);

        Wetterstudio nrwStudio = new Wetterstudio(station1);
        Wetterstudio sachsenStudio = new Wetterstudio(station2);
        Wetterstudio bayernStudio = new Wetterstudio(station3);

        station1.addObserver(nrwStudio);
        station1.addObserver(sachsenStudio);
        station1.addObserver(bayernStudio);
       
        station2.addObserver(sachsenStudio);

        station3.addObserver(bayernStudio);

        station1.notifyObserver();
        station2.notifyObserver();
        station3.notifyObserver();

    }
}
