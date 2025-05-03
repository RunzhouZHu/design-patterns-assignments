public class MoveCursorUpCommand implements Command {
    private DrawingSystem drawing;

    public MoveCursorUpCommand(DrawingSystem drawing) {
        this.drawing = drawing;
    }

    @Override
    public void execute() {
        drawing.moveCursorUp();
    }
}
