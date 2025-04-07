import java.util.ArrayList;

public class SortContext {

    private SortingStrategy sortingStrategy;

    public SortContext(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public void setSortingStrategy(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public ArrayList<Integer> sortList(ArrayList<Integer> list) {
        return sortingStrategy.sort(list);
    }

}
