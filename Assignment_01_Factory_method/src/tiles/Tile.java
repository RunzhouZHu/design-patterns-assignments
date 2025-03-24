package tiles;

public abstract class Tile {
    protected String character;
    protected String type;

    public String getCharacter() {
        return character;
    }
    public String getType() {
        return type;
    }
    void action() {}
}
