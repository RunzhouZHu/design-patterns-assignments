import java.util.ArrayList;

public class HeapSort implements SortingStrategy {
    // Heap sort first finds the max or min element and put it to
    // the first or last of the list, and repeat the same process
    // for the remaining list

    @Override
    public ArrayList<Integer> sort(ArrayList<Integer> list) {
        int n = list.size();

        for (int i = n / 2; i >= 0; i--) {
            heapify(list, i);
        }

        for (int i = n - 1; i >= 0; i--) {
            int temp = list.getFirst();
            list.set(0, list.get(i));
            list.set(i, temp);
        }

        return list;

    }

    private void heapify(ArrayList<Integer> list, int i) {

        int largest = i;

        int l = 2 * i + 1;

        int r = 2 * i + 2;

        if (l < list.size() && list.get(l) < list.get(largest)) {
            largest = l;
        }

        if (r < list.size() && list.get(r) < list.get(largest)) {
            largest = r;
        }

        if (largest != i) {
            int temp = list.get(i);
            list.set(i, list.get(largest));
            list.set(largest, temp);

            heapify(list, largest);
        }
    }
}
