public class Main {
    public static void main(String[] args) {

        // Wetterstation wird mit Name und Initial-Temperatur erstellt
        Wetterstation station1 = new Wetterstation("Deister", 11);
        Wetterstation station2 = new Wetterstation("Harz", 22);
        Wetterstation station3 = new Wetterstation("Hannover", 33);

        // Studios werden erstellt
        Wetterstudio nrwStudio = new Wetterstudio();
        Wetterstudio sachsenStudio = new Wetterstudio();
        Wetterstudio bayernStudio = new Wetterstudio();

        // Studios registrieren sich bei Stationen
        station1.addObserver(nrwStudio);
        station1.addObserver(nrwStudio);
        station1.addObserver(sachsenStudio);
        station1.addObserver(bayernStudio);
        station2.addObserver(sachsenStudio);
        station3.addObserver(bayernStudio);

        // Stationen ändern sich, Studios pullen Temperatur
        station1.setTemperatur(12);
        station2.setTemperatur(25);
        station3.setTemperatur(30);
        station1.setTemperatur(12);
    }
}
