public class WallPanel {
    private Command lightsOn;
    private Command lightsOff;

    public WallPanel(Command lightsOn, Command lightsOff) {
        this.lightsOn = lightsOn;
        this.lightsOff = lightsOff;
    }

    public void switchLightsOn() {
        this.lightsOn.execute();
    }
    public void switchLightsOff() {
        this.lightsOff.execute();
    }
}
