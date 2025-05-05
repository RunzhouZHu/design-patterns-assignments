public class MoveCursorDownCommand implements Command {
    private DrawingSystem drawingSystem;

    public MoveCursorDownCommand(DrawingSystem drawingSystem) {
        this.drawingSystem = drawingSystem;
    }

    @Override
    public void execute() {
        drawingSystem.moveCursorDown();
    }
}
