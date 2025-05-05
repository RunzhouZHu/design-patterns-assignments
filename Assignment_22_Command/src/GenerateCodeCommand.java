public class GenerateCodeCommand implements Command {
    private DrawingSystem drawingSystem;

    public GenerateCodeCommand(DrawingSystem drawingSystem) {
        this.drawingSystem = drawingSystem;
    }

    @Override
    public void execute() {
        drawingSystem.generateCode();
    }
}
