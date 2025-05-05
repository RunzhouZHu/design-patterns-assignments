public class MoveCursorUpCommand implements Command {
    private DrawingSystem drawingSystem;

    public MoveCursorUpCommand(DrawingSystem drawing) {
        this.drawingSystem = drawing;
    }

    @Override
    public void execute() {
        drawingSystem.moveCursorUp();
    }
}
