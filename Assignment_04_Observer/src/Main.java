public class Main {
    public static void main(String[] args) throws InterruptedException {
        WeatherStation weatherStation = new WeatherStation();

        new TemperatureObserver(weatherStation);
        new MoistureObserver(weatherStation);

        while (true) {
            weatherStation.updateTemperature();
        }

    }
}
