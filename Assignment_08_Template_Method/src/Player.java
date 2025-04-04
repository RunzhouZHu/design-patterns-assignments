public class Player {
    private final int playerId;
    private int point;

    public Player(int playerId) {
        this.playerId = playerId;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public int getPoint() {
        return point;
    }

    public int getPlayerId() {
        return playerId;
    }
}
