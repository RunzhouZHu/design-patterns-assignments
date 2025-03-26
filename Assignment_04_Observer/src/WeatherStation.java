import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WeatherStation {
    private List<Observer> observers = new ArrayList<Observer>();

    private int temperature = 25;

    public int getTemperature() {
        return temperature;
    }

    public void updateTemperature() throws InterruptedException {
        Random rand = new Random();
        boolean tempChange = rand.nextBoolean();
        switch (tempChange) {
            case true:
                temperature += 1;
                break;
            case false:
                temperature -= 1;
                break;
        }
        notifyAllObservers();

        int timeDelay = rand.nextInt(5);
        Thread.sleep(1000 * timeDelay);
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
