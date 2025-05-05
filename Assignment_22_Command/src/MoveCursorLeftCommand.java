public class MoveCursorLeftCommand implements Command {
    private DrawingSystem drawingSystem;

    public MoveCursorLeftCommand(DrawingSystem drawingSystem) {
        this.drawingSystem = drawingSystem;
    }


    @Override
    public void execute() {
        drawingSystem.moveCursorLeft();
    }
}
