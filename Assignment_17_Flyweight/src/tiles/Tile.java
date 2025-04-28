package tiles;

public class Tile {
    private final TileImage tileImage;

    public Tile(TileImage tileImage) {
        this.tileImage = tileImage;
    }

    public TileImage getImage() {
        return tileImage;
    }

}
