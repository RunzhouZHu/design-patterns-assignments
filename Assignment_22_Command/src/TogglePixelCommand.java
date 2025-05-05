public class TogglePixelCommand implements Command {
    private DrawingSystem drawingSystem;

    public TogglePixelCommand(DrawingSystem drawingSystem) {
        this.drawingSystem = drawingSystem;
    }

    @Override
    public void execute() {
        drawingSystem.togglePixel();
    }
}
