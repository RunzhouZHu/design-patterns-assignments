public abstract class Level {
    private Character character;

    public Level(Character character) {
        this.character = character;
    }

    public Character getCharacter() {
        return character;
    }

    abstract void action();

}
