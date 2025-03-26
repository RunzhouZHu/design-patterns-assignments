public class MoistureObserver extends Observer {

    public MoistureObserver(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        this.weatherStation.attach(this);
    }

    @Override
    public void update() {
        System.out.println("MoistureObserver update: " + weatherStation.getTemperature());
        System.out.println("Moisture is 30%");
    }
}
