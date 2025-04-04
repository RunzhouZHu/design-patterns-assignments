import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DiceGame extends Game {
    int numberOfPlayers;
    List<Player> players = new ArrayList<>();

    @Override
    public void initializeGame(int numberOfPlayers) {
        System.out.println("This is a dice game. Players throw the dice and who get the lowest number out.");

        this.numberOfPlayers = numberOfPlayers;
        // name the players
        for (int i = 0; i < numberOfPlayers; i++) {
            players.add(new Player(i));
        }
    }

    @Override
    public boolean endOfGame() {
        return players.size() == 1;
    }

    @Override
    public void playSingleTurn(int player) {
        // every one roll the dice
        System.out.println("Every one roll the dice: ");
        Random rand = new Random();
        for (Player p : players) {
            int dice = rand.nextInt(6) + 1;
            p.setPoint(dice);
            System.out.println("Player " +p.getPlayerId() + " played the dice of " + dice);
        }

        // find the one who get the lowest point
        int lowest_player_id = 0;
        for (int i = 0; i < players.size(); i++) {
            if (players.get(i).getPoint() < players.get(lowest_player_id).getPoint()) {
                lowest_player_id = i;
            }
        }

        // out the lowest point player
        players.remove(lowest_player_id);
        System.out.println("Player " + lowest_player_id + " get the lowest point and out!");
    }

    @Override
    public void displayWinner() {
        System.out.println("The winner is " + players.getFirst().getPlayerId());
    }
}
