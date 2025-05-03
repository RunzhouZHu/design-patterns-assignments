import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GUI extends Application {
    private static final int REC_SIZE = 30;
    private final DrawingSystem drawingSystem = new DrawingSystem(this);
    private final int CANVAS_WIDTH = drawingSystem.getPixelCanvaWidth() * REC_SIZE;
    private final int CANVAS_HEIGHT = drawingSystem.getPixelCanvaHeight() * REC_SIZE;
    private int cursor_x = 0;
    private int cursor_y = 0;

    @Override
    public void start(Stage stage) {

        VBox root = new VBox();
        Canvas canvas = new Canvas(CANVAS_WIDTH, CANVAS_HEIGHT);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        draw(gc, cursor_x, cursor_y);
        root.getChildren().add(canvas);

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void moveCursorUp() {
        if (cursor_y >= 0) {
            cursor_y -= 1;
        }
    }

    public void moveCursorDown() {
        if (cursor_y >= drawingSystem.getPixelCanvaHeight()) {
            cursor_y += 1;
        }
    }

    //
    private void draw(GraphicsContext gc, int x, int y) {
        gc.fillRect(x * REC_SIZE, y * REC_SIZE, REC_SIZE, REC_SIZE);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
