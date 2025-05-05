import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class GUI extends Application {
    private static final int REC_SIZE = 30;
    private final DrawingSystem drawingSystem = new DrawingSystem(this);
    private final int CANVAS_WIDTH = drawingSystem.getPixelCanvaWidth() * REC_SIZE;
    private final int CANVAS_HEIGHT = drawingSystem.getPixelCanvaHeight() * REC_SIZE;

    private final Canvas canvas = new Canvas(CANVAS_WIDTH, CANVAS_HEIGHT);
    private final GraphicsContext gc = canvas.getGraphicsContext2D();


    @Override
    public void start(Stage stage) {
        // Command
        Command moveCursorUp = new MoveCursorUpCommand(drawingSystem);
        Command moveCursorDown = new MoveCursorDownCommand(drawingSystem);
        Command moveCursorLeft = new MoveCursorLeftCommand(drawingSystem);
        Command moveCursorRight = new MoveCursorRightCommand(drawingSystem);
        Command togglePixel = new TogglePixelCommand(drawingSystem);
        Command generateCode = new GenerateCodeCommand(drawingSystem);

        ControlPane controlPane = new ControlPane(moveCursorUp, moveCursorDown, moveCursorLeft, moveCursorRight, togglePixel, generateCode);

        VBox root = new VBox();
        Button button = new Button("Generate Code");
        button.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.UP) {
                controlPane.setMoveCursorUp();
            }
            if (e.getCode() == KeyCode.DOWN) {
                controlPane.setMoveCursorDown();
            }
            if (e.getCode() == KeyCode.LEFT) {
                controlPane.setMoveCursorLeft();
            }
            if (e.getCode() == KeyCode.RIGHT) {
                controlPane.setMoveCursorRight();
            }
            if (e.getCode() == KeyCode.SPACE) {
                controlPane.setTogglePixel();
            }
        });
        button.setOnMouseClicked(e -> {
            controlPane.setGenerateCode();
        });

        root.getChildren().add(button);
        root.getChildren().add(canvas);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    //
    public void draw() {
        gc.clearRect(0, 0, CANVAS_WIDTH, CANVAS_HEIGHT);
        gc.setFill(Color.AQUA);
        gc.fillRect(drawingSystem.getCursorX() * REC_SIZE, drawingSystem.getCursorY() * REC_SIZE, REC_SIZE, REC_SIZE);

        for (int i = 0; i < drawingSystem.getPixelCanvaWidth(); i++) {
            for (int j = 0; j < drawingSystem.getPixelCanvaHeight(); j++) {
                if (drawingSystem.getRect(i, j) == 1) {
                    gc.setFill(Color.BLACK);
                    gc.fillRect(i * REC_SIZE, j * REC_SIZE, REC_SIZE, REC_SIZE);

                    if (drawingSystem.getCursorX() == i && drawingSystem.getCursorY() == j) {
                        gc.setFill(Color.BLUE);
                    } else {
                        gc.setFill(Color.AQUA);
                    }
                    gc.fillRect(drawingSystem.getCursorX() * REC_SIZE, drawingSystem.getCursorY() * REC_SIZE, REC_SIZE, REC_SIZE);
                }
            }
        }

    }

    public static void main(String[] args) {
        launch(args);
    }
}
