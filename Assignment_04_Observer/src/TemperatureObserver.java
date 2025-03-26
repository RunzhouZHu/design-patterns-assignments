public class TemperatureObserver extends Observer {

    public TemperatureObserver(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        this.weatherStation.attach(this);
    }

    @Override
    public void update() {
        System.out.println("TemperatureObserver update: " + weatherStation.getTemperature());
    }
}
