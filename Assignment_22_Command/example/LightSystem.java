public class LightSystem {
    private StatusWindow statusWindow;

    public LightSystem(StatusWindow statusWindow) {
        this.statusWindow = statusWindow;
    }

    public void on() {
        System.out.println("LightSystem ON");
        statusWindow.updateLightStatus(true);
    }

    public void off() {
        System.out.println("LightSystem OFF");
        statusWindow.updateLightStatus(false);
    }
}
