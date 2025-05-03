public class ControlPanel {
    private Command lightsOn;
    private Command lightsOff;
    private Command curtainUp;
    private Command curtainDown;

    public ControlPanel(Command lightsOn,  Command lightsOff, Command curtainUp, Command curtainDown) {
        this.lightsOn = lightsOn;
        this.lightsOff = lightsOff;
        this.curtainUp = curtainUp;
        this.curtainDown = curtainDown;
    }

    public void switchLightsOn() {
        this.lightsOn.execute();
    }
    public void switchLightsOff() {
        this.lightsOff.execute();
    }
    public void raiseCurtain() {
        this.curtainUp.execute();
    }
    public void lowerCurtain() {
        this.curtainDown.execute();
    }
}
