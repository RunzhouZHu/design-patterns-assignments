package example;

public class LivingRoomLights implements Lights {
    @Override
    public void turnOn() {
        System.out.println("Living room lights turn on");
    }

    @Override
    public void turnOff() {
        System.out.println("Living room lights turn off");
    }
}
