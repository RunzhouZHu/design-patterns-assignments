public abstract class Handler {

    private Handler next;

    public void handle(Message message) {
        if (next != null) {
            next.handle(message);
        }
    }
    public void setNext(Handler next) {
        this.next = next;
    }
}
