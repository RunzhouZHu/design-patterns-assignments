import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GameView extends Application {
    private static final int TILE_SIZE = 32;
    private GameController controller =  new GameController();
    private final int CANVAS_WIDTH = controller.getGridWidth() *  TILE_SIZE;
    private final int CANVAS_HEIGHT = controller.getGridHeight() *  TILE_SIZE;

    @Override
    public void start(Stage primaryStage) {
        HBox root = new HBox();

        VBox vbox1 = new VBox();
        Label title = new Label("City Map");
        Canvas canvas1 = new Canvas(CANVAS_WIDTH, CANVAS_HEIGHT);
        GraphicsContext gc1 = canvas1.getGraphicsContext2D();
        controller.generateMap(MapType.CITY_MAP);
        drawTiles(gc1);
        vbox1.getChildren().addAll(title, canvas1);

        VBox vbox2 = new VBox();
        Label title2 = new Label("Wilderness Map");
        Canvas canvas2 = new Canvas(CANVAS_WIDTH, CANVAS_HEIGHT);
        GraphicsContext gc2 = canvas2.getGraphicsContext2D();
        controller.generateMap(MapType.WILDERNESS_MAP);
        drawTiles(gc2);
        vbox2.getChildren().addAll(title2, canvas2);

        root.getChildren().addAll(vbox1, vbox2);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();


    }

    private void drawTiles(GraphicsContext gc) {
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
