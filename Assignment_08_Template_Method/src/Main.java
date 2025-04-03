public class Main {
    public static void main(String[] args) {

        int numberOfPlayers = 5;
        int playerInTurn = 0;
        while (true) {
            playerInTurn = ++playerInTurn % numberOfPlayers;
            System.out.println(playerInTurn);
        }
    }
}