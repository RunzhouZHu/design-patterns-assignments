package maps;

import tiles.*;

import java.util.ArrayList;
import java.util.Random;

public class WildernessMap extends Map {
    public WildernessMap(int length, int width) {
        super(length, width);
        this.createTile();
    }

    @Override
    public void createTile() {
        Random rand = new Random();
        for (int i = 0; i < width; i++) {
            tiles.add(new ArrayList<Tile>());
            for (int j = 0; j < length; j++) {
                int x = rand.nextInt(3);
                switch (x) {
                    case 0:
                        tiles.get(i).add(new SwampTile());
                        break;
                    case 1:
                        tiles.get(i).add(new WaterTile());
                        break;
                    case 2:
                        tiles.get(i).add(new ForestTile());
                        break;
                }
            }
        }
    }
}
