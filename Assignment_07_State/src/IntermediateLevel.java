public class IntermediateLevel extends Level {

    public IntermediateLevel(Character character) {
        super(character);
    }

    @Override
    void action() {
        String[] options = {"train", "meditate"};
        switch (this.getCharacter().readPlayerChoice(options)) {
            case 1:
                this.getCharacter().train();
                break;
            case 2:
                this.getCharacter().meditate();
                break;
        }

        if (this.getCharacter().getExp() >= 600) {
            this.getCharacter().setLevel(new ExpertLevel(this.getCharacter()));
            System.out.println("LEVEL UP! You are now in expert level!");
        }
    }
}
