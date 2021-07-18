public class Wetterstudio implements Observer {

    Wetterstation wetterstation;

    public Wetterstudio (Wetterstation wetterstation) {
        this.wetterstation = wetterstation;
    }

    @Override
    public void update() {
        System.out.println("Die Temperatur der Wetterstation hat sich auf " 
            +  wetterstation.getTemperatur() 
            + " Grad Celsius geandert"
        );
    }
    
}
