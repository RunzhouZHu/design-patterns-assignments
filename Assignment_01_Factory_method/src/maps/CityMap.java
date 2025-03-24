package maps;

import tiles.*;

import java.util.ArrayList;
import java.util.Random;

public class CityMap extends Map {
    public CityMap(int length, int width) {
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
                        tiles.get(i).add(new RoadTile());
                        break;
                    case 1:
                        tiles.get(i).add(new ForestTile());
                        break;
                    case 2:
                        tiles.get(i).add(new BuildingTile());
                        break;
                }
            }
        }
    }
}
