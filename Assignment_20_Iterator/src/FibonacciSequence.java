import java.util.Iterator;

public class FibonacciSequence implements Sequence{
    private int secondToLast;
    private int last;

    public FibonacciSequence() {
        this.secondToLast = 1;
        this.last = 1;
    }

    public int getSecondToLast() {
        return secondToLast;
    }
    public void setSecondToLast(int secondToLast) {
        this.secondToLast = secondToLast;
    }
    public int getLast() {
        return last;
    }
    public void setLast(int last) {
        this.last = last;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new FibonacciIterator(this);
    }
}
