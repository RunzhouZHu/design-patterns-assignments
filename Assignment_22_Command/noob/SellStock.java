package noob;

public class SellStock implements Order{
    private Stock abcstock;

    public SellStock(Stock abcstock) {
        this.abcstock = abcstock;
    }

    public void execute() {
        abcstock.sell();
    }
}
