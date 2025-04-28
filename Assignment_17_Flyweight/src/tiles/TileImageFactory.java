package tiles;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public class TileImageFactory {

    private static final Map<TileType, TileImage> images = new EnumMap<>(TileType.class);

    public static TileImage getTileImage(TileType tileType) {
        TileImage tileImage = images.get(tileType);
        if (tileImage == null) {
            tileImage = switch (tileType) {
                case BUILDING -> new TileImage("building.png", "building tile");
                case FOREST -> new TileImage("forest.png", "forest tile");
                case ROAD -> new TileImage("road.png", "road tile");
                case SWAMP -> new TileImage("swamp.png", "swamp tile");
                case WATER -> new TileImage("water.png", "water tile");
            };
            images.put(tileType, tileImage);
        }
        return tileImage;
    }
}
