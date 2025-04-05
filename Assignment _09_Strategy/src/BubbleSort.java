import java.util.ArrayList;

public class BubbleSort implements SortingStrategy {
    // Bubble sort is a straightforward algorithm
    // By literate the list and adjacent elements if wrong order
    // Until the list is in all right order

    @Override
    public ArrayList<Integer> sort(ArrayList<Integer> list) {
        boolean swapped;
        for (int i = 0; i < list.size() - 1; i++) {
            swapped = false;
            for (int j = 0; j < list.size() - i - 1; j++) {
                if (list.get(j) < list.get(j + 1)) {
                    int temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                    swapped = true;
                }
            }
            // If no elements can be swapped, the list is sorted
            if (!swapped)
                return list;
        }
        return null;
    }
}
