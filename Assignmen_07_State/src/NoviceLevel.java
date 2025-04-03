public class NoviceLevel extends Level {

    public NoviceLevel(Character character) {
        super(character);
    }

    @Override
    void action() {
        String[] options = {"train"};
        switch (this.getCharacter().readPlayerChoice(options)) {
            case 1:
                this.getCharacter().train();
        }

        if (this.getCharacter().getExp() >= 300) {
            this.getCharacter().setLevel(new IntermediateLevel(this.getCharacter()));
            System.out.println("LEVEL UP! You are now in intermediate level!");
        }
    }
}
