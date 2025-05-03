public class CurtainSystem {
    private StatusWindow statusWindow;

    public CurtainSystem(StatusWindow statusWindow) {
        this.statusWindow = statusWindow;
    }

    public void raise() {
        System.out.println("CurtainSystem raised");
        statusWindow.updateCurtainStatus(true);
    }

    public void lower() {
        System.out.println("CurtainSystem lowered");
        statusWindow.updateCurtainStatus(false);
    }

}
