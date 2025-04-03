public class DiceGame extends Game {
    int numberOfPlayers;

    @Override
    public void initializeGame(int numberOfPlayers) {
        System.out.println("This is a dice game. Players throw the dice and who get the lowest number out.");

        this.numberOfPlayers = numberOfPlayers;
        // name the players
        for (int i = 0; i < numberOfPlayers; i++) {


        }
    }

    @Override
    public boolean endOfGame() {
        return numberOfPlayers == 1;
    }

    @Override
    public void playSingleTurn(int player) {

    }

    @Override
    public void displayWinner() {

    }
}
