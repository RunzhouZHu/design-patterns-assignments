import java.util.Iterator;

public class FibonacciIterator implements Iterator<Integer> {
    private FibonacciSequence sequence;

    public FibonacciIterator(FibonacciSequence sequence) {
        this.sequence = sequence;
    }

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        int next = sequence.getLast()+ sequence.getSecondToLast();
        sequence.setSecondToLast(sequence.getLast());
        sequence.setLast(next);
        return next;
    }
}
