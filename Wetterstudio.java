public class Wetterstudio implements Observer {

    @Override
    public void update(Object object) {
        if (object instanceof Wetterstation) {
            Wetterstation station = (Wetterstation) object;
            System.out.println("Die Temperatur der Wetterstation " + station.getName() + " hat sich auf "
                    + station.getTemperatur() + " Grad Celsius gendert");
        } else {
            System.out.println("Wrong datatype.");
        }
    }
}
