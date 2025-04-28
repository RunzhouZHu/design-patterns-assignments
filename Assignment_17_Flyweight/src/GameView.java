import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class GameView extends Application {
    private static final int TILE_SIZE = 32;
    private GameController controller =  new GameController();
    private final int CANVAS_WIDTH = controller.getGridWidth() *  TILE_SIZE;
    private final int CANVAS_HEIGHT = controller.getGridHeight() *  TILE_SIZE;
    private Canvas canvas = new Canvas(CANVAS_WIDTH, CANVAS_HEIGHT);
    private GraphicsContext gc = canvas.getGraphicsContext2D();

    @Override
    public void start(Stage primaryStage) {
        StackPane root = new StackPane();
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();

        controller.generateMap(MapType.WILDERNESS_MAP);
        drawTiles();
    }

    private void drawTiles() {
        gc.clearRect(0, 0, CANVAS_WIDTH, CANVAS_HEIGHT);
        for (int i = 0; i < controller.getGridHeight(); i++) {
            for (int j = 0; j < controller.getGridWidth(); j++) {
                Image imageToDraw = controller.getTileImage(i, j);
                gc.drawImage(imageToDraw, j * TILE_SIZE, i * TILE_SIZE, TILE_SIZE, TILE_SIZE);
            }
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

}
