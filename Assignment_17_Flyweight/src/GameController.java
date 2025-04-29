import javafx.scene.image.Image;
import tiles.Tile;
import tiles.TileImageFactory;
import tiles.TileType;

import java.util.Random;

public class GameController {
    private static final int GRID_WIDTH = 10;
    private static final int GRID_HEIGHT = 10;
    private Tile[][] tiles;

    public void generateMap(MapType mapType) {
        tiles = new Tile[GRID_WIDTH][GRID_HEIGHT];
        Random rand = new Random();
        switch (mapType) {
            case CITY_MAP:
                for (int i = 0; i < GRID_WIDTH; i++) {
                    for (int j = 0; j < GRID_HEIGHT; j++) {
                        int x = rand.nextInt(3);
                        switch (x) {
                            case 0 -> tiles[i][j] = new Tile(TileImageFactory.getTileImage(TileType.ROAD));
                            case 1 -> tiles[i][j] = new Tile(TileImageFactory.getTileImage(TileType.FOREST));
                            case 2 -> tiles[i][j] = new Tile(TileImageFactory.getTileImage(TileType.BUILDING));
                        }
                    }
                }
                break;
            case WILDERNESS_MAP:
                for (int i = 0; i < GRID_WIDTH; i++) {
                    for (int j = 0; j < GRID_HEIGHT; j++) {
                        int x = rand.nextInt(3);
                        switch (x) {
                            case 0 -> tiles[i][j] = new Tile(TileImageFactory.getTileImage(TileType.SWAMP));
                            case 1 -> tiles[i][j] = new Tile(TileImageFactory.getTileImage(TileType.WATER));
                            case 2 -> tiles[i][j] = new Tile(TileImageFactory.getTileImage(TileType.FOREST));
                        }
                    }
                }
                break;
        }
    }

    public Image getTileImage(int row, int col) {
        Tile tile = tiles[row][col];
        return tile.getImage().getImage();
    }

    public int getGridWidth() {
        return GRID_WIDTH;
    }
    public int getGridHeight() {
        return GRID_HEIGHT;
    }
}
