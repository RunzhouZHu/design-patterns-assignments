package example;

import java.util.Iterator;

public class RingIterator implements Iterator<Integer> {
    private Node current;

    public RingIterator(Ring ring) {
        this.current = ring.getHead();
    }

    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public Integer next() {
        int data = this.current.getData();
        this.current = this.current.getNext();
        return data;
    }

}
