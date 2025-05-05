public class MoveCursorRightCommand implements Command {
    private DrawingSystem drawingSystem;

    public MoveCursorRightCommand(DrawingSystem drawingSystem) {
        this.drawingSystem = drawingSystem;
    }


    @Override
    public void execute() {
        drawingSystem.moveCursorRight();
    }
}
