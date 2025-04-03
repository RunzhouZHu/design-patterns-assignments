public class ExpertLevel extends Level {
    public ExpertLevel(Character character) {
        super(character);
    }

    @Override
    void action() {
        String[] options = {"train", "meditate", "fight"};
        switch (this.getCharacter().readPlayerChoice(options)) {
            case 1:
                this.getCharacter().train();
                break;
            case 2:
                this.getCharacter().meditate();
                break;
            case 3:
                this.getCharacter().fight();
                break;
        }

        if (this.getCharacter().getExp() >= 900) {
            this.getCharacter().setLevel(new MasterLevel(this.getCharacter()));
            System.out.println("LEVEL UP! You are now in master level!");
        }
    }
}
