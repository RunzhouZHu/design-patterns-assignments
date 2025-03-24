package maps;

import tiles.Tile;

import java.util.ArrayList;
import java.util.List;

public abstract class Map {
    protected int length;
    protected int width;
    protected List<List<Tile>> tiles = new ArrayList<List<Tile>>();

    void createTile() {}

    public void display() {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(tiles.get(i).get(j).getCharacter());
            }
            System.out.println();
        }
    }

    public Map(int length, int width) {
        this.length = length;
        this.width = width;
        this.createTile();
    }
}
